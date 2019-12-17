<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Kids Registration</title>
        </head>
        <body>
            <form:form id="kidsForm" modelAttribute="kids" action="kidsClasses
            " method="post">
                <table align="center">
                    <tr>
                        <td>
                            <form:label path="kidsfname">Kid's First Name</form:label>
                        </td>
                        <td>
                            <form:input path="kidsfname" name="KidsFirstName" id="kidsfname" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="kidslname">Kid's Last Name</form:label>
                        </td>
                        <td>
                            <form:input path="kidslname" name="KidsLastName" id="kidslname" />
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
                            <form:label path="pfirstName">Parent First Name</form:label>
                        </td>
                        <td>
                            <form:input path="pfirstName" name="ParentFirstName" id="pfname" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="plastName">Parent Last Name</form:label>
                        </td>
                        <td>
                            <form:input path="plastName" name="ParentLastName" id="parentslname" />
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
                            <form:label path="Address">Address</form:label>
                        </td>
                        <td>
                            <form:input path="Address" name="address" id="address" />
                        </td>
                    </tr>
                    
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
