package com.kitri.fpgw.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kitri.fpgw.model.BoardTextMainDto;
import com.kitri.fpgw.model.CodeManageDto;
import com.kitri.fpgw.model.DepartDto;
import com.kitri.fpgw.model.LogHistoryDto;
import com.kitri.fpgw.model.MenuDto;
import com.kitri.fpgw.model.ScheduleDto;
import com.kitri.fpgw.model.UserDetaileDto;
import com.kitri.fpgw.model.UserDto;
import com.kitri.fpgw.model.UserImageDto;
import com.kitri.fpgw.model.UserMainDto;
import com.kitri.fpgw.service.MainService;
import com.kitri.fpgw.service.ScheduleService;

@Controller
@RequestMapping(value="/main")
public class MainController {

	@Autowired
	private MainService MainService;

	@Autowired
	private ScheduleService ScheduleService;
	
	
	@RequestMapping(value="/index.html")
	public String Index(){
		
		return "index";
	}
	
	@RequestMapping(value="/default.html")
	public ModelAndView Default(HttpSession session) throws Exception{
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("jsp/main/default");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();
		String ymd = sdf.format(date);
		
		UserMainDto userMainDto = (UserMainDto) session.getAttribute("userInfo");
		
		if(userMainDto.getStrCode() != null){
			
			mav = MainSelectInfomation(userMainDto.getStrCode(), ymd, "jsp/main/default");
		}
		
		
		return mav;
	}
	
	@RequestMapping(value="/login.html")
	public ModelAndView Login(String id, String pwd, HttpSession session) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();
		String ymd = sdf.format(date);
		
		UserMainDto userIn = new UserMainDto();
		userIn.setStrID(id);
		userIn.setStrPWD(pwd);
				
		UserMainDto userOut = MainService.LogIn(userIn);
				
		
		if(userOut == null){
			
			session.setAttribute("success", "failed");
			mav.setViewName("index");
		} else {
			
			session.setMaxInactiveInterval(84500);
			/*�α��� ���*/			
			LogHistoryDto LogHistoryDto = new LogHistoryDto();
			LogHistoryDto.setStrLog_Ymd(ymd);
			LogHistoryDto.setStrUser_Cd(userOut.getStrCode());
			LogHistoryDto.setStrLog_Cd("001");
			MainService.LogCheck(LogHistoryDto);
			
			/*===== ���� ���� =====*/
			/*����� ����*/
			session.setAttribute("success", "ok");
			session.setAttribute("userInfo", userOut);			
			UserDetaileDto userDetailInfo = MainService.UserDetailSelect(userOut.getStrCode());
			session.setAttribute("userDetailInfo", userDetailInfo);
			UserImageDto userImageInfo = MainService.UserImageSelect(userOut.getStrCode());
			session.setAttribute("userImageInfo", userImageInfo);
			
			/*��ü �����*/
			ArrayList<UserDto> allUser = MainService.UserListAll(userOut.getStrCode(), 0);
			session.setAttribute("allUser", allUser);
			
			/*�μ� ����*/
			ArrayList<DepartDto> DepartList = MainService.DepartListAll();
			session.setAttribute("DepartList", DepartList);
			ArrayList<UserDto> DepartUserList = MainService.UserListAll(userOut.getStrCode(), 1);
			session.setAttribute("DepartUserList", DepartUserList);
			
			
						
			/*��������*/
			ArrayList<CodeManageDto> BCode = MainService.CodeManageBCodeGroupSelectAll();
			session.setAttribute("BCode", BCode);
			
			int len = BCode.size();
			for(int i = 0; i < len; i++){
				
				CodeManageDto bcodeDto = BCode.get(i);
								
				ArrayList<CodeManageDto> SCode = MainService.CodeManageSelectBCode(bcodeDto.getStrBCode());
								
				session.setAttribute(bcodeDto.getStrValue4(), SCode);
			}
			
			
			
			//�޴�����
			ArrayList<MenuDto> listMenu = MainService.MenuSelectAll();
			session.setAttribute("menu", listMenu);
			
			
			mav = MainSelectInfomation(userOut.getStrCode(), ymd, "jsp/main/default");
		}
		
		return mav;
	}
	
	@RequestMapping(value="logout.html")
	public String LogOut(HttpSession session) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();
		String ymd = sdf.format(date);
		
		UserMainDto userIn = (UserMainDto) session.getAttribute("userInfo");

		/*�α׾ƿ� ���*/			
		LogHistoryDto LogHistoryDto = new LogHistoryDto();
		LogHistoryDto.setStrLog_Ymd(ymd);
		LogHistoryDto.setStrUser_Cd(userIn.getStrCode());
		LogHistoryDto.setStrLog_Cd("002");
		MainService.LogCheck(LogHistoryDto);

		//��������		
		ArrayList<CodeManageDto> BCode = (ArrayList<CodeManageDto>) session.getAttribute("BCode");
		session.removeAttribute("BCode");

		int len = BCode.size();
		
		for(int i = 0; i < len; i++){

			CodeManageDto bcodeDto = BCode.get(i);
			session.removeAttribute(bcodeDto.getStrValue4());
		}
		
		session.removeAttribute("success");
		session.removeAttribute("userInfo");
		session.removeAttribute("userDetailInfo");
		session.removeAttribute("userImageInfo");
		session.removeAttribute("allUser");
		session.removeAttribute("DepartList");
		session.removeAttribute("menu");
		
		return "index";
	}
	
	private ModelAndView MainSelectInfomation(String strUserCode, String strToDay, String strPath) throws Exception{
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName(strPath);
		
		//���� ����
		ScheduleDto scheduleDto = new ScheduleDto();
		scheduleDto.setStrUser(strUserCode);
		scheduleDto.setStrSearchStartDate(strToDay);
		scheduleDto.setStrSearchEndDate(strToDay);
		ArrayList<ScheduleDto> ToDaySchedule = ScheduleService.ScheduleSelectAll(scheduleDto);
		
		mav.addObject("ToDaySchedule", ToDaySchedule);
		
		//�Խ��� ����
		ArrayList<BoardTextMainDto> listBoard = MainService.BoardListAll();
		mav.addObject("listBoard", listBoard);
		
		return mav;
	}
}
