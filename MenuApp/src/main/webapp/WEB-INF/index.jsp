<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Wine Menu</title>
</head>
<body>

<h1>Wines by the Bottle Menu</h1>



<!-- ${winebottle } DEBUG -->

<!-- 
<br><br>
<form action="searchByType.do" method="GET">
  Search by Type (Red, White, Sparkling): <input type="text" name="type" />
  <input type="submit" value="Show Wines of this Type" />
</form>
<br><br>
<form action="searchByMaxPrice.do" method="GET">
  Search by Max Price: <input type="text" name="maxPrice" />
  <input type="submit" value="Show Bottles Under this Price" />
</form> -->
<br><br>
<h5>Search the Menu</h5>
<form action="searchBottlePage.do" method = "GET">
	<input type="submit" value="Search for a Bottle of Wine" />
</form> <br>
<h5>Add to the Menu</h5>
<form action="addBottlePage.do" method = "GET">
	<input type="submit" value="Add a Bottle of Wine" />
</form> <br>
<!-- 
<form action="deleteBottlePage.do" method = "GET">
	<input type="submit" value="Delete a Bottle of Wine" />
</form> <br>

<form action="updateBottlePage.do" method = "GET">
	<input type="submit" value="Edit a Bottle of Wine" />
</form> <br> -->

<br><br>
</body>
</html>