<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body bgcolor=green text="yellow">
<center>
<h2 style="color:red;text-align:center">Welcome To Prem HealthCare</h2>
<h2 style="color:yellow;text-align:center">We are Giving Best Hospitality To Our Doctors<hr></h2>
<h2 style="color:blue;text-align:center">Please Provide The Details To Add Your Information Into Our Hospital<hr></h2>
<form action="addDoctor.do" method="post">
<table>
<tr><td>Doctor-name:</td><td><input type="text"  name="doctorName"/></td></tr>
<tr><td>Qualification:</td><td><input type="text"  name="qualification"/></td></tr>
<tr><td>Specialization:</td><td><input type="text"  name="specialization"/></td></tr>
<tr><td>Experience:</td><td><input type="text"  name="experience"/></td></tr>
<tr><td>Age:</td><td><input type="text"  name="age"/></td></tr>
<tr><td>Gender:</td><td><input type="radio" name="gender" value="Male"/>Male<input type="radio" name="gender" value="Female">Female</td></tr>
<tr><td>Mobile:</td><td><input type="text"  name="mobile"/></td></tr>
<tr><td>Email-Address:</td><td><input type="text"  name="emailAddress"/></td></tr>
<tr><td colspan="2" align="right"><input type="submit" value="Submit"/></td></tr>
</table>
</center>
</body>
</html>