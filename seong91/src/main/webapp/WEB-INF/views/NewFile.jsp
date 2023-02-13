<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${requestScope.replyList != null }">
		<c:forEach var="comment" items=""${requestScope.replyList }">
			<tr>
				<td width="200">
					<div>
						${comment.u_id }<br> <font size="2" color="blue">${날짜}</font>
					</div>
				</td>
				<td width="550">
					<div class="text_wrapper">${comment.content }</div>
				</td>
				<td width="100">
					<div id="btn" style="text-align: center;">
						<a href="#">[답글]</a><br>
						<c:if test="${comment.u_id == sessionScope.sessionID}">
							<a href="#">[수정]</a>
							<br>
							<a href="#">[삭제]</a>
							<br>
						</c:if>
					</div>
				</td>
			</tr>

		</c:forEach>
	</c:if>


</body>
</html>