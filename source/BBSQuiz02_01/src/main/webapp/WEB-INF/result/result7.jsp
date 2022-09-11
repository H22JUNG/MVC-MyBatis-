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
			<form action="${pageContext.request.contextPath}/BBSController7" method="post">
				<div>
					<label for="month1">1월</label>
					<input type="checkbox" id="month1" name="months" value="01" />
					<label for="month2">2월</label>
					<input type="checkbox" id="month2" name="months" value="02" />
					<label for="month3">3월</label>
					<input type="checkbox" id="month3" name="months" value="03" />
					<label for="month4">4월</label>
					<input type="checkbox" id="month4" name="months" value="04" />
					<label for="month5">5월</label>
					<input type="checkbox" id="month5" name="months" value="05" />
					<label for="month6">6월</label>
					<input type="checkbox" id="month6" name="months" value="06" />
					<label for="month7">7월</label>
					<input type="checkbox" id="month7" name="months" value="07" />
					<label for="month8">8월</label>
					<input type="checkbox" id="month8" name="months" value="08" />
					<label for="month9">9월</label>
					<input type="checkbox" id="month9" name="months" value="09" />
					<label for="month10">10월</label>
					<input type="checkbox" id="month10" name="months" value="10" />
					<label for="month11">11월</label>
					<input type="checkbox" id="month11" name="months" value="11" />
					<label for="month12">12월</label>
					<input type="checkbox" id="month12" name="months" value="12" />
				</div>
				<button id="submit">검색</button>
			</form>
		</header>
		<main>
			<c:forEach var="inner" items="${list}">
			<hr />	
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
					<c:forEach var="vo" items="${inner}">
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
			</c:forEach>
		</main>
	</div>
</body>
</html>