<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>비밀번호 확인</title>
</head>
<body>
<header><jsp:include page="/WEB-INF/views/common/Header.jsp" /></header>
	<div class="container outer">
		<div class="col-md-9 inner" style="width: 500px;">
			<div id="pwdCheckBox" class="col-md-9 inner" style="padding-top: 25px;">
				<h3 style="font-weight: bold; text-align: center;">비밀번호를 입력해주세요</h3>
				<form action="" id="password_confirm" name="password_confirm" method="post">
				
					<div class="pwdBox">
						<input type="password" id="password" name="password" class="form-control" value="" maxlength="10">
					</div>
					
					<input type="hidden" id="idx" name="idx" value="${boardDto.idx}"> 
					<input type="button" class="btn btn-default btn-lg btnmargin pull-left" value="뒤로가기" onClick="location.href = '../postSelect.do?idx='+${boardDto.idx}">
					<input type="button" id="confirmBtn" class="btn btn-primary btn-lg btnmargin pull-right" value='입력완료'>
					<input type="hidden" id="url" value="${URL}">
				</form>
			</div>
		</div>
	</div>
</body>
</html>