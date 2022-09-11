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
	grid-template-rows: 50px 300px 50px 1fr 200px;
	gap: 0px 0px;
	grid-auto-flow: row;
	grid-template-areas: ". . ." ". header ." ". . ." ". main ." ". . .";
}

header {
	grid-area : header;
	border : 1px solid black;
	display: grid;
	grid-template-columns: 30px 1fr 30px;
	grid-template-rows: 20px 1fr 20px;
	grid-auto-flow: row;
	grid-template-areas: ". . ." ". form ." ". . .";
}

form {
	display : grid;
	grid-area : form;
	grid-template-columns: 100px 1fr;
	grid-template-rows: 1fr 1fr 1fr 1fr;
	grid-auto-flow: row;
	gap : 20px;
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
			<form action="${pageContext.request.contextPath}/BBSController12" method="post">
				<label for="owner">글쓴이</label>
				<input type="text" name="owner" id="owner" placeholder="글쓴이를 입력하세요">
				<label for="title">제목</label>
				<input type="text" name="title" id="title" placeholder="제목을 입력하세요">
				<label for="content">내용</label>
				<input type="text" name="content" id="content" placeholder="내용을 입력하세요">
				<button id="submit">전송</button>
			</form>
		</header>
		<main>
			<table>
				<thead>
					<tr>
						<th>id</th>
						<th>카테고리</th>
						<th>제목</th>
						<th>내용</th>
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
						<td>${vo.content}</td>
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