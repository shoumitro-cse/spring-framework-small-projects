<%-- 
    Document   : process
    Created on : Mar 14, 2021, 11:01:22 AM
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
        <jsp:include page="index.jsp"></jsp:include>  
            <hr/>  
        <%@page import="com.javatpoint.ClientInvoker"%>  

        <%
            int number = Integer.parseInt(request.getParameter("number"));
            out.print("cube of " + number + " is: " + ClientInvoker.getCube(number));
        %> 
    </body>
</html>
