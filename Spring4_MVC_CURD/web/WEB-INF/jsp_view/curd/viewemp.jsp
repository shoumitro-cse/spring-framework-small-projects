<%-- 
    Document   : viewemp
    Created on : Mar 13, 2021, 1:37:13 PM
    Author     : shoumitro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    

        <h1>Employees List</h1>  
        <table border="2" width="70%" cellpadding="2">  
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Salary</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>  
            <c:forEach var="emp" items="${list}">   
                <tr>  
                    <td>${emp.id}</td>  
                    <td>${emp.name}</td>  
                    <td>${emp.salary}</td>  
                    <td><a href="editemp/${emp.id}">Edit</a></td>  
                    <td><a href="deleteemp/${emp.id}">Delete</a></td>  
                </tr>  
            </c:forEach>  
        </table>  
        <br/>    
        <a href="/Spring4_MVC_CURD/viewemp/1">1</a>     
        <a href="/Spring4_MVC_CURD/viewemp/2">2</a>    
        <a href="/Spring4_MVC_CURD/viewemp/3">3</a>    
        <a href="/Spring4_MVC_CURD/viewemp">&nbsp; ViewAll</a> <br/>    

        <br/>  
        <a href="empform">Add New Employee</a>  
    </body>
</html>
