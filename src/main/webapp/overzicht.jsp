<%@ page import="domain.model.Telefoon" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Gebruiker
  Date: 27-2-2022
  Time: 19:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale1">
    <link rel="stylesheet" href="normalize.css">
    <link rel="stylesheet" href="style.css">
    <title>MarktMedia</title>

</head>
<body>
<figure>
    <img src="img/tel2.jpg" alt="" id="tel">
</figure>
<header>
<nav>
    <ul>
        <li><a href="index.jsp">Home</a></li>
        <li><a href="voegtoe.jsp"> Voeg toe</a></li>
        <li class="hier"><a href="Servlet">Overzicht</a></li>
    </ul>
</nav>
</header>
<main>
    <table>
        <thead>
            <tr>
                <th>Naam</th>
                <th>Prijs</th>
                <th>Productiejaar</th>
                <th>Pas aan</th>
                <th>Verwijder</th>
            </tr>
        </thead>
        <tbody>
        <%
            ArrayList<Telefoon> telefoons = (ArrayList<Telefoon>) request.getAttribute("telefoonlijst");
            for (Telefoon t : telefoons) {
        %>
        <tr>
            <td><%= t.getNaam()%></td>
            <td><%= t.getPrijs()%></td>
            <td><%= t.getProductiejaar()%></td>
            <td>Wijzig</td>
            <td>Verwijder</td>
        </tr>
        <%
            }
        %>
        </tbody>


    </table>

</main>
</body>
</html>
