<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<body>

<h2>User Data</h2>

<a href="/addData">Add Data</a>

<table style="width:100%" border=1>
  <tr>
    <th>UserName</th>
    <th>Password</th> 
  </tr>
<c:forEach items="${user}" var="userForm">
<tr>     
   <td align="center">${userForm.user}</td>
   <td align="center">${userForm.password}</td>
</c:forEach> 
</table>

</body>
</html>
