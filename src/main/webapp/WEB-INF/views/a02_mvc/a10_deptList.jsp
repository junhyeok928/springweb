<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>
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
<script
	src="https://developers.google.com/web/ilt/pwa/working-with-the-fetch-api"
	type="text/javascript"></script>
<script type="text/javascript">
	$(document).ready(function() {
		var proc = "${proc}";
		if(proc!=""){
			alert(proc);
			location.href="${path}/deptList.do";
		}
		$("#uptBtn").click(function(){
			if(confirm("수정하시겠습니까?")){
				$("#frm02").attr("action","${path}/uptDept.do");
				$("#frm02").submit();
			}
		});		
		
		
		$("#regBtn").click(function(){
			if(confirm("등록하시겠습니까")){
				$("#frm02").submit();
			}
		});
			
	});
	function regFun(){
		$("#exampleModalLongTitle").text("부서정보 등록");
		$("#frm02")[0].reset(); // 초기화 처리.
		$("#regBtn").show();$("#uptBtn").hide();$("#delBtn").hide();		
	}
	function detail(deptno, dname, loc){
		console.log(deptno);
		console.log(dname);
		console.log(loc);
		// 타이틀 변경
		$("#exampleModalLongTitle").text("부서정보(수정/삭제)");
		// 버튼 활성화 비활성화 처리
		$("#regBtn").hide();$("#uptBtn").show();$("#delBtn").show();		
		// 각각의 form에 데이터 할당.
		$("#frm02 [name=deptno]").val(deptno);
		$("#frm02 [name=dname]").val(dname);
		$("#frm02 [name=loc]").val(loc);
	}	
</script>
</head>
<body>
	<div class="jumbotron text-center">
		<h2>부서정보</h2>
	</div>
	<div class="container">
		<form id="frm01" class="form-inline" method="post">
			<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
				<input class="form-control mr-sm-2" name="dname"
					value="${dept.dname}" placeholder="부서명" /> <input
					class="form-control mr-sm-2" name="loc" value="${dept.loc}"
					placeholder="부서위치" />
				<button class="btn btn-info" type="submit">Search</button>
				<button data-toggle="modal" onclick="regFun()" data-target="#exampleModalCenter" 
	    	class="btn btn-success" type="button">등록</button>
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
					<tr onclick="detail(${dept.deptno},'${dept.dname}','${dept.loc}')" 
					 data-toggle="modal" data-target="#exampleModalCenter">
						<td>${dept.deptno}</td>
						<td>${dept.dname}</td>
						<td>${dept.loc}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>
	
	
	
	<div class="modal fade" id="exampleModalCenter" tabindex="-1"
		role="dialog" aria-labelledby="exampleModalCenterTitle"
		aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLongTitle">부서정보등록</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form id="frm02" class="form" method="post" action="${path}/insertDept.do">

						<div class="row">
							<div class="col">
								<input type="text" class="form-control" placeholder="부서 번호 입력"
									name="deptno">
							</div>
						</div>

						<div class="row">
							<div class="col">
								<input type="text" class="form-control" placeholder="부서명 입력"
									name="dname">
							</div>
						</div>
						<div class="row">
							<div class="col">
								<input type="text" class="form-control" placeholder="부서 위치 입력"
									name="loc">
							</div>
						</div>
					</form>
				</div> 
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary" id="regBtn">부서등록</button>
					<button type="button" class="btn btn-info" id="uptBtn">부서수정</button>
					<button type="button" class="btn btn-danger" id="delBtn">부서삭제</button>
				</div>
			</div>
		</div>
	</div>
</body>
</html>