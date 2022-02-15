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
<style>
   td{text-align:center;}
</style>
<script src="${path}/a00_com/jquery.min.js"></script>
<script src="${path}/a00_com/popper.min.js"></script>
<script src="${path}/a00_com/bootstrap.min.js"></script>
<script src="${path}/a00_com/jquery-ui.js"></script>
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
<script src="https://developers.google.com/web/ilt/pwa/working-with-the-fetch-api" type="text/javascript"></script>
<script type="text/javascript">
	$(document).ready(function(){
		<%-- 
		
		--%>	
		$("[name=ename], [name=job]").keyup(function(){
			if(event.keyCode==13){ // enter키를 입력시.
				//  ename=%ED%99%8D%EA%B8%B8%EB%8F%99&job=%EB%8C%80%EB%A6%AC  
				//alert($("#frm01").serialize()); // form하위에 key=value 형식으로 데이터 처리
				// ajax처리를 통해서 controller 호출 후, 데이터 리스트 처리..
				$.ajax({
					url:"${path}/empAjax01.do",
					type:"get",
					data:$("#frm01").serialize(),
					dataType:"json",
					success:function(data){
						// d.addAttribute("empList", service.getEmpList(sch));
						// data.모델명
						var empList = data.empList;
						console.log(empList);
					    var html="";
					    $.each(empList,function(idx, emp){
						    html+="<tr><td>"+emp.empno+"</td><td>"+emp.ename+"</td><td>"+emp.job+
					    	"</td><td>"+emp.sal+"</td><td>"+emp.deptno+"</td></tr>";
					    });
					    console.log(html);
					    $("tbody").html(html);						
					},
					error:function(err){
						console.log(err)
					}
				});
				// EX) 부서정보 화면에서 AJAX 처리 LIST 출력 4조제출.
			}
		});
	});
</script>
</head>

<body>
<div class="jumbotron text-center">
  <h2 >사원정보 ajax처리</h2>

</div>
<div class="container">
	<form id="frm01" class="form-inline"  method="post">
  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	    <input class="form-control mr-sm-2" name="ename" placeholder="사원명" />
	    <input class="form-control mr-sm-2" name="job" placeholder="직책명" />
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
    <!-- 

     -->
    <tbody>
    	<tr><td></td><td></td><td></td><td></td><td></td></tr>
    </tbody>
	</table>    
    
</div>
<div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLongTitle">타이틀</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
		<form id="frm02" class="form"  method="post">
	     <div class="row">
	      <div class="col">
	        <input type="text" class="form-control" placeholder="사원명 입력" name="ename">
	      </div>
	      <div class="col">
	        <input type="text" class="form-control" placeholder="직책명 입력" name="job">
	      </div>
	     </div>
	    </form> 
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Save changes</button>
      </div>
    </div>
  </div>
</div>
</body>
</html>