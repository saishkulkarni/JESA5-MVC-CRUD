<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="x" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit</title>
</head>
<body>
<x:form action="updateemployee" method="post" modelAttribute="emp">
Id:<x:input type="text" path="id" readonly="readonly"/><br>
Name:<x:input type="text" path="name"/><br>
Mobile:<x:input type="text" path="mobile"/><br>
Salary:<x:input type="text" path="salary"/><br>
Date of joining:<input type="date" name="date" value="${emp.getDoj()}"><br>
<button type="reset">Reset</button><button>Update</button>
</x:form>
</body>
</html>