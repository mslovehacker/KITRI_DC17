package com.kitri.fpgw.controller;

import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.kitri.fpgw.model.BoardTextCommentDto;
import com.kitri.fpgw.model.BoardTextMainDto;
import com.kitri.fpgw.model.BoardTextViewDto;
import com.kitri.fpgw.service.BoardService;

@Controller
@RequestMapping(value="/board")
public class BoardController {

	@Autowired
	BoardService boardService;
	
	@RequestMapping(value="/allnoticelist.html")
	public ModelAndView BoardTextSelectAll(String strGroup, String strKind) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("jsp/board/allnoticelist");
		
		BoardTextMainDto boardTextMainDto = new BoardTextMainDto();
		boardTextMainDto.setStrGroup_Cd(strGroup);
		boardTextMainDto.setStrKind_Cd(strKind);
		
		ArrayList<BoardTextMainDto> list = boardService.BoardTextSelectAll(boardTextMainDto);
		mav.addObject("list", list);
		
		return mav;
		
	}
	
	@RequestMapping(value="/noticeselect.html")
	public ModelAndView BoardTextSelect(int intSeq, String strGroup, String strKind, String strGetUser, String strViewUser) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("jsp/board/allnoticemodify");
		
		BoardTextMainDto boardTextMainDto = null;
		if(intSeq > 0){
			
			boardTextMainDto = boardService.BoardTextSelect(intSeq);
			
			
			if(strGetUser.equals(strViewUser)){
				
				
			} else {
				
				BoardTextViewDto boardTextViewDto = new BoardTextViewDto();
				boardTextViewDto.setIntBmSeq(intSeq);
				boardTextViewDto.setStrGet_User_Cd(strViewUser);
				
				boardService.BoardTextView(boardTextViewDto);
			}
			
			ArrayList<BoardTextCommentDto> arrayComment = boardService.BoardTextCommentList(intSeq);
			boardTextMainDto.setArrayComment(arrayComment);
		}
		
		mav.addObject("board", boardTextMainDto);
		mav.addObject("strGroup", strGroup);
		mav.addObject("strKind", strKind);
		mav.addObject("strGetUser", strGetUser);
		mav.addObject("strViewUser", strViewUser);
		
		return mav;
		
	}
	
	@RequestMapping(value="/noticeinsert.html")
	public ModelAndView BoardTextInsert(BoardTextMainDto boardTextMainDto) throws Exception {
		
		boardService.BoardTextInsert(boardTextMainDto);

		return BoardTextSelecListAll(boardTextMainDto.getStrGroup_Cd(), boardTextMainDto.getStrKind_Cd());
	}
	
	@RequestMapping(value="/noticemodify.html")
	public ModelAndView BoardTextModify(BoardTextMainDto boardTextMainDto) throws Exception {
		
		boardService.BoardTextModify(boardTextMainDto);
		
		return BoardTextSelecListAll(boardTextMainDto.getStrGroup_Cd(), boardTextMainDto.getStrKind_Cd());
	}
	
	@RequestMapping(value="/noticedelete.html")
	public ModelAndView BoardTextDelete(BoardTextMainDto boardTextMainDto) throws Exception {
		
		boardService.BoardTextDelete(boardTextMainDto.getIntSeq());
		
		return BoardTextSelecListAll(boardTextMainDto.getStrGroup_Cd(), boardTextMainDto.getStrKind_Cd());
	}
	
	@RequestMapping(value="/commentinsert.html")
	public @ResponseBody String BoardTextCommentInsert(
			@RequestParam(value="intPSeq") int intPSeq, @RequestParam(value="strDetail_Comment") String strDetail_Comment,
			@RequestParam(value="strGroup_Cd") String strGroup_Cd, @RequestParam(value="strKind_Cd") String strKind_Cd,
			@RequestParam(value="strGet_User_Cd") String strGet_User_Cd) throws Exception {
		
		BoardTextCommentDto boardTextCommentDto = new BoardTextCommentDto();
		boardTextCommentDto.setIntPSeq(intPSeq);
		boardTextCommentDto.setStrGroup_Cd(strGroup_Cd);
		boardTextCommentDto.setStrKind_Cd(strKind_Cd);
		boardTextCommentDto.setStrDetail_Comment(strDetail_Comment);
		boardTextCommentDto.setStrGet_User_Cd(strGet_User_Cd);
		boardTextCommentDto.setStrEdit_User_Cd(strGet_User_Cd);
		
		boardService.BoardCommentInsert(boardTextCommentDto);
		
		JSONObject json = new JSONObject();
		json.put("result", "ok");
		
		return json.toJSONString();
	}
	
	@RequestMapping(value="/commentdelete.html")
	public @ResponseBody String BoardTextCommentInsert(int intSeq) throws Exception {
		
		
		return "";
	}
	
	
	private ModelAndView BoardTextSelecListAll(String strGroup, String strKind) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/board/allnoticelist.html?strGroup=" + strGroup + "&strKind=" + strKind);
		
		BoardTextMainDto boardTextMainDto = new BoardTextMainDto();
		boardTextMainDto.setStrGroup_Cd(strGroup);
		boardTextMainDto.setStrKind_Cd(strKind);
		
		ArrayList<BoardTextMainDto> list = boardService.BoardTextSelectAll(boardTextMainDto);
		mav.addObject("list", list);
		
		return mav;
	}
	
}
