<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<html>
<head>
<title>Insert Person</title>
</head>
<body>

	<h2>Enter Person Details</h2>

	<form method="post" action="save" enctype="multipart/form-data">
		Name: <input type="text" name="name" /><br /> City: <input type="text"
			name="city" /><br />

		<!-- ✅ THIS IS WHAT'S MISSING IN YOUR CODE -->
		Text:
		<textarea name="text"></textarea>
		<br /> Image: <input type="file" name="image" /><br /> Video: <input
			type="file" name="video" /><br /> <input type="submit" value="Save" />
	</form>

</body>
</html>
