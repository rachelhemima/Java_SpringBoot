<html xmlns:th="http://www.thymlead.org">
<head>
<meta charset="ISO-8859-1">
<title>Jobiak.ai</title>
</head>
<body>
<h1>SignupForm Success</h1>
U r Mobile No:<h2 th:text="${signupBean.mobile}" style='background-color: rgb(255, 128, 255);'></h2>
Email :<h2 th:text="${signupBean.email}" style='background-color: rgb(0, 255, 255);'></h2>
Aadhar No :<h2 th:text="${signupBean.aadhar}" style='background-color: rgb(0, 255, 64);'></h2>
</body>
</html>