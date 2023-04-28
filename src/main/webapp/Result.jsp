<%@page import="mvc.dto.Employee"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${msg }</h1>
<h1>Employee Details are </h1>
<br>
<table border="1">
<tr>
<th>Id</th>
<th>Name</th>
<th>Mobile</th>
<th>Salary</th>
<th>Date of Joining</th>
<th>Edit</th>
<th>Delete</th>
</tr>

<x:forEach var="emp" items="${list}">

<tr>
<th>${emp.getId() }</th>
<th>${emp.getName() }</th>
<th>${emp.getMobile() }</th>
<th>${emp.getSalary() }</th>
<th>${emp.getDoj()}</th>
<th><a href="edit?id=${emp.getId()}"><button>Edit</button></a></th>
<th><a href="delete?id=${emp.getId()}"><button>Delete</button></a></th>
</tr>

</x:forEach>
</table>
</body>
</html>