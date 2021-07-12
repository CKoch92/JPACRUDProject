<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form action="goHome.do" method="GET">
    <input type="submit" value="Return Home" />
  </form> 
  <br><br><br>

<form action="searchByVineyard.do" method="GET">
  See All Wine Bottles on the Menu: <br>
  <input type="hidden" name="vineyard" value=""/><br>
  <input type="submit" value="Show All Bottles" />
</form>
<!-- <form action="searchByLabel.do" method="GET">
  Search by Label: <br>
  <input type="text" name="label" /><br>
  <input type="submit" value="Show Wines" />
</form> -->
<br><br>
<form action="searchByVineyard.do" method="GET">
  Search by Vineyard: <br>
  <input type="text" name="vineyard" /><br>
  <input type="submit" value="Show Wines" />
</form>
<br><br>

<form action="searchByVarietal.do" method="GET">
  Search by Varietal: <br>
  <input type="text" name="varietal" /><br>
  <input type="submit" value="Show Wines" />
</form>
<br><br>

<!-- <form action="searchByVintage.do" method="GET">
  Search by Vintage: <br>
  <input type="text" name="vintage" /><br>
  <input type="submit" value="Show Wines" />
</form>
<br><br> -->

<form action="searchByType.do" method="GET">
  Search by Type: <br>
  <select name="type">
  <option value="Red">Red</option>
  <option value="White">White</option>
  <option value="Sparkling">Sparkling</option>
  </select> <br>
  <input type="submit" value="Show Wines" />
</form>
<br><br>


</body>
</html>