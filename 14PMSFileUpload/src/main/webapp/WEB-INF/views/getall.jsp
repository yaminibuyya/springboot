<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   
<!DOCTYPE html>
<html lang="en">
<head>

<style >
body {
  background-image: url('https://media.istockphoto.com/id/1095286208/photo/light-blue-paper-color-with-texture-for-background.jpg?s=612x612&w=0&k=20&c=qHExDrUfhH0sCL4caO8Pj6b97Tkn4dssZdpzHmKnQRc=');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
</style>



<title>Font Awesome Icons</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Get all Products</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<div class="m-4">
    <table class="table">
        <thead>
            <tr>
                <th>Product id</th>
                <th>Product Name</th>
                <th>Product Model</th>
                <th>Products Price(in $)</th>
                <th>ACTION</th>
            </tr>
        </thead>
        <c:forEach var="product" items="${getlist}">
        
            <tr class="table-primary">
                <td>${product.id}</td>
                <td>${product.name}</td>
                <td>${product.model}</td>
                <td>$${product.price}</td>
                <td><a href="getbyid?id=${product.id}"><i class="material-icons"><i style="font-size:24px" class="fa">&#xf044;</i></a></td>
                <td><a href="delete?id=${product.id}"><i class="material-icons">&#xe872;</i></a></td>
                
            </tr>
           
        </c:forEach>
    </table>
    <a href="./save1"><button type="button" class="btn btn-outline-secondary">ADD PRODUCT</button></a>
    <a href="./login"><button type="button" class="btn btn-outline-danger">LOGOUT</button></a>
</div>
</body>
</html>