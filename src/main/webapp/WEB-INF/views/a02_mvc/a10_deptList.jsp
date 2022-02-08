<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="path" value="${pageContext.request.contextPath }" />
<fmt:requestEncoding value="utf-8" />
<!DOCTYPE html>
<%--


 --%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${path}/a00_com/bootstrap.min.css">
<link rel="stylesheet" href="${path}/a00_com/jquery-ui.css">
<style>
td {
	text-align: center;
}
</style>
<script src="${path}/a00_com/jquery.min.js"></script>
<script src="${path}/a00_com/popper.min.js"></script>
<script src="${path}/a00_com/bootstrap.min.js"></script>
<script src="${path}/a00_com/jquery-ui.js"></script>
<script src="https://unpkg.com/vue/dist/vue.js" type="text/javascript"></script>
<script src="https://developers.google.com/web/ilt/pwa/working-with-the-fetch-api" type="text/javascript"></script>
<script type="text/javascript">
	$(document).ready(function() {
		var proc = "${proc}";
		if (proc != "") {
			alert(proc);
			location.href = "${path}/deptList.do";
		}

		$("#regBtn").click(function() {
			if (confirm("등록하시겠습니까?")) {
				$("#frm02").submit();
			}
		});
	});
</script>
</head>
<body>
	<div class="jumbotron text-center">
		<h2>부서정보</h2>
	</div>
	<div class="container">
		<form id="frm01" class="form-inline" method="post">
			<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
				<input class="form-control mr-sm-2" name="dname" value="${dept.dname}" placeholder="부서명" />
				<input class="form-control mr-sm-2" name="loc" value="${dept.loc}" placeholder="부서위치" />
				<button class="btn btn-info" type="submit">Search</button>
				<button data-toggle="modal" data-target="#exampleModalCenter" class="btn btn-success" type="button">등록</button>
			</nav>
		</form>
		<table class="table table-hover table-striped">
			<col width="33%">
			<col width="33%">
			<col width="34%">
			<thead>
				<tr class="table-success text-center">
					<th>부서번호</th>
					<th>부서명</th>
					<th>부서위치</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="dept" items="${dlist}">
					<tr>
						<td>${dept.deptno}</td>
						<td>${dept.dname}</td>
						<td>${dept.loc}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>
	<div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLongTitle">부서정보등록</h5>
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form id="frm02" class="form" action="${path}/insertDept.do" method="post">
						<div class="row">
							<div class="col">
								<input type="text" class="form-control" placeholder="부서번호 입력" name="deptno" value="0">
							</div>
						</div>
						<div class="row">
							<div class="col">
								<input type="text" class="form-control" placeholder="부서명 입력" name="dname">
							</div>
						</div>
						<div class="row">
							<div class="col">
								<input type="text" class="form-control" placeholder="부서위치 입력" name="loc">
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
					<button type="button" id="regBtn" class="btn btn-primary">부서등록</button>
				</div>
			</div>
		</div>
	</div>
</body>
</html>