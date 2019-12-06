<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<form action="/Save" method="get">
  <div class="container">
    <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="uname" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" name="psw" required>

    <button type="submit">AddData</button>
  </div>
</form>