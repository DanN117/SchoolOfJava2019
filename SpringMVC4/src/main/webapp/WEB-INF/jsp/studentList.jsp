<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head> <%@ page isELIgnored="false" %> </head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SpringMVC Ex 1</title>
</head>
<body>
<h3>
 <p> ${list[0].name}   ${list[0].college} </p>
 <p> ${list[1].name}   ${list[1].college} </p>
 <p> ${list[2].name}   ${list[2].college} </p>
</h3>

<form action="find" method="post">
		<input type="text" name="name"><br>
		<input type="submit" value="Find">
	</form>

	 Post Result ${result}
</body>
</html>