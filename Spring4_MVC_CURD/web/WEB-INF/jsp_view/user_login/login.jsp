<%-- 
    Document   : login
    Created on : Mar 12, 2021, 11:51:15 PM
    Author     : shoumitro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>This is Login Page</h1>
        <form action="hello">  
            UserName : <input type="text" name="name"/> <br><br>  
            Password : <input type="text" name="pass"/> <br><br>   
            <input type="submit" name="submit" value="Submit">  
        </form>  
        <br/>
        <a href="home">Go to home</a>  
        <br/>
        <br/>
        <a href="index">Go to Curd</a>  
        
  <!--page include--> 
<!--     <jsp:include page="/redirect.jsp"></jsp:include>  -->
    </body>
</html>
