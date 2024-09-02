<html>
<head>
    <title>Registration Result</title>
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
        }
        .result-container {
            text-align: center;
            border: 1px solid #ccc;
            padding: 20px;
            border-radius: 10px;
            background-color: #fff;
            box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);
            width: 50%;
        }
        h1 {
            color: #333;
        }
        ul {
            list-style-type: none;
            padding: 0;
        }
        li {
            margin-bottom: 10px;
            font-size: 18px;
        }
        p {
            margin: 0;
        }
        b {
            color: #555;
        }
    </style>
</head>

<body>
<div class="result-container">
    <h1>Registration Details</h1>

    <ul>
        <li><p><b>First Name:</b>
            <%= request.getParameter("first_name") %>
        </p></li>
        <li><p><b>Last Name:</b>
            <%= request.getParameter("last_name") %>
        </p></li>
        <li><p><b>Date of Birth:</b>
            <%= request.getParameter("dob") %>
        </p></li>
    </ul>
</div>
</body>
</html>
