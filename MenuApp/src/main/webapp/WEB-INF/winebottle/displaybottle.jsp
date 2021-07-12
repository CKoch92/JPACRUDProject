<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Wine Bottles From Search</title>
</head>
<body>

 <form action="goHome.do" method="GET">
    <input type="submit" value="Return Home" />
  </form> 
  <br><br><br>
  
<h3>Results</h3>
	<c:choose>
		<c:when test="${! empty wineBottleList}">
			<c:forEach var="bottle" items="${wineBottleList}">
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
	<br>
	<form action="updateWineBottle.do" method="GET">
  <input type="hidden" name="id" value="${bottle.id }"/> 
  <input type="submit" value="Edit Wine Bottle" />
  </form>
  <br>
	<form action="deleteWineBottle.do" method="GET">
	<input type="hidden" name="id" value="${bottle.id}"/>
	 <input type="submit" value="Delete Wine Bottle" />
	 </form>
			<br>
			</c:forEach>
		</c:when>
		<c:otherwise>
			<p>No bottles found</p>
		</c:otherwise>
	</c:choose>

</body>
</html>