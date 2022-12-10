<%@page import="java.lang.reflect.Array"%>
<%@page import="bo.dienthoaibo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.Dienthoaibean"%>
<%@page import="dao.Dienthoaidao"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Bán ĐIỆN THOẠI Online</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>


 <table width="1000" align="center">
 	<tr>
 		<td colspan="3">
 			<h1>BÁN ĐIỆN THOẠI ONLINE</h1>
 		</td>
 	</tr>
 	
 	<tr>
 		<td width="800" valign="top" >
 			 <table class="table table-hover">
      	 	<%
      	 		ArrayList<Dienthoaibean> dsDienthoai = (ArrayList<Dienthoaibean>) request.getAttribute("dsDienthoai");
      	 	   	int n = dsDienthoai.size();
      	 		for(int i=0;i<n;i++){
      	 			Dienthoaibean s=dsDienthoai.get(i);
      	 			%>
	      	 		<tr>
	      	 		   <td>
		      	 		   <img src="<%=s.getAnh() %>"><br>
		      	 		Mã:   <%=s.getMadidong() %> <br>
		      	 		Tên:   <%=s.getTendidong() %> <br>
		      	 		Giá:   <%=s.getGia() %> $ <br> 
		      	 		Số Lượng:   <%=s.getSoluong() %> <br>
		      	 		Thành Tiền:   <%=s.getSoluong()*s.getGia() %> $ <br>
	      	 		   </td>
	      	 		   <%i++;
	      	 		   if(i<n){
	      	 			s=dsDienthoai.get(i);
	      	 		     %>
	      	 		   <td>
		      	 		   <img src="<%=s.getAnh() %>"><br>
		      	 	    Mã:   <%=s.getMadidong() %> <br>
		      	 		Tên:   <%=s.getTendidong() %> <br>
		      	 		Giá:   <%=s.getGia() %> $ <br> 
		      	 		Số Lượng:   <%=s.getSoluong() %> <br>
		      	 		Thành Tiền:   <%=s.getSoluong()*s.getGia() %> $ <br> 
		      	 		   
	      	 		   </td>
	      	 		   <%} %>
	      	 		  
	      	 		  
	      	 		</tr>
	      	 	<%} %>
      	 	</table>
 		</td>
 		
 		
 		
 		<td width="200" valign="top" class="form-control"> 
 			 <form action="htHomeController" method="post">
				  <input class="form-control" name="txttk" type="text" value="" placeholder="Nhap tt"> <br>
				  <input name="butt" type="submit" value="Search" class="btn-primary">
			</form>
 		</td>
 		
 		
 	</tr>
 </table>
</body>
</html>