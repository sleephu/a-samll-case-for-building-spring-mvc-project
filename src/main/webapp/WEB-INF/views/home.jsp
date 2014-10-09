<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap-theme.min.css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<form action="user/test" method="post">
	First Name: <input name="firstName" type="text" /><br/>
	<input type="submit" />
</form>
<a id="getAll">Get user JSON</a>
<table class="table table-hover">
	<thead>
		<tr>
			<td>First Name</td>
			<td>Last Name</td>
		</tr>
	</thead>
	<tbody></tbody>
</table>
<script>
$(function() {
	$("#getAll").click(function() {
		$.ajax({
			url: "user/all",
			success: function(result) {
				$.each(result, function(index, element) {
					$('tbody').after('<tr><td>' + element.firstName + '</td><td>' + element.lastName + '</td></tr>');
				});
			}
		});
	});
});
</script>
</body>
</html>
