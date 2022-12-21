<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@page import="bean.chitiettaikhoan"%>
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
	      <li><a style="text-align: right;" href="dangnhapController"> Logout</a></li>

	    </ul>
	  </div>
	</nav>
 <h1 style="font-size:60px; text-align:center" >ROCKET BANK</h1>
 <h2>Lịch sử giao dịch</h2>	
 			<table class="table table-hover">
	 			 <tr>
				 	
				    <td><b>id</b></td>
				    <td><b>Ngày rút tiền</b></td>
				    <td><b>Số tiền rút ra</b></td>
				    <td><b>Số tài khoản</b></td>
				    <td><b>Ghi chú</b></td>
			     </tr>
		      	 <% ArrayList<chitiettaikhoan> ls = (ArrayList<chitiettaikhoan>) session.getAttribute("ls");
		      		if(ls!=null) {
		      			for(chitiettaikhoan ds : ls) {%>
				      	 	<tr>
				      	 		<td> <%=ds.getId()%></td>
					      	 	<td> <%=ds.getNgayRutTien()%></td>
					      	 	<td> <%=ds.getSoTienRutRa()%> </td>
					      	 	<td> <%=ds.getSoTaiKhoan()%></td>
					      	 	<td> <%=ds.getGhichu()%></td>
				      	 	</tr>
		 			<% }} else{ %>
		 			 		<p>Lịch sử trống<a href="lsController"></a></p>
		 			<%}%>
	      	 </table>
 		
 
</body>
</html>