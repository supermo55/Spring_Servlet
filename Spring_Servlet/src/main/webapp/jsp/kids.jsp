<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Registration</title>
        </head>
        <body>
            <form:form id="regForm" modelAttribute="user" action="registerProcess" method="post">
                <table align="center">
                    <tr>
                        <td>
                            <form:label path="kidsfname">kidsFirstName</form:label>
                        </td>
                        <td>
                            <form:input path="kidsfname" name="Kid's First Name" id="kidsfname" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="kidslname">kidsLastName</form:label>
                        </td>
                        <td>
                            <form:password path="kidslname" name="Kid's Last Name" id="kidslname" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="className">className</form:label>
                        </td>
                        <td>
                            <form:input path="className" name="Class Name" id="className" />
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
                            <form:label path="pfirstname">pFirstName</form:label>
                        </td>
                        <td>
                            <form:input path="pfirstname" name="Parent's First Name" id="pfname" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="plastname">kidsLastName</form:label>
                        </td>
                        <td>
                            <form:password path="plastname" name="Parent's Last Name" id="parentslname" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="emergenccontact">Emergency Contact</form:label>
                        </td>
                        <td>
                            <form:input path="email" name="Emergency Contact" id="email" />
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
        
       <!--   private String kidsfname;
  private String kidslname;
  private String className;
  private String time;
  private String pfirstname;
  private String plastname;
  private String emergencycontact;
  private String address; -->