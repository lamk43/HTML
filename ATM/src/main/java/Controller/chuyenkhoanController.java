package Controller;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bo.ATMbo;
import dao.ATMdao;

/**
 * Servlet implementation class chuyenkhoanController
 */
@WebServlet("/chuyenkhoanController")
public class chuyenkhoanController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public chuyenkhoanController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd;  
		if(request.getParameter("nhapsotienchuyen")!=null) {
			  HttpSession session= request.getSession();
			  String sotaikhoan= (String) session.getAttribute("sotaikhoan");
			  String sotaikhoannhan= request.getParameter("nhapsotienchuyen");
			  int sotienchuyen = Integer.parseInt(request.getParameter("nhapsotienchuyen"));
			  ATMdao atm =new ATMdao();
			  System.out.print("OKKKKK");
			  if(atm.chuyenkhoan(sotaikhoan, sotaikhoannhan, sotienchuyen)) {
				  rd= request.getRequestDispatcher("giaodienController");
			  }
			  else {
				  rd= request.getRequestDispatcher("giaodienController");
			  }
		  }
		  else {
			  rd = request.getRequestDispatcher("chuyenkhoan.jsp");
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
