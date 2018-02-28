<h1>Hello, Struts</h1>

<form action="${pageContext.request.contextPath }/data3" method="post">
	User name: <input type="text" name="user.username"><br>
	Password: <input type="password" name="user.password"><br>
	Address: <textarea rows="30" cols="50" name="user.address"></textarea><br>
	BookName: <input type="text" name="book.bookName"><br>
	BookPrice: <input type="text" name="book.bookPrice"><br>
	<input type="submit" value="Submit">
</form>