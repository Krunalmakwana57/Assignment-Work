<!DOCTYPE html>
<html>
<head>
    <title>Add User</title>
</head>
<body>
    <h1>Add User</h1>
    <form action="UserController" method="post">
        <input type="hidden" name="action" value="addUser">
        First Name: <input type="text" name="fname" required><br>
        Last Name: <input type="text" name="lname" required><br>
        Email: <input type="email" name="email" required><br>
        Mobile: <input type="text" name="mobile" required><br>
        <button type="submit">Add User</button>
    </form>
</body>
</html>
