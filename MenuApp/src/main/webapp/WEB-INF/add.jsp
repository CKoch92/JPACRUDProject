<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Bottle of Wine</title>
</head>
<body>
 <form action="goHome.do" method="GET">
    <input type="submit" value="Return Home" />
  </form> 
  <br><br><br>

	<h2>Add New Wine</h2>
	<form action="createWineBottle.do" method="GET">
		<b>Label Name</b> <br />
		<input type="text" name="labelName" /> <br />
		<b>Vineyard</b> <br />
		<input type="text" name="vineyard" /> <br />
		<b>Vintage</b> <br />
		<select name="vintage">
    <option>vintage</option>
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
		<b>Varietal</b> <br /> 
		<input type="text" name="varietal" /> <br />
		<b>Type</b> <br />
		<select name="type">
		<option value="Red">Red</option>
		<option value="White">White</option>
		<option value="Sparkling">Sparkling</option>
		</select> <br />
		<b>Country</b> <br />
		<input type="text" name="country" /> <br />
		<b>State/Province</b> <br />
		<input type="text" name="state" /> <br />
		<b>Region</b> <br />
		<input type="text" name="region" /> <br />
		<b>Price</b> <br /> 
		<input type="text" name="price" /> <br />
	    <input type="submit" value="Submit" />
	</form>
	
</body>
</html>