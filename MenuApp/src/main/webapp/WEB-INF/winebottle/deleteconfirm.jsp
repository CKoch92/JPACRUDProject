<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bye Bye Vino</title>
</head>
<body>
 <form action="goHome.do" method="GET">
    <input type="submit" value="Return Home" />
  </form> 
  <br><br><br>
<h2>Wine Deleted!</h2><br>

The ${deletedBottle.vintage } ${deletedBottle.vineyard } ${deletedBottle.varietal } has been removed from the menu.


</body>
</html>