<%-- 
    Document   : index
    Created on : 16/10/2014, 14:10:01
    Author     : Cristiano Soares, Luiz Marques e Ricardo Reis
--%>
<%@page contentType="Text/html" import="java.util.Date, java.text.*" pageEncoding="UTF-8" info="getServletinfo()"%>
<html>
    <head>
        <title>Torre de Hanoi</title>	
    </head>
    <body>
        <h1>
            Jogo da Torre		
        </h1>
            <form action="Hanoi" method="post" >
                <p style="color:blue;font-family: Verdana">
                    Digite a quantidade de discos que você que jogar: </p>
                Nº de discos: <input type="text" name="n">
                <input type="submit">
            </form>
        <br />
        <%=new Date()%>
    </body>
</html>
