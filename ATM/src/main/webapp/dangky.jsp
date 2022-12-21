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

	      <a href="dangnhapController">Trang chủ</a>

	    <ul style="text-align:right;" class="nav navbar-nav navbar-right">
	      <a style="text-align: right;" href="dangnhapController"><span class="glyphicon glyphicon-log-in"></span> Login</a>
	    </ul>
	  </div>
	</nav>



 	<table width="1000" align="center">
 
	 	<tr>
	 		<td colspan="3">
	 			<h1 style="font-size:60px; text-align:center" >ROCKET BANK</h1>
 				<h2 style="text-align:center">Đăng ký</h2>
	 		</td>
	 	</tr>
	 	
	 	<tr style="text-align:center">
	 		
	 		<td width="800" valign="top" >
	 			 <form action="dangkyController" method="post">
	 			    Nhập Số tài khoản<input name="txtsotaikhoan" type="text" placeholder="Nhập Số tài khoản"><br><br>
	 			 	Nhập Họ tên: <input name="txthoten" type="text" placeholder="Nhập Họ tên"> <br><br>
	 			 	Nhập Số Tiền: <input name="txtsotien" type="text" placeholder="Nhập Số tiền"> <br><br>
	 			 	Nhập Mật khẩu: <input name="txtpass" type="password" placeholder="Nhập Mật khẩu"> <br><br>
	 			 	Nhập Địa chỉ :<input name="txtdiachi" type="text" placeholder="Nhập Địa chỉ"> <br><br>
	 			 	Nhập Số điện thoại: <input name="txtsodt" type="text" placeholder="Nhập Số điện thoại"> <br><br>
	 			 	Nhập Email: <input name="txtemail" type="email" placeholder="Example@gmail.com"> <br><br>
				  
				  
				  	
				  	<input name="signup" type="submit" value="Sign up">
				</form>
	 		</td>
	 		
	 	</tr>
 	
 	</table>

</body>
</html>