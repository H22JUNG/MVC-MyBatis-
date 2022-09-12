<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	display: grid;
	grid-template-columns: 30px 1fr 30px;
	grid-template-rows: 20px 1fr 20px;
	grid-auto-flow: row;
	grid-template-areas: ". . ." ". form ." ". . .";
}

form {
	display : grid;
	grid-area : form;
	grid-template-columns: 100px 1fr 100px;
	grid-template-rows: 1fr;
	grid-auto-flow: row;
	gap : 20px;
	grid-template-areas: "order content submit";
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
	<fieldset>
		<form action="${pageContext.request.contextPath}/Controller11">
			<select name="order" id="order">
				<option value="owner">글쓴이</option>
				<option value="title">제목</option>
				<option value="content">내용</option>
			</select>
			<input type="text" name="input" id="input"  placeholder="내용을 입력하세요"/>
			<button>전송</button>
		</form>
	</fieldset>

	<table>
		<thead>
			<th>id</th>
			<th>카테고리</th>
			<th>제목</th>
			<th>내용</th>			
			<th>글쓴이</th>
			<th>작성일/작성시간</th>
		</thead>
		<tbody>
			<c:forEach var="item" items="${list}">
				<tr>
					<td>${item.id}</td>
					<td>${item.category}</td>
					<td>${item.title}</td>
					<td>${item.content}</td>
					<td>${item.owner}</td>
					<td>${item.createDate}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>