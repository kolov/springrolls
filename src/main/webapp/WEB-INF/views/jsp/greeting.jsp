<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hi</title>
</head>

<body>

<h1>Greetings from The Greeting Machine</h1>

Hello, <b>${name}</b><br/>
<br/>

<h3>You prefer another name?</h3>
<form:form action="/greeting">
    <table>
        <tr>
            <td>What is your preferred name</td>
            <td><input type="text" name="name" size="100"/></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="Go"/>
            </td>
        </tr>
    </table>
</form:form>

</body>
</html>