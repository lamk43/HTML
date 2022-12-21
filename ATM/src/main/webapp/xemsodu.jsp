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
  	 	<style type="text/css">
  	  .navbar {
	    position: relative;
	    min-height: 50px;
	    border: 1px solid transparent;
	    margin-bottom: 0;
	    }   
		 .chucnanggiaodien {
		text-align: center;
		position: absolute;
	    top: 175px;
	    flex-direction: column;
	    align-items: center;
	    margin: 0 40% 0 40%;
	}
	   h1 {
    width: max-content;
	color: white;
    }
       h2 {
        text-align: center;
	    
	    color: white;
}
  	</style>
</head>
<body>
<nav class="navbar navbar-inverse">
	  <div class="container-fluid">
	    <ul class="nav navbar-nav">
	      <li class="active"><a href="giaodienController">Trang chủ</a></li>
	    </ul>
	    <ul class="nav navbar-nav navbar-right">
	      <li><a style="text-align: right;" href="dangnhapController"> Logout</a></li>

	    </ul>
	  </div>
	</nav>
	<img alt="" src="img/1200px-NASA-HS201427a-HubbleUltraDeepField2014-20140603.jpg" style="width: 100%"/>
<div class="chucnanggiaodien">
 <h1 style="font-size:60px; text-align:center" >ROCKET BANK</h1>
 <h2>Số Dư</h2>
 <div style="color: white;">
   <% long sodu= (long)request.getAttribute("sodu"); %>
   <%= sodu %>
   </div>
   <form action="giaodien.jsp" method="post">
   <input type="submit" value="Quay Lại">
   </form>
 </div>
</body>
</html>