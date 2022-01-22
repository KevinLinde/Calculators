<%-- 
    Document   : ageCalculator
    Created on : Jan. 21, 2022, 9:58:39 p.m.
    Author     : Kevin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator!</h1>
        <form action="age" method="post">
            <label for="age">Enter your Age:</label>
            <input type="number" name="age" id="age">
            <button type="submit">Age Next Birthday</button>
        </form>
        
        <p>${message}</p>
        
        <a href="arithmeticCalculator.jsp">Arithmetic Calculator</a>
    </body>
</html>
