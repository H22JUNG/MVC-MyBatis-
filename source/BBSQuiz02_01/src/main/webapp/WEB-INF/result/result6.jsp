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
	display: grid;
	grid-template-columns: 30px 1fr 30px;
	grid-template-rows: 20px 1fr 20px;
	grid-auto-flow: row;
	grid-template-areas: ". . ." ". form ." ". . .";
}

form {
	display : grid;
	grid-area : form;
	grid-template-columns: 1fr 100px;
	grid-template-rows: 1fr;
	grid-auto-flow: row;
	gap : 20px;
	grid-template-areas: "category submit";
}

#category {
	grid-area : category;
	font-size : 20px;
}

#submit {
	grid-area : submit;
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
			<form action="${pageContext.request.contextPath}/BBSController6" method="post">
				<div>
				<label for="startmonth">시작월</label>
				<select name="startmonth" id="startmonth">
					<option value="01">1월</option>
					<option value="02">2월</option>
					<option value="03">3월</option>
					<option value="04">4월</option>
					<option value="05">5월</option>
					<option value="06">6월</option>
					<option value="07">7월</option>
					<option value="08">8월</option>
					<option value="09">9월</option>
					<option value="10">10월</option>
					<option value="11">11월</option>
					<option value="12">12월</option>
				</select>
				<label for="endmonth">종료월</label>
				<select name="endmonth" id="endmonth">
					<option value="01">1월</option>
					<option value="02">2월</option>
					<option value="03">3월</option>
					<option value="04">4월</option>
					<option value="05">5월</option>
					<option value="06">6월</option>
					<option value="07">7월</option>
					<option value="08">8월</option>
					<option value="09">9월</option>
					<option value="10">10월</option>
					<option value="11">11월</option>
					<option value="12">12월</option>
				</select>
				</div>
				<button id="submit">변경</button>
			</form>
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