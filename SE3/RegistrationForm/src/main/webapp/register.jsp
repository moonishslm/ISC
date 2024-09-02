<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form Example</title>
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            font-family: Arial, sans-serif;
        }
        form {
            text-align: center;
            border: 1px solid #ccc;
            padding: 20px;
            border-radius: 10px;
            background-color: #f9f9f9;
        }
        input[type="text"], input[type="date"] {
            margin: 5px 0;
            padding: 8px;
            width: 100%;
            box-sizing: border-box;
        }
        input[type="submit"] {
            margin-top: 15px;
            padding: 10px 20px;
        }
        .error {
            color: red;
            margin-top: 10px;
        }
    </style>
</head>
<body>

<form action="/result" method="post">
    <label for="first_name">First Name:</label>
    <input type="text" id="first_name" name="first_name" value="${firstName}">
    <br />
    <label for="last_name">Last Name:</label>
    <input type="text" id="last_name" name="last_name" value="${lastName}">
    <br />
    <label for="dob">Date of Birth:</label>
    <input type="date" id="dob" name="dob" value="${dob}">
    <br />
    <input type="submit" value="Submit">
    <c:if test="${not empty errorMessage}">
        <div class="error">${errorMessage}</div>
    </c:if>
</form>

</body>
</html>
