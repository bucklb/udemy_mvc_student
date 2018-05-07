<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
    <body>
        <h2>Credentials needed!</h2>
        <form:form action="processForm" modelAttribute="requestingStudent">

            FirstName: <form:input path="firstName" />
            <br><br>
            LastName:  <form:input path="lastName" />
            <br><br>
            <input type="submit" value="Press Me!"/>

        </form:form>
    </body>
</html>