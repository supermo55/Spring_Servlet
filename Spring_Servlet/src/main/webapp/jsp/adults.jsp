<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Kids Registration</title>
        </head>
        <body>
            <form:form id="adultsForm" modelAttribute="adults" action="adultsClasses
            " method="post">
                <table align="center">
                 <tr>
                        <td>
                            <form:label path="firstname">First Name</form:label>
                        </td>
                        <td>
                            <form:input path="firstname" name="firstname" id="firstname" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="lastname">Last Name</form:label>
                        </td>
                        <td>
                            <form:input path="lastname" name="lastname" id="lastname" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="className">Class Name</form:label>
                        </td>
                        <td>
                            <form:input path="className" name="ClassName" id="className" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="time">Time</form:label>
                        </td>
                        <td>
                            <form:input path="time" name="Time" id="time" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="emergencyContact">Emergency Contact</form:label>
                        </td>
                        <td>
                            <form:input path="emergencyContact" name="Emergency Contact" id="email" />
                        </td>
                    </tr>
                     <tr>
                        <td>
                            <form:label path="address">Address</form:label>
                        </td>
                        <td>
                            <form:input path="address" name="address" id="address" />
                        </td>
                    </tr>
                    <tr>                                           
                    <tr>
                        <td></td>
                        <td>
                            <form:button id="register" name="register">Register</form:button>
                        </td>
                    </tr>
                    <tr></tr>
                    <tr>
                        <td></td>
                        <td><a href="home.jsp">Home</a>
                        </td>
                    </tr>
                </table>
            </form:form>
        </body>
        </html>