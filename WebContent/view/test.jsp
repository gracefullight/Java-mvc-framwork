<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>잠좀자자</h2>
<table>
	<c:forEach items="${list}" var="user">
			<tr>
				<td>
					${user.idx }
				</td>
				<td>
					${user.userid }
				</td>
			</tr>
	</c:forEach>
</table>
<hr>
<%-- 유저 1의 비밀번호 : ${pass }--%>
</body>
</html>