<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit a Wine Bottle</title>
</head>
<body>
	<c:choose>
		<c:when test="${! empty bottle}">
		
		<form action="updatedWineBottle.do" method="GET">
		<input type="hidden" name="id" value="${bottle.id}">
		<b>Vineyard:</b> <br />
		<input type="text" name="vineyard" value="${bottle.vineyard}" > <br />
		<b>Label Name:</b> <br />
		<input type="text" name="labelName" value="${bottle.labelName}" /> <br />
		<b>Varietal</b> <br />
		<input type="text" name="varietal" value="${bottle.varietal}" /> <br />
		<b>Vintage</b><br> 
				<select name="vintage">
    <option>vintage</option>
    <option value="${bottle.vintage }" selected>Current: ${bottle.vintage }</option>
    <option value="2021">2021</option>
    <option value="2020">2020</option>
    <option value="2019">2019</option>
    <option value="2018">2018</option>
    <option value="2017">2017</option>
    <option value="2016">2016</option>
    <option value="2015">2015</option>
    <option value="2014">2014</option>
    <option value="2013">2013</option>
    <option value="2012">2012</option>
    <option value="2011">2011</option>
    <option value="2010">2010</option>
    <option value="2009">2009</option>
    <option value="2008">2008</option>
    <option value="2007">2007</option>
    <option value="2006">2006</option>
    <option value="2005">2005</option>
    <option value="2004">2004</option>
    <option value="2003">2003</option>
    <option value="2002">2002</option>
    <option value="2001">2001</option>
	</select> <br />
		<b>Type</b> <br />
		<select name="type">
		<option value="${bottle.type}" selected>Current: ${bottle.type}</option>
		<option value="Red">Red</option>
		<option value="White">White</option>
		<option value="Sparkling">Sparkling</option>
		</select><br />
		<b>Country</b> <br />
		<input type="text" name="country" value="${bottle.country}" /> <br />
		<b>State/Province</b> <br />
		<input type="text" name="state" value="${bottle.state}" /> <br />
		<b>Region</b> <br />
		<input type="text" name="region" value="${bottle.region}" /> <br />
		<b>Price</b><br> 
		<input type="number" step=".01" name="price" value="${bottle.price}" /> <br />

		<input type="submit" value="Submit" />
	</form>		
		</c:when>
		<c:otherwise>
			<p>No film found</p>
			<!-- Otherwise, print "No film found" -->
		</c:otherwise>
	</c:choose>
</body>
</html>