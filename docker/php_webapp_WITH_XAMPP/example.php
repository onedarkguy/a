<?php
$userInput = $_POST["user_input"] ?? ""; 
?>
<!DOCTYPE html>
<html>
<head>
    <title>User Input</title>
</head>
<body>
    <h1>Enter Something:</h1>
    <form method="POST">
        <input type="text" name="user_input" required>
        <button type="submit">Submit</button>
    </form>
    <h2>You Entered: <?php echo $userInput; ?></h2>
</body>
</html>
