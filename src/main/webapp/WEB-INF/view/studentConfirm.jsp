<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
    <body>
        <h2>Confirmed!</h2>
        <!-- illustration of what we get with the model (in terms of ModelMap at least
             added newStudent & christianName, surName in processForm code
             BUT the requestingStudent seems to have made its way throug un assisted
         -->
        <h2>${surName}, ${christianName} is registered</h2>
        <h2>${newStudent.firstName} ${newStudent.lastName} using newStudent</h2>
        <h2>${requestingStudent.firstName} ${requestingStudent.lastName} using requestingStudent</h2>
    </body>
</html>