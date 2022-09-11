<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
* {
	box-sizing : border-box;
}

.container {
	display: grid;
	grid-template-columns: 200px 1fr 200px;
	grid-template-rows: 50px 100px 50px 1fr 200px;
	gap: 0px 0px;
	grid-auto-flow: row;
	grid-template-areas: ". . ." ". header ." ". . ." ". main ." ". . .";
}

header {
	grid-area : header;
	border : 1px solid black;
	padding : 20px;
}

main {
	grid-area: main;
}

table {
	font-family: Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

table td, table th {
	border: 1px solid #ddd;
	padding: 8px;
}

table tr:nth-child(even) {
	background-color: #f2f2f2;
}

table tr:hover {
	background-color: #ddd;
}

table th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #0335fc;
	color: white;
}
</style>
</head>
<body>
	<div class="container">
		<header>
			<a href="${pageContext.request.contextPath}/BBSController2?category=고민">고민</a>
			<a href="${pageContext.request.contextPath}/BBSController2?category=공유">공유</a>
			<a href="${pageContext.request.contextPath}/BBSController2?category=공지">공지</a>
			<a href="${pageContext.request.contextPath}/BBSController2?category=잡담">잡담</a>
		</header>
		<main>
			<table>
				<thead>
					<tr>
						<th>id</th>
						<th>카테고리</th>
						<th>제목</th>
						<th>글쓴이</th>
						<th>작성일/작성시간</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="vo" items="${list}">
					<tr>
						<td>${vo.id}</td>
						<td>${vo.category}</td>
						<td>${vo.title}</td>
						<td>${vo.owner}</td>
						<td>${vo.createDate}</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</main>
	</div>
</body>
</html>