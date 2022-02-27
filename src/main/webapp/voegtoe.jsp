<%--
  Created by IntelliJ IDEA.
  User: Gebruiker
  Date: 27-2-2022
  Time: 19:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale1">
    <link rel="stylesheet" href="normalize.css">
    <link rel="stylesheet" href="style.css">
</head>
<body>
<figure>
    <img src="img/tel2.jpg" alt="" id="tel">
</figure>
<header>
<nav>
    <ul>
        <li><a href="index.jsp">Home</a></li>
        <li class="hier"><a href="voegtoe.jsp">Voeg toe</a></li>
        <li><a href="overzicht.jsp">Overzicht</a></li>
    </ul>
</nav>
</header>
<main>
    <p>
        <label for="naam">Naam</label>
        <input type="text" id="naam" placeholder="" required>
    </p>
    <p>
        <label for="prijs">Prijs</label>
        <input type="text" id="prijs" placeholder="" required>
    </p>
    <p>
        <label for="productiejaar">Productiejaar</label>
        <input type="text" id="productiejaar" placeholder="" required>
    </p>

    <p>
        <input type="submit" value="Submit" >
    </p>
</main>

</body>
</html>
