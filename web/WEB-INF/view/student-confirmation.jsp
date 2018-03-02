<%--
  Created by IntelliJ IDEA.
  User: Chuka Nwobi
  Date: 1/03/2018
  Time: 1:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>
The Student is confirmed: ${student.firstName} ${student.lastName}
<br><br>

Favourite Programming Language :${student.favouriteLanguage}
<br><br>
PostCode:${student.postCode}
<br><br>
Country : ${student.country}
<br><br>
Operating Systems:
<ul>
    <c:forEach var="temp" items="${student.operatingSystems}">
    <li>
${temp}
    </li>
    </c:forEach>
    <br><br>
    Number of Courses Offered: ${student.coursesOfferred}
</ul>
</body>

</html>
