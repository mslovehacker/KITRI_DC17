<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html lang="en">

<script type="text/javascript">

	function boardSubmit(kind){
		
		var boardModify = document.getElementById("boardModify");
		
		switch(kind){
		
			case 'insert':
				boardModify.action = '${root }/board/noticeinsert.html';
				break;
				
			case 'modify':
				boardModify.action = '${root }/board/noticemodify.html';
				break;
				
			case 'delete':
				boardModify.action = '${root }/board/noticedelete.html';
				break;
		}	
		
		
		boardModify.method = 'POST';
		boardModify.submit();
	}
	
	
	function boardRippleSubmit(intPSeq, strGroup_Cd, strKind_Cd){
				
		var root = "${root }";
		var strDetail_Comment = document.getElementById("strComment").value;
		var strGet_User_Cd = "${sessionScope.userInfo.strCode}";
		var strGet_User_Nm = "${sessionScope.userInfo.strName}";
		var strGet_Date = new Date().toLocaleTimeString();
		 
		$.ajax({
			
			url: root + "/board/commentinsert.html",
			type: "POST",
			dataType: "json",
			data: {
				"intPSeq":intPSeq,
				"strDetail_Comment":strDetail_Comment,
				"strGroup_Cd":strGroup_Cd,
				"strKind_Cd":strKind_Cd,
				"strGet_User_Cd":strGet_User_Cd},
			success:function(data){
				
				if(data.result == 'ok'){
					
					var output = "";
					
					output += '					<tr> ';
					output += '						<td style="text-align: right;">' + intPSeq + '</td> ';
					output += '						<td>' + strDetail_Comment + '</td> ';
					output += '						<td style="text-align: center;">' + strGet_User_Nm + '</td> ';
					output += '						<td style="text-align: center;">' + strGet_Date + '</td> ';
					output += '					</tr> ';
					
					$("#ripple > tbody:last").append(output);
					
				}
			},
			error:function(error){
				
				alert(error.code);
			}
			
			
		});
		
		
	}
	
	
	
</script>


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
                
                	<c:choose>
                		<c:when test="${strViewUser eq null }">
                			<h4><span class="icon-notebook icons"></span> 공지사항 입력</h4>	
                		</c:when>
                		
                		<c:otherwise>
                			<c:choose>
                				<c:when test="${strGetUser eq strViewUser }">
                					<h4><span class="icon-notebook icons"></span> 공지사항 수정</h4>
                				</c:when>
                				
                				<c:otherwise>
                					<h4><span class="icon-notebook icons"></span> 공지사항 조회</h4>
                				</c:otherwise>
                			</c:choose>
                		
                		</c:otherwise>
                	</c:choose>
                   	
                </div>

					<!-- start : 메뉴 디자인 구성하는 위치 -->
				<div class="col-md-12">
					<div class="col-md-1"></div>
					<div class="col-md-10">
						<div class="panel-heading bg-white border-none">
							<form id="boardModify">
	                   			<div class="panel-body">
	                   				<table style="width: 100%;">
	                   					<tbody>
	                   						<tr>
	                   							<td style="width: 10%; text-align: center;">제목</td>
	                   							<td style="width: 90%;" colspan="3">
	                   							
	                   								<c:choose>
	                   									<c:when test="${strViewUser eq null }">
	                   										<input type="text" id="strTitle" name="strTitle" class="form-control" style="width: 100%;" value="">	
	                   									</c:when>
	                   									
	                   									<c:otherwise>
	                   										<c:choose>
	                   											<c:when test="${strGetUser eq strViewUser }">
	                   												<input type="text" id="strTitle" name="strTitle" class="form-control" style="width: 100%;" value="${board.strTitle }">	
	                   											</c:when>
	                   											
	                   											<c:otherwise>
	                   												<input type="text" id="strTitle" name="strTitle" class="form-control" style="width: 100%;" value="${board.strTitle }" readonly="readonly">
	                   											</c:otherwise>
	                   										</c:choose>
	                   									</c:otherwise>
	                   								</c:choose>
	                   							</td>
	                   						</tr>
	                   						<tr>
	                   							<td style="width: 10%; text-align: center;">내용</td>
	                   							<td colspan="3">
	                   							
	                   								<c:choose>
	                   									<c:when test="${strViewUser eq null }">
	                   										<textarea id="strDetail_Comment" name="strDetail_Comment" rows="7" cols="" class="form-control" style="width: 100%;"></textarea>
	                   									</c:when>
	                   								
	                   									<c:otherwise>
	                   										<c:choose>
	                   											<c:when test="${strGetUser eq strViewUser }">
	                   												<textarea id="strDetail_Comment" name="strDetail_Comment" rows="7" cols="" class="form-control" style="width: 100%;">${board.strDetail_Comment }</textarea>	
	                   											</c:when>
	                   									
	                   											<c:otherwise>
	                   												<textarea id="strDetail_Comment" name="strDetail_Comment" rows="7" cols="" class="form-control" style="width: 100%;" readonly="readonly">${board.strDetail_Comment }</textarea>
	                   											</c:otherwise>	
	                   										</c:choose>
	                   									</c:otherwise>
	                   									
	                   								</c:choose>
	                   							</td>
	                   						</tr>
	                   					</tbody>
	                   				</table>
	                   				
	                   				<div style="margin-top: 30px; margin-bottom: 10px; text-align: right;">
										<c:choose>
											<c:when test="${strViewUser eq null }">
		                  						<input type="button" id="btnInsert" class="btn ripple btn-round btn-3d btn-default" style="width: auto; height: auto;" value="입력" onclick="boardSubmit('insert')"/>
		                  					</c:when>
		                  					
		                  					<c:otherwise>
		                  						<c:choose>
		                  							<c:when test="${strGetUser eq strViewUser }">
														<input type="button" id="btnDelete" class="btn ripple btn-round btn-3d btn-default" style="width: auto; height: auto;" value="삭제" onclick="boardSubmit('delete')"/>
	               										<input type="button" id="btnModify" class="btn ripple btn-round btn-3d btn-default" style="width: auto; height: auto;" value="수정" onclick="boardSubmit('modify')"/>
	                  								</c:when>	
		                  						</c:choose>
		                  					</c:otherwise>
	                  					</c:choose>
	                   					<input type="button" class="btn ripple btn-round btn-3d btn-default" style="width: auto; height: auto;" value="메인으로" onclick="location.href='${root}/board/allnoticelist.html?strGroup=${strGroup }&strKind=${strKind }'"/>
	                   					
	                   					<c:choose>
	                   						<c:when test="${board.intSeq eq null}">
	                   							<input type="hidden" id="intSeq" name="intSeq" value="0">
	                   							<input type="hidden" id="strGroup_Cd" name="strGroup_Cd" value="${strGroup }">
	                   							<input type="hidden" id="strKind_Cd" name="strKind_Cd" value="${strKind }">
	                   						</c:when>
	                   					
	                   						<c:otherwise>
	                   							<input type="hidden" id="intSeq" name="intSeq" value="${board.intSeq }">
	                   							<input type="hidden" id="strGroup_Cd" name="strGroup_Cd" value="${board.strGroup_Cd }">
	                   							<input type="hidden" id="strKind_Cd" name="strKind_Cd" value="${board.strKind_Cd }">
	                   						</c:otherwise>
	                   					</c:choose>
	                   					
	                   					
	                   					<input type="hidden" id="strGet_User_Cd" name="strGet_User_Cd" value="${sessionScope.userInfo.strCode }">
	                   					<input type="hidden" id="strEdit_User_Cd" name="strEdit_User_Cd" value="${sessionScope.userInfo.strCode }">
	                   				</div>
	                   			</div>
                   			</form>
              			</div>
          			</div>
          			<div class="col-md-1"></div>
       			</div>
       			
              <div class="col-md-12">
					<div class="col-md-1"></div>
					<div class="col-md-10">
						<div class="panel-heading bg-white border-none" style="margin-bottom: 20px;">
                   			<h4><span class="icon-notebook icons"></span> 댓글</h4>
                		
							<table id="ripple" class="table table-striped table-bordered" width="100%" cellspacing="0">
								<thead>
									<th style="text-align: center;">No.</th>
		                          	<th style="text-align: center;">내용</th>
		                          	<th style="text-align: center;">작성자</th>
		                          	<th style="text-align: center;">작성시간</th>
								</thead>
								<tbody>
									
									<c:forEach var="commentList" items="${board.arrayComment }">
										
										<tr>
											<td style="text-align: right;">${commentList.intSeq }</td>
											<td>${commentList.strDetail_Comment }</td>
											<td style="text-align: center;">${commentList.strGet_User_Nm }</td>
											<td style="text-align: center;">${commentList.datGet_Date }</td>
										</tr>
									</c:forEach>
							
								</tbody>
							</table>
							<c:if test="${strGetUser ne strViewUser }">
								<form id="frmComment">
									<div style="margin-top: 100px;">
										<textarea id="strComment" rows="2" cols="140"></textarea>
										<input type="button" id="btnRippleInsert" class="btn ripple btn-round btn-3d btn-default" style="width: auto; height: auto;" value="입력" onclick="boardRippleSubmit(${board.intSeq }, '${board.strGroup_Cd }', '${board.strKind_Cd }')"/>
									</div>
								</form>
							</c:if>
						</div>
					</div>
					<div class="col-md-1"></div>
				</div>					
					<!-- end : 메뉴 디자인 구성하는 위치 -->
					
           </div>
          <!-- end: content -->

</html>