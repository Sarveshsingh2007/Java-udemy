<%@ page language="java" %>

<!DOCTYPE html>
<html>

<head>
    <link rel="stylesheet" href="style.css">
</head>

<body>

    <h2>Add User Data</h2>

    <form action="addAlien" method="get">
        <label for="aId">Enter Id:</label>
        <input type="text" id="aId" name="aId">
        <label for="aName">Enter Name:</label>
        <input type="text" id="aName" name="aName">
        <input type="submit" value="Submit">
    </form>

</body>
</html>