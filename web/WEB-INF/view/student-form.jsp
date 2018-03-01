<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE>
<html>
<head>
    <title>
        Student Registration
    </title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
    FIrst name:<form:input path="firstName"/>
    <br> <br>
    Last name: <form:input path="lastName"/>
<br><br>
    Country:
    <form:select path="country">
        <form:option value="" label="Please"/>
        <form:options items="${student.countryoptions}"/>
    </form:select>

    <input type="submit" value="submit"/>




</form:form>

</body>
</html>