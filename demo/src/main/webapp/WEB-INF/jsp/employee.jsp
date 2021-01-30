<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Real time info</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
                    rel="stylesheet">
</head>
    <body>
    <div class="container">
    		<table border="1">
        <tr>
            <td>Employee ID:</td>
            <td>FIRST NAME:</td>
            <td>LAST NAME:</td>
            <td>ROLE:</td>
        </tr>
        <c:forEach items="${employees}" var="employee">
    	<tr>      
        	<td>${employee.id}</td>
        	<td>${employee.first_name}</td>
       		<td>${employee.last_name}</td>
       	 	<td>${employee.role}</td>
    	</tr>
		</c:forEach>
    </table> 
    </div>
    <script src="webjars/jquery/2.2.4/jquery.min.js"></script>
    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>