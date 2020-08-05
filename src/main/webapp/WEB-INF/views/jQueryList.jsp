<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script type="text/javascript">
	function makeList() {
			var htmls="";
			
        	$("#list-table").html(""); // #list-table태그내에 존재하는 자식태그을 통째로 읽어올때 사용


			$("<tr>" , {
				html : "<td>" + "번호" + "</td>"+  // 컬럼명들
						"<td>" + "이름" + "</td>"+
						"<td>" + "제목" + "</td>"+
						"<td>" + "날짜" + "</td>"+				
						"<td>" + "히트" + "</td>"
			}).appendTo("#list-table") // 이것을 테이블에붙임
			
			//jsp 값을 javascript 에서 쓸수 있는 방법
			
				//javascript 안에 jstl 문법이 들어 갔음
				<c:forEach var="jqueryVO" items="${jquery}" >
					htmls += '<tr>';
	            	htmls += '<td>'+ '${jqueryVO.bId}' + '</td>';
	            	htmls += '<td>'+ '${jqueryVO.bName}'+ '</td>';
	            	
	            	htmls += '<td>';
	            	<c:forEach begin="1" end="${jqueryVO.bIndent}">
	            		htmls += '-';
	            	</c:forEach>
	            	htmls += '<a href="${pageContext.request.contextPath}/content_view?bId=' + '${jqueryVO.bIndent}' + '">' + '${jqueryVO.bTitle}' + '</a></td>';
		            htmls += '/<td>';
		           
		            htmls += '${jqueryVO.bDate}';
		            htmls += '${jqueryVO.bHit}';
				</c:forEach>                       	
				
				
			$("#list-table").append(htmls);					
	        	
	}//end	getList()	
	</script>
	
	<script>
		$(document).ready(function(){
			makeList();
		});
	</script>

</head>
<body>
	<table id="list-table" width="700" cellpadding="0" cellspacing="0" border="1">
	</table>
</body>
</html>
