<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html lang="en">
          <!-- start: content -->
            <div id="content">
                <div class="panel">
                  <div class="panel-body">
                      <div class="col-md-6 col-sm-12">
                        <h3 class="animated fadeInLeft">${sessionScope.coInfo[6].strName }</h3>
                        <p class="animated fadeInDown"><span class="fa  fa-map-marker"></span> 게시판 >> 공지사항</p>

                        
                    </div>
                    <div class="col-md-6 col-sm-12">
                        <div class="col-md-6 col-sm-6 text-right" style="padding-left:10px;">
                          <h5 id="addr"  style="color:#DDDDDE;"><span class="fa  fa-map-marker"></span> 위치정보 들어가는 자리</h5>
                          <h1 style="margin-top: -10px;color: #ddd;"></h1>
                        </div>
                        <div class="col-md-6 col-sm-6">
                           <div class="wheather">
	                            <div class="sun animated pulse infinite">
	                              <div class="suny"></div>
	                            </div>
                          </div>
                        </div>                   
                    </div>
                  </div>                    
                </div>
                
                <div class="panel-heading bg-white border-none" style="margin-bottom: 20px;">
                   	<h4><span class="icon-notebook icons"></span> 공지사항 조회</h4>
                </div>

					<!-- start : 메뉴 디자인 구성하는 위치 -->
				<div class="col-md-12">
					<div class="col-md-1"></div>
					<div class="col-md-10">
						<table id="" class="table table-striped table-bordered" width="100%" cellspacing="0">
							<tbody>
								<tr>
									<td style="text-align: right;">
										<input type="button" class="btn ripple btn-round btn-3d btn-default" style="width: auto; height: auto;" id="" name="" value="조회" onclick="location.href='${root }/board/allnoticelist.html?strGroup=001&strKind=001'">
										<input type="button" class="btn ripple btn-round btn-3d btn-default" style="width: auto; height: auto;" id="" name="" value="신규등록" onclick="location.href='${root }/board/noticeselect.html?intSeq=0&strGroup=001&strKind=001&strGetUser=${sessionScope.userInfo.strCode }'">			
									</td>
								</tr>
						
							</tbody>
						</table>
					</div>
					<div class="col-md-1"></div>
				</div>
				
				<div class="col-md-12">	
					<div class="col-md-1"></div>
					<div class="col-md-10">
	                  <div class="panel">
	                    <div class="panel-body">
	                      <div class="responsive-table">
	                      	<table id="datatables-example" class="table table-striped table-bordered" width="100%" cellspacing="0">
	                      		<thead>
			                        <tr>
			                          <th style="text-align: center;">No.</th>
			                          <th style="text-align: center;">제목</th>
			                          <th style="text-align: center;">작성자</th>
			                          <th style="text-align: center;">조회</th>
			                        </tr>
	                      		</thead>
	                      		<tbody>
	                      		
	                      			<c:forEach var="board" items="${list }">
	                      				<tr>
	                      					<td style="text-align: right;">${board.intSeq }</td>
	                      					<td>
	                      						<a href="${root }/board/noticeselect.html?intSeq=${board.intSeq }&strGroup=${board.strGroup_Cd }&strKind=${board.strKind_Cd }&strGetUser=${board.strGet_User_Cd }&strViewUser=${sessionScope.userInfo.strCode }">${board.strTitle }</a>
	                      					</td>
	                      					<td>${board.strGet_User_Nm }</td>
	                      					<td style="text-align: right;">${board.intCommentCount }</td>
	                      				</tr>
	                      			</c:forEach>

	                      		</tbody>
	                        </table>
	                      </div>
	                  </div>
	                </div>
	              </div>
	              <div class="col-md-1"></div>
              </div>
              									
					<!-- end : 메뉴 디자인 구성하는 위치 -->
					
           </div>
          <!-- end: content -->

</html>