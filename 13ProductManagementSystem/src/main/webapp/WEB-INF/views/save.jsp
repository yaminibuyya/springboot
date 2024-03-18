<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>

<style >
body {
  background-image: url('https://blog.saginfotech.com/wp-content/uploads/2018/12/gst-rate-slash.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
</style>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>ADD Product</h1>
	<form action="save1" method="post" >
		<table>
			<tr>
				<td>ID:</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name"></td>
			</tr>

			<tr>
				<td>Model:</td>
				<td><input type="text" name="model"></td>
			</tr>
			<tr>
				<td>Price:</td>
				<td><input type="text" name="price"></td>
			</tr>
			<tr>
				<td><input type="submit" value="save"></td>
			</tr>


		</table>
	</form>
</body>
</html>