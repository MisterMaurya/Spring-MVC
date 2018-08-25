<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body margin=10>
<h1>${res}</h1>
<form:errors path="student.*"></form:errors>
<form action="save" method="post">
<pre>
ID        :<input type="text" name="id"><br>
NAME      :<input type="text" name="name"><br>
EMAIL     :<input type="text" name="email"><br>
PASSWORD  :<input type="text" name="password"><br>
MOBILE NO.:<input type="text" name="mobileNo"><br>
DOB       :<input type="date" name="dob"><br>
GENDER    : MALE<input type="radio" name="gender" value="MALE" checked="checked"> FEMALE<input type="radio" name="gender" value="FEMALE"><br>
PINCODE   :<input type="text" name="studentAdd.pincode"><br>
CITY      :<input type="text" name="studentAdd.city"><br>
COUNTRY   :<input type="text" name="studentAdd.country"><br>
<input type="submit" value="submit">
</pre>
</form>
<pre>
${student.id}<br>
${student.name}<br>
${student.email}<br> 
${student.password}<br>
${student.mobileNo}<br> 
${student.dob}<br>
${student.gender}<br> 
${student.studentAdd.pincode}<br>
${student.studentAdd.city}<br> 
${student.studentAdd.country}<br>
   
</pre>


</body>
</html>