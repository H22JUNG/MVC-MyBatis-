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
		<form action="${pageContext.request.contextPath}/Controller7_1">
			<label for="1">1월<input type="checkbox" name="month" value="1" id="1"/></label>
			<label for="2">2월<input type="checkbox" name="month" value="2" id="2"/></label>
			<label for="3">3월<input type="checkbox" name="month" value="3" id="3"/></label>
			<label for="4">4월<input type="checkbox" name="month" value="4" id="4"/></label>
			<label for="5">5월<input type="checkbox" name="month" value="5" id="5"/></label>
			<label for="6">6월<input type="checkbox" name="month" value="6" id="6"/></label>
			<label for="7">7월<input type="checkbox" name="month" value="7" id="7"/></label>
			<label for="8">8월<input type="checkbox" name="month" value="8" id="8"/></label>
			<label for="9">9월<input type="checkbox" name="month" value="9" id="9"/></label>
			<label for="10">10월<input type="checkbox" name="month" value="10" id="10"/></label>
			<label for="11">11월<input type="checkbox" name="month" value="11" id="11"/></label>
			<label for="12">12월<input type="checkbox" name="month" value="12" id="12"/></label>
			<button>검색</button>
		</form>
	</fieldset>

	<c:forEach var="item" items="${list}"> <!-- 노란색 
	리스트  -->
	<hr />	
	<table>
		<thead>
			<th>id</th>
			<th>카테고리</th>
			<th>제목</th>
			<th>글쓴이</th>
			<th>작성일/작성시간</th>
		</thead>
		<tbody>
			<c:forEach var="item" items="${item}">
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
</c:forEach>
	
</body>
</html>