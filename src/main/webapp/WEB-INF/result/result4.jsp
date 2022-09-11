<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	padding: 50px;
}

table {
	padding: 0;
	border-collapse: collapse;
}

thead {
	background-color: royalblue;
	color: white;
}

tbody tr:nth-child(even) {
	background-color: #eee;
}

th {
	text-align: left;
	padding: 10px 5px 10px 5px;
	border: 1px solid #ddd;
}

td {
	text-align: left;
	padding: 8px 5px 8px 5px;
	border: 1px solid #ddd;
}

tbody>tr:hover {
	background-color: #aaa;
}
</style>
</head>
<body>

	<fieldset>
		<form action="${pageContext.request.contextPath}/Controller4">
			<label for="고민">고민<input type="radio" name="category" value="고민" id="고민"/></label>
			<label for="공유">공유<input type="radio" name="category" value="공유" id="공유"/></label>
			<label for="공지">공지<input type="radio" name="category" value="공지" id="공지"/></label>
			<label for="잡담">잡담<input type="radio" name="category" value="잡담" id="잡담"/></label>
			<label for="비밀">비밀<input type="radio" name="category" value="비밀" id="비밀"/></label>
			<label for="알림">알림<input type="radio" name="category" value="알림" id="알림"/></label>
			<button>전송</button>
		</form>
	</fieldset>

	<table>
		<thead>
			<th>id</th>
			<th>카테고리</th>
			<th>제목</th>
			<th>글쓴이</th>
			<th>작성일/작성시간</th>
		</thead>
		<tbody>
			<c:forEach var="item" items="${list}">
				<tr>
					<td>${item.id}</td>
					<td>${item.category}</td>
					<td>${item.title}</td>
					<td>${item.owner}</td>
					<td>${item.createDate}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>