<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> jsp </title>
</head>
<body>
<!-- <form action="b.jsp">
input <input type="text" name="name">
<button>Submit</button>
</form> -->

 <%! int a=10; %>	
<%-- <%=a %> --%>

<%! String demo(String a){
	return a;
}
	%>
	
	<%=demo("declaration") %>
	<%=demo("hello") %>
	<%=a %>
</body>
</html>