<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.Calendar" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <!-- METADATA -->
    <!-- charset para caracteres especiales -->
    <meta charset="utf-8">
    <!-- author -->
    <meta name="author" content="Nombre Autor">
    <!-- descripcion -->
    <meta name="descripcion" content="Esta debe ser la informacion que aparece en el parrafo que acompaña los resultados de una busqueda de internet">
    <!-- Keywords -->
    <meta name="Keywords" content="registro de usuario, formulario de registro, crear cuenta, registro en linea">
    <!-- minimum responsive viewport -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- TITLE -->
    <title>Ingreso de una nueva categoria .:. MY APP</title>
    <!-- FAVICON --poner logo imagen-->
    <link rel="icon" type="image/x-icon"  href="img/bookmarks-fill.svg">
    <!-- CSS -->
    <!-- bootstrap css / icons -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-ocons@1.10.3/font/bootstrap-icons.css">
    <!-- custom css -->
    <link rel="stylesheet" href="css/signin.css">

</head>

<body class="text-center">
<div class="container">
    <!-- login form -->
    <div class="formulario">
        <form action="products_register" method="post">
            <img class="mb-4" src="img/bookmark-plus.svg" alt="MY APP" width=100>
            <h4 class="text-secondary">PRODUCT</h4>
            <h1 class="h5 mb-3 fw-normal">Ingreso</h1>

            <div class="form-floating col-md-12">
                <input type="text" class="form-control" name="product_name" id="floatingInput" placeholder="ingrese un producto"
                       required autofocus pattern="[A-Za-z0-9]{8, 12}">
                <label for="floatingInput">Nombre del producto:</label>
            </div>
            <br>
            <div class="form-floating col-md-12">
                <input type="number" class="form-control" name="product_value" id="floatingLast" placeholder="ingrese el precio de producto"
                       required autofocus pattern="[A-Za-z0-9]{8, 12}">
                <label for="floatingLast">Precio del producto:</label>
            </div>
            <br>
            <div class="form-floating col-md-12">
                <input type="number" class="form-control" name="category_id" id="floatingId" placeholder="ingrese el id de la categoria"
                       required autofocus pattern="[A-Za-z0-9]{8, 12}">
                <label for="floatingId">Id categoria:</label>
            </div>
            <br>



            <button class="btn btn-lg btn-primary" type="submit">Ingresar</button>

            <p class="mt-3 mb-3 text-muted">Todos los Derechos Reservados MY APP
                <%=displayDate()%>
            </p>

        </form>
    </div>
</div>
<!-- Bootstrap script -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>"
<%!
    public String displayDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY");
        Date date = Calendar.getInstance().getTime();
        return dateFormat.format(date);
    }
%>
</body>
</html>