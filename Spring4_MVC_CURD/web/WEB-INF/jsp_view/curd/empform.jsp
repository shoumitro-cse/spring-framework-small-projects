<%-- 
    Document   : empform
    Created on : Mar 13, 2021, 1:35:10 PM
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

        <h1>Add New Employee</h1>  
    <form:form method="post" action="save">    
        <table >    
            <tr>    
                <td>Name : </td>   
                <td><form:input path="name"  /></td>  
            </tr>    
            <tr>    
                <td>Salary :</td>    
                <td><form:input path="salary" /></td>  
            </tr>    
            <tr>    
                <td> </td>    
                <td><input type="submit" value="Save" /></td>    
            </tr>    
        </table>    
    </form:form>    
</body>
</html>
