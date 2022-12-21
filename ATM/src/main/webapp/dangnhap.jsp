<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>rocket_bank</title>
    <meta charset="UTF-8">
    <style type="text/css">
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        
        html {
            width: 100%;
            height: 100%;
        }
        
        body {
            width: 100%;
            height: 100%;
            overflow: hidden;
        }
        
        #main {
            width: 100%;
            height: 100%;
            background white;
        }
        
        #container {
            display: flex;
            align-items: flex-end;
            width: 100%;
            margin: auto;
            overflow: hidden;
            justify-content: center;
            align-items: center;
        }
        
        .banner {
            width: 650px;
            text-align: center;
            margin-bottom: 20px;
        }
        
        .logo {
           
                margin-top: 50px;
			    display: inline-block;
			    text-align: -webkit-center;
        }
        
        .logo>a {
            display: block;
            width: 112px;
            height: 112px;
            width: 112px;
        }
        
        a>img {
            width: 100%;
            height: 100%;
        }
        
        .sub-banner {
            margin-top: 70px;
        }
        
        .login {
            width: 350px;
            z-index: 1;
        }
        
        form {
            width: 320px;
            border: 5px solid #6bb9f0;
            background: #f7f7f7;
            padding: 15px;
            height: 370px;
            margin: 0 auto;
            margin-top: 205px;
            position: relative;
        }
        
        input {
            padding: 8px 10px;
            width: 100%;
        }
        
        input[type="submit"] {
            margin: 20px auto;
            padding: 8px 12px;
            font-size: 15px;
            line-height: 1.3333333;
            border-radius: 4px;
            color: #fff;
            background-color: #337ab7;
            border-color: #2e6da4;
            border: 1px solid transparent;
            cursor: pointer;
        }
        
        input[type="submit"]:hover {
            color: #fff;
            background-color: #286090;
            border-color: #204d74;
        }
        
        form>img {
            border: 5px solid #fff;
            border-radius: 50%;
            position: absolute;
            right: 20px;
            margin-top: -45px;
        }
        
        h2 {
            margin: 14px 0 20px;
            color: #006eb7;
            font-weight: bold;
            font-family: Calibri;
            font-size: 26px;
            text-transform: uppercase;
        }
        
        p {
            font-family: Arial, sans-serif;
            font-size: 12px;
            line-height: 1.42857143;
            color: #333;
            font-weight: bold;
            margin-bottom: 5px;
            margin-top: 10px;
        }
        
        #footer {
            width: 100%;
            height: 140px;
            bottom: 0;
            position: absolute;
            background: linear-gradient(transparent, #7fbbe3 30%, #337ab7);
        }
        
        .container {
            font-family: Arial, sans-serif;
            color: #fff;
            text-align: center;
            font-size: 12px;
        }
        
        .container>a {
            display: block;
            color: #fff;
            text-decoration: none;
            margin-bottom: 6px;
        }
        
        .container>a:hover {
            text-decoration: revert;
        }
        
        .address {
            display: flex;
            justify-content: center;
            align-items: center;
        }
        
        .address>p {
            color: #fff;
        }
        
        .contact {
            display: flex;
            align-items: center;
            justify-content: center;
        }
        
        .contact>p {
            color: #fff;
        }
        .navbar {
        	margin: auto;
		    position: relative;
		    min-height: 50px;
		    border: 1px solid transparent;
		}
    </style>
</head>

<body>
<nav class="navbar navbar-inverse">
	  <div class="container-fluid">
	    <ul class="nav navbar-nav">
	      <li class="active"><a href="dangnhapController">Trang chủ</a></li>
	    </ul>
	    <ul class="nav navbar-nav navbar-right">
	      <li><a style="text-align: right;" href="ktdnController"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
	      <li><a href="dangkyController"><span class="glyphicon glyphicon-sign-up"></span> Sign Up</a></li>
	    </ul>
	  </div>
	</nav>
    <div id="main">
        <div id="container">
            <div class="banner">
                <div class="logo">
                <h1 style="color: black; padding-top: 100" >ROCKET BANK</h1>
                    <a href="dangnhapController"> <img alt="" src="img/iconrocket.png"/>
                    </a>
                </div>
            </div>
            <div class="login">
        <div class="login" style="text-align: center">
                <form action="dangnhapController">
                    <h2 style="color: black;">Đăng Nhập</h2>
                    <p>Số tài khoản:</p>
                    <input type="text" placeholder="Nhập số tài khoản" name="SoTaiKhoan">
                    <p>Mật khẩu:</p>
                    <input type="password" placeholder="Nhập mật khẩu" name="NhapMatKhau"><br>
                    <input style="background: black; color: white; font-weight: bold;font-size: 17px; margin-top: 10px;" type="submit" value="Đăng nhập">
                </form>
</div>
</div>
</div>
</body>
</html>