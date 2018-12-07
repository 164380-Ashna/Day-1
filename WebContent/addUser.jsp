<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<a href="/LoginShoppingCart/viewuser.jsp">View All Records</a>
	<br />

	<h1>Add New User</h1>
	<form action="/LoginShoppingCart/validate" method="post">

		<table>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td>Confirm Password:</td>
				<td><input type="password" name="confirmpassword" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="email" name="email" /></td>
			</tr>
			<tr>
				<td>Sex:</td>
				<td><input type="radio" name="sex" value="male" />Male <input
					type="radio" name="sex" value="female" />Female</td>
			</tr>
			<tr>
				<td>Country:</td>
				<td><select name="country" style="width: 155px">
						<option>India</option>
						<option>Canada</option>
						<option>France</option>
						<option>Europe</option>
						<option>Other</option>
				</select></td>
			</tr>
			<tr>
				<td>Choose your security question:</td>
				<td><select name="securityquestion" style="width: 155px">
						<option>Pet's name</option>
						<option>Nick name</option>
						<option>First teacher</option>
						<option>Place of birth</option>
						<option>Your crush</option>
				</select></td>
			</tr>

			<tr>
				<td>Your Securty answer:</td>
				<td><input type="text" name="securityanswer" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Add User" /></td>
			</tr>
		</table>



	</form>

</body>
</html>