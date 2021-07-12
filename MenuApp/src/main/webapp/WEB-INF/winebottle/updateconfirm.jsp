<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Confirmed</title>
</head>
<body>

 <form action="goHome.do" method="GET">
    <input type="submit" value="Return Home" />
  </form> 
  <br><br><br>
<h4>"Bottle updated successfully"</h4> <br>
	Bottle ID: ${bottle.id }<br>
	Label Name: ${bottle.labelName}<br>
	Vineyard: ${bottle.vineyard}<br>
	Vintage: ${bottle.vintage}<br>
	Varietal: ${bottle.varietal}<br>
	Type: ${bottle.type }<br>
	Country: ${bottle.country}<br>
	State/Province: ${bottle.state}<br>
	Region: ${bottle.region }<br>
	Price: ${bottle.price}<br>

</body>
</html>