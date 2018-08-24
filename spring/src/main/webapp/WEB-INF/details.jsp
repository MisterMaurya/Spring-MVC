<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
<form action="save" method="post">
Name  :<input type="text" name="name"><br><br>
Hobby :<input type="text" name="hobby"><br><br>
<input type="submit" value="submit">

<br><br><br>
${msg.name}
${name}
${msg.hobby}

</form>
</body>
</html>