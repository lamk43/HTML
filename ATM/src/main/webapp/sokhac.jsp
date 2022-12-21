<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Rocket Bank</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-inverse">
	  <div class="container-fluid">
	    <ul class="nav navbar-nav">
	      <li class="active"><a href="giaodienController">Trang chủ</a></li>
	    </ul>
	    <ul class="nav navbar-nav navbar-right">
	      <li><a style="text-align: right;" href="dangnhapController"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>

	    </ul>
	  </div>
	</nav>
 <h1>ROCKET BANK</h1>
 <form action="ruttienController" method="post">
	  <input type="text" name="sokhac">
	 <input type="submit" name="Rút">
 </form>
</body>
</html>