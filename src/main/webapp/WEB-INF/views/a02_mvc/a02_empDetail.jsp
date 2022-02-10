<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath }"/>
<fmt:requestEncoding value="utf-8"/>     
<!DOCTYPE html>
<%--


 --%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${path}/a00_com/bootstrap.min.css" >
<link rel="stylesheet" href="${path}/a00_com/jquery-ui.css" >
<style type="text/css">
	.input-group-text{width:100%;background-color:linen;color:black;font-weight:bolder;}
	.input-group-prepend{width:20%;}
</style>
<script src="${path}/a00_com/jquery.min.js"></script>
<script src="${path}/a00_com/popper.min.js"></script>
<script src="${path}/a00_com/bootstrap.min.js"></script>
<script src="${path}/a00_com/jquery-ui.js"></script>
<script src="https://developers.google.com/web/ilt/pwa/working-with-the-fetch-api" type="text/javascript"></script>
<script type="text/javascript">
	$(document).ready(function(){
		var proc="${proc}";
		if(proc!=""){
			alert(proc);
			if(proc=="삭제되었습니다"){
				location.href="${path}/empList.do";
			}			
		}	
		$("#uptBtn").click(function(){
			if(confirm("수정하시겠습니까?")){
				$("form").attr("action","${path}/uptEmp.do");
				$("form").submit();
			}
		}); 
		$("#delBtn").click(function(){
			if(confirm("삭제하시겠습니까?")){
				location.href="${path}/delEmp.do?empno="+$("[name=empno]").val();
			}
		});
		$("#mainBtn").click(function(){
			location.href="${path}/empList.do";
		});		
		
		
	});
</script>
</head>

<body>
<div class="jumbotron text-center">
  <h2 data-toggle="modal" data-target="#exampleModalCenter">사원정보 상세화면</h2>

</div>
<div class="container">
	<form method="post">
	<div class="input-group mb-3">	
		<div class="input-group-prepend ">
			<span class="input-group-text ">사원번호</span>
		</div>
		<input name="empno" class="form-control" value="${emp.empno}" />	
		<div class="input-group-prepend">
			<span class="input-group-text">사원명</span>
		</div>
		<input name="ename" class="form-control" value="${emp.ename}" />	
	</div>	
	<div class="input-group mb-3">	
		<div class="input-group-prepend ">
			<span class="input-group-text ">직책명</span>
		</div>
		<input name="job" class="form-control" value="${emp.job}" />	
		<div class="input-group-prepend">
			<span class="input-group-text">관리자</span>
		</div>
		<input name="mgr" class="form-control" value="${emp.mgr}" />	
	</div>	
	<div class="input-group mb-3">	
		<div class="input-group-prepend ">
			<span class="input-group-text ">입사일</span>
		</div>
		<input name="hiredateS" type="date" class="form-control" 
			value='<fmt:formatDate value="${emp.hiredate}" pattern="yyyy-MM-dd"/>' />
		<%--
		${emp.hiredate} :  private Date hiredate;  getHiredate()
		날짜형식의 데이터이기에 원하는 형식으로 출력을 할려면 <fmt:formatDate>
		가 필요로 하다.
		
		해당 내용을 DB에 저장할 때는, 문자열형식으로 저장하여 전달해서 DB 
		to_date('문자열데이터','YYYY-MM-DD')로 필요하기에  name="hiredateS" 로 선언하고
		VO 객체에서도 setHiredateS(String hiredate)를 선언하여 저장하게 하였다.
		
		 --%>
		<div class="input-group-prepend">
			<span class="input-group-text">부서번호</span>
		</div>
		<input name="deptno" class="form-control" value="${emp.deptno}" />	
	</div>		
	<div class="input-group mb-3">	
		<div class="input-group-prepend ">
			<span class="input-group-text ">급여</span>
		</div>
		<input name="sal" class="form-control" value="${emp.sal}" />	
		<div class="input-group-prepend">
			<span class="input-group-text">보너스</span>
		</div>
		<input name="comm" class="form-control" value="${emp.comm}" />	
	</div>	
	<div style="text-align:right;">
		<input type="button" class="btn btn-info" value="수정" id="uptBtn"/>
		<input type="button" class="btn btn-danger" value="삭제" id="delBtn"/>
		<input type="button" class="btn btn-success" value="조회리스트" id="mainBtn"/>
	</div>	
	</form>	
</div>
</body>
</html>