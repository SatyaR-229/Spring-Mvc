<%@ page import="org.mvc.entity.Student" %>
<!DOCTYPE html>
<html>
<head>
   <body>
<form action="/" >
    <%
        Student student = (Student) request.getAttribute("student");
    %>
    <table style="border: 1px solid black;">
        <tr>
            <th>FUll Name</th>
            <th>Email</th>
            <th>Course</th>
            <th>Mobile No</th>
        </tr>
        <tr>
            <td><%= student.getFullName()%></td>
            <td><%= student.getEmail()%></td>
            <td><%=student.getCourse()%></td>
            <td><%=student.getMobileNo()%></td>
        </tr>
    </table>
</form>

</body>
</html>
