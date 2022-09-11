<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        	padding : 10px 5px 10px 5px;
            border: 1px solid #ddd;
        }
        td {
            text-align: left;
        	padding : 8px 5px 8px 5px;
            border: 1px solid #ddd;
        }
        tbody > tr:hover{
        	background-color:#aaa;
        }
</style>
</head>
<body>

<fieldset>
<a href="${pageContext.request.contextPath}/Controller2?category=고민">고민</a>
<a href="${pageContext.request.contextPath}/Controller2?category=공유">공유</a>
<a href="${pageContext.request.contextPath}/Controller2?category=공지">공지</a>
<a href="${pageContext.request.contextPath}/Controller2?category=잡담">잡담</a>
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