<%-- 
    Document   : file
    Created on : Mar 13, 2021, 3:33:51 PM
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

        <h1>File Upload Example - JavaTpoint</h1>  

        <h3 style="color:red">${filename}</h3>  
    <form:form method="post" action="/Spring4_MVC_CURD/savefile" enctype="multipart/form-data">  
        <p><label for="image">Choose Image</label></p>  
        <p><input name="file" id="fileToUpload" type="file" /></p>  
        <p><input type="submit" value="Upload"></p>  
    </form:form>  

</body>
</html>
