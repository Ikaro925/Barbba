<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Iniciar sesion</title>
</head>
    <body>
        <h1><%= "Iniciar sesion" %></h1>
        <form action="" method="post">

            <td></td><label>Correo: </label><td/>
            <input type="text" name="usuario"/> <br>
            <label>Contraseña: </label>
            <input type="password" name="pass">


            <br>
            <input type="submit" value="iniciar sesion">

        </form>
        <br>
         No tienes una cuenta.... <a href="registro.jsp"> Registrarme</a>

    </body>
</html>