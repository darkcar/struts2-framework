<h1>Hello, Struts</h1>

<form action="${pageContext.request.contextPath }/form1.action" method="post">
	User name: <input type="text" name="username"><br>
	Password: <input type="password" name="pwd"><br>
	Address: <textarea rows="30" cols="50" name="address"></textarea><br>
	<input type="submit" value="Submit">
</form>