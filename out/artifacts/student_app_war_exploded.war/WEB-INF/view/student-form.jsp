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
    First name:<form:input path="firstName"/>
    <br> <br>
    Last name: <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>
<br><br>
    Number of Courses registered:
    <form:input path="coursesOfferred"/>
    <form:errors path="coursesOfferred" cssClass="error"/>
    <br><br>
    Favourite Language:
    <form:radiobuttons path="favouriteLanguage" items="${student.favouriteLanguageOptions}"/>
        <br><br>



    Country:
    <form:select path="country">
        <form:option value="" label="Please"/>
        <form:options items="${student.countryoptions}"/>
    </form:select>
    <br><br>
Operating Systems:
    Linux<form:checkbox path="operatingSystems" value="Linux"/>
    Ms Windows<form:checkbox path="operatingSystems" value="Ms Windows"/>
    MAC OS<form:checkbox path="operatingSystems" value="MAC OS"/>
    <br><br>

    <input type="submit" value="Submit"/>




</form:form>

</body>
</html>