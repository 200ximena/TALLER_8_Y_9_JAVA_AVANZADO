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
    <!-- FAVICON --poner logo imagen-->
    <link rel="icon" type="image/x-icon"  href="img/iconosApp.png">
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
    <div class="index">

        <img class="mb-4" src="img/menu-down.svg" alt="MY APP" width=100>
            <h1 class="h5 mb-3 fw-normal">OPCIONES:</h1>
        <a href="login" ><button class="btn btn-lg btn-primary" type="submit">Ingresar</button></a>
        <a href="user"><button class="btn btn-lg btn-primary" type="submit">Registrarse</button></a>
        <a href="category"><button class="btn btn-lg btn-primary" type="submit">Registro de categorias</button></a>
        <a href="product"><button class="btn btn-lg btn-primary" type="submit">Registro de porductos</button></a>

    <br>
    <br>
    <br>
    <br>
    <br>
            <p class="mt-3 mb-3 text-muted">Todos los Derechos Reservados MY APP
                <%=displayDate()%>
            </p>

    </div>
</div>

<!-- Bootstrap script -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<%!
    public String displayDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY");
        Date date = Calendar.getInstance().getTime();
        return dateFormat.format(date);
    }
%>
</body>
</html>