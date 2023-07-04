<!DOCTYPE html>
<html>
<head>
    <title>Add Message</title>
</head>
<body>
    <h1>Add Message</h1>
    <form action="MessageController" method="post">
        <input type="hidden" name="action" value="addMessage">
        User ID: <input type="number" name="uid" required><br>
        From: <input type="text" name="from" required><br>
        To: <input type="text" name="to" required><br>
        Message: <textarea name="msg" required></textarea><br>
        <button type="submit">Add Message</button>
    </form>
</body>
</html>
