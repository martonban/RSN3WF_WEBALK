<html>
<head>
    <title>Calculator</title>
</head>
<body>
<%
    //Hha a szerverlettől jött, akkor van, ha első kewresés akkor nincs
    szamologepszervlet.ResultDto  result = (szamologepszervlet.ResultDto) request.getAttribute("result");

    String resultText = (result == null) ?
            "" : "result " + result.toString();
%>

ver: 0.2
<form method="post" action="/szamologepszerverlet/szamologep.do">
    <input type="text" name="a" /><br>
    <input type="text" name="b" /><br>
    <select name="operator">
        <option value="+" /> +
        <option value="-" /> -
        <option value="*" /> *
        <option value="/" /> /
    </select><br>

    <%= resultText %>
    <input type="submit" /><br>
</form>




</body>
</html>