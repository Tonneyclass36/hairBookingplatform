<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hair Cut Booking</title>
    <script>
        function bookHaircut() {
            var name = document.getElementById('name').value;
            var date = document.getElementById('date').value;
            alert('Thank you, ' + name + '. Your hair cut appointment on ' + date + ' has been confirmed!');
        }
    </script>
</head>
<body>
    <h2>Hair Cut Booking Form</h2>
    <form onsubmit="bookHaircut(); return false;">
        <label for="name">Name:</label><br>
        <input type="text" id="name" name="name" required><br>
        <label for="date">Date:</label><br>
        <input type="date" id="date" name="date" required><br><br>
        <input type="submit" value="Book Now">
    </form>
</body>
</html>

