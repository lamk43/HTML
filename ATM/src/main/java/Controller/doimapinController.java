package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bo.ATMbo;

/**
 * Servlet implementation class doimapinController
 */
@WebServlet("/doimapinController")
public class doimapinController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public doimapinController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    HttpSession session= request.getSession();
		    String stk= (String)session.getAttribute("sotaikhoan");
		    String pass= request.getParameter("nhapmatkhau");
		    String pass2= request.getParameter("nhaplaimatkhau");
		    
		    ATMbo atmbo= new ATMbo();
		    RequestDispatcher rd;
		    
		    if(pass !=null && pass2 != null) {
		    	if (pass.equals(pass2)) {		    		
		    		
		    		atmbo.DoiMaPIN(stk, pass);
		    		rd= request.getRequestDispatcher("giaodien.jsp");
		    	}else {
		    		rd= request.getRequestDispatcher("doimapin.jsp");
		    	} 	
		    }else {
		    	rd= request.getRequestDispatcher("doimapin.jsp");
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
