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
	td{text-align:center;}
</style>
<script src="${path}/a00_com/jquery.min.js"></script>
<script src="${path}/a00_com/popper.min.js"></script>
<script src="${path}/a00_com/bootstrap.min.js"></script>
<script src="${path}/a00_com/jquery-ui.js"></script>
<script src="https://unpkg.com/vue/dist/vue.js" type="text/javascript"></script>
<script src="https://developers.google.com/web/ilt/pwa/working-with-the-fetch-api" type="text/javascript"></script>
<script type="text/javascript">
	$(document).ready(function(){
		var vm = new Vue({
			el:".container",
			data:{msg:"시작!!(뷰와함께)"}
		});	
		$("#regBtn").click(function(){
			if(confirm("등록하시겠습니다.")){
				$("#frm02").submit;	//frm02
			}
		});
		<%-- 
		
		--%>	
	});
</script>
</head>

<body>
<div class="jumbotron text-center">
  <h2 >사원정보조회</h2>

</div>
<div class="container">
	<form id="frm01" class="form-inline"  method="post">
  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	    <input class="form-control mr-sm-2" placeholder="사원명" 
	    	name="ename" value="${emp.ename}"/>
	    <input class="form-control mr-sm-2" placeholder="직책명" 
	    	name="job" value="${emp.job}"/>
	    <button class="btn btn-info" type="submit">Search</button>
	    <button data-toggle="modal" data-target="#exampleModalCenter"
	    	class="btn btn-success" type="button">등록</button>
 	</nav>
	</form>
   <table class="table table-hover table-striped">
   	<col width="20%">
   	<col width="20%">
   	<col width="20%">
   	<col width="20%">
   	<col width="20%">
    <thead>
      <tr class="table-success text-center">
        <th>사원번호</th>
        <th>사원명</th>
        <th>직책명</th>
        <th>급여</th>
        <th>부서번호</th>
      </tr>
    </thead>	
    <tbody>
    	<c:forEach var="emp" items="${emplist}">
    	<tr><td>${emp.empno}</td><td>${emp.ename}</td><td>${emp.job}</td>
    	<td><fmt:formatNumber value="${emp.sal}"/></td><td>${emp.deptno}</td></tr>
    	</c:forEach>
    </tbody>
	</table>    
    
</div>
<div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLongTitle">사원정보등록</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
		<form id="frm02" class="form" action="${path}/insertEmp.do}" method="post">
	     <div class="row">
	      <div class="col">
	        <input type="text" class="form-control" placeholder="사원명 입력" name="ename">
	      </div>
	      <div class="col">
	        <input type="text" class="form-control" placeholder="직책명 입력" name="job">
	      </div>
	     </div>
	     <div class="row">
	      <div class="col">
	        <input type="text" class="form-control" placeholder="입사일 입력" name="hiredate">
	      </div>
	      <div class="col">
	        <input type="text" class="form-control" placeholder="관리자 번호" name="mgr">
	      </div>
	     </div>
	     <div class="row">
	      <div class="col">
	        <input type="text" class="form-control" placeholder="급여 입력" name="sal">
	      </div>
	      <div class="col">
	        <input type="text" class="form-control" placeholder="보너스 입력" name="comm">
	      </div>
	     </div>
		<div class="row">
	      <div class="col">
	        <input type="text" class="form-control" placeholder="부서번호 입력" name="deptno">
	      </div>
	     </div>
	    </form> 
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button type="button" id="regBtn" class="btn btn-primary">Save changes</button>
      </div>
    </div>
  </div>
</div>
</body>
</html>