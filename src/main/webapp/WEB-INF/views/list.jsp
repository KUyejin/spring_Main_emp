<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<center>
	<table width="800" cellpadding="0" cellspacing="0" border="1">
		
		<tr bgcolor="skybule">
			<th>사원번호</th> <!-- empno -->
			<th>사원이름</th> <!-- ename -->
			<th>직급(업무)</th> <!-- job -->
			<th>해당관리자</th> <!-- mgr -->
			<th>입사일자</th> <!-- hiredate -->
			<th>급여</th> <!-- sal -->
			<th>커미션</th> <!-- comm -->
			<th>부서번호</th> <!-- deptno -->
		</tr>
				
	
		<c:forEach items="${emps}" var="dto">
		<tr>
			<td>${dto.empno}</td>
			<td>${dto.ename}</td>
			<td>${dto.job}</td>
			<td>${dto.mgr}</td>
			<td>${dto.hiredate}</td>
			<td>${dto.sal}</td>			
			<td>${dto.comm}</td>
			<td>${dto.deptno}</td>
		</tr>
		</c:forEach>
		<tr>

		</tr>
	</table>
	</center>
</body>
</html>