<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
<br/>
<br/>
	<form action="/update" method="post">

		<div class="mb-3">
			<input type="password" class="form-control"
				placeholder="Enter password" name="password">
		</div>
		<div class="mb-3">
			<input type="email" class="form-control" placeholder="Enter email" name="email">
		</div>
		<button type="submit" class="btn btn-primary">회원정보수정</button>
	</form>
</div>

<%@ include file="../layout/footer.jsp"%>

