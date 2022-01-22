<%-- 
    Document   : arithmeticCalculator
    Created on : Jan. 21, 2022, 9:58:58 p.m.
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
        <h1>Arithmetic Calculator!</h1>
        <form action="arithmetic" method="post">
            <label for="first">First:</label>
            <input type="number" name="first" id="first">
            <label for="second">Second:</label>
            <input type="number" name="second" id="second">
            
            <button type="submit" value="add" name="calculate">+</button>
            <button type="submit" value="minus" name="calculate">-</button>
            <button type="submit" value="multiply" name="calculate">*</button>
            <button type="submit" value="divide" name="calculate">%</button>
        </form>
        
        <p>Result: ${result}<p>
        
        <a href="ageCalculator.jsp">Age Calculator</a>
    </body>
</html>
