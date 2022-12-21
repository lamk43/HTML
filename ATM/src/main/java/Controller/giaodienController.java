package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.taikhoanbean;
import bo.dangnhapbo;

/**
 * Servlet implementation class giaodienController
 */
@WebServlet("/giaodienController")
public class giaodienController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public giaodienController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String un = request.getParameter("SoTaiKhoan");
		  String pass= request.getParameter("NhapMatKhau");
		  
		  dangnhapbo dnbo= new dangnhapbo();
		  
		  RequestDispatcher rd;
		  
		  if(un==null && pass== null) {
			  taikhoanbean tk= dnbo.ktdn(un, pass);
			  if(tk!= null) {
				  HttpSession session = request.getSession();
					session.setAttribute("taikhoan", tk);		// tạo đối tượng session
					session.setAttribute("sotaikhoan", tk.getSoTaiKhoan());	
					rd= request.getRequestDispatcher("dangnhap.jsp");
			  }else {
				   rd= request.getRequestDispatcher("giaodien.jsp");
			  }
		  }else {
			  rd= request.getRequestDispatcher("dangnhap.jsp");
		  }
		  rd.forward(request, response);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
