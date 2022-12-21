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
	<div >
	    <img  alt="" src="img/1200px-NASA-HS201427a-HubbleUltraDeepField2014-20140603.jpg" style="width: 100%"/>
		</div>
<div id="main">
<div class="chucnanggiaodien">
 <h1 style="font-size:60px; text-align:center" >ROCKET BANK</h1>
 
<div style="text-align: center;">
	 <h2>Chức Năng</h2>
</div>
 <div  style="text-align: center;">
 	<h3>Mời bạn chọn chức năng</h3>
 </div>
<div class="chucnang" style="text-align: center;width: 500px;">

	<div class="content-chucnang">
		<a class="btn btn-info" role="button" href="ruttienController">Rút tiền</a> 
	 	<a class="btn btn-info" role="button"  href="naptienController">Nạp tiền</a>
	</div>
	<div class="content-chucnang">
		<a class="btn btn-info" role="button" href="xemsoduController">Xem số dư</a> 
	  	<a class="btn btn-info" role="button"  href="chuyenkhoanController">Chuyển khoản</a>
	  
	</div>
	<div class="content-chucnang">
		<a class="btn btn-info" role="button" href="lsController">Lịch Sử</a>
	  	<a class="btn btn-info" role="button" href="doimapinController">Đổi mã pin</a>
	</div>
	 
</div>
</div>
</div>
</body>
</html>