<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>Rocket_bank</title>
<style type="text/css">
  .navbar {
    position: relative;
    min-height: 50px;
    border: 1px solid transparent;
    margin-bottom: 0;
}      
  .chucnanggiaodien {
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
	color: white;
}
   h3{
    color: white;
   }
   
   .content-chucnang>a{
  		width: 200px;
  		 font-size: 20px;
    	 font-weight: bold;
   }
   
   .content-chucnang{
  		.display: flex;
   		 justify-content: space-between;
   		 margin-top: 10px;
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
<h1> ROCKET BANK</h1>
<h2>Chuyển khoản</h2>

<div class="content-chucnang">
<form action="chuyenkhoanController" method="post">
	<label style="color: white;">Nhập số tài khoản người nhận</label><br>
	<input type="text" name="sotaikhoannguoinhan"><br>
	<label style="color: white;">Số tiền</label><br>
	<input type="number" name="nhapsotienchuyen"><br>
	<a href="giaodienController" class="btn btn-primary">Trở lại</a>
	<input  type="submit" value=" Đồng ý" style="color: black;">
</form>
</div>
</div>
</body>
</html>