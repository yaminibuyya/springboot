<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>UPDATE</title>
    <meta charset="utf-8">
    <meta name="viewport"
        content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href=
"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <script src=
"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js">
    </script>
    <script src=
"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js">
    </script>
    <script src=
"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js">
    </script>
</head>
<body>
    <h1 class="text-success text-center">
        UPDATE Products
    </h1>
    <h2 class="text-center">-----------</h2>
    <div class="container">
        <form action="update" method="post">
            <div class="form-group">
                <label for="id">Product Id:</label>
                <input type="text" class="form-control" id="id"
                    placeholder="Enter product id" name="id" readonly="readonly" value="${product.id}">
            </div>
            <div class="form-group">
                <label for="name">Product Name:</label>
                <input type="text" class="form-control" id="name"
                    placeholder="Enter product name" name="name" value="${product.name}">
            </div>
            <div class="form-group">
                <label for="model">Product Model:</label>
                <input type="text" class="form-control" id="model"
                    placeholder="Enter product model" name="model" value="${product.model}">
            </div>
            <div class="form-group">
                <label for="price">Product Price:</label>
                <input type="text" class="form-control" id="price"
                    placeholder="Enter product price" name="price"  value="${product.price}">
            </div>
             <div class="form-group form-check">
                <label class="form-check-label">
                    <input class="form-check-input" type="checkbox"
                        name="remember">
                        Remember me
                </label>
            </div>
            <button type="submit" class="btn bg-success">
                Save Product
            </button>
        </form>
    </div>