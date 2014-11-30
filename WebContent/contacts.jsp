<%@page import="org.apache.derby.impl.load.Import"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/starter-template.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*" %>
<title>IAMWeb</title>
</head>
<body>


<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">IAMWeb</a>
        </div>
        <div class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li><a href="index.jsp">Home</a></li>
            <li class="active"><a href="#">View Contacts</a></li>
            <li><a href="#insert">New Contact</a></li>
            <li><a href="#editdelete">Edit/Delete</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </div>
    
    <div class="container">

      <div class="starter-template">
        <h1>Contacts</h1>
      </div>

    </div>
    
    <div class="container">
	    <table class="table table-hover">
			<c:forEach var="item" items="${contactList}">
			    <tr><td><c:out value="${item}" /></td></tr>
			</c:forEach>
		</table>
	</div>
		
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>