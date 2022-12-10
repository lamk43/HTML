package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.dangnhapAdminbean;
import bean.giohangbean;
import bean.khachhangbean;
import bo.dangnhapAdminbo;
import bo.giohangbo;
import bo.khachhangbo;
import dao.giohangdao;

/**
 * Servlet implementation class dangnhapAdminController
 */
@WebServlet("/dangnhapAdminController")
public class dangnhapAdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dangnhapAdminController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String un=request.getParameter("txtun");
	 	String pass=request.getParameter("txtpass");
	 	RequestDispatcher rd;
	 	
	 	
	 	if(un!=null&&pass!=null) {
	 		dangnhapAdminbo dnbo= new dangnhapAdminbo();
	 		dangnhapAdminbean dn =dnbo.ktdn(un, pass);
	 	if(dn!=null) {
            HttpSession session = request.getSession();//Tao doi tuong session
            session.setAttribute("Admin", dn);
            rd= request.getRequestDispatcher("AdminController");
 	 	}
	 	else
	 		  rd= request.getRequestDispatcher("dangnhapAdmin.jsp?kt=1");	
	 	}else
	 		 rd= request.getRequestDispatcher("dangnhapAdmin.jsp");
	 		
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
