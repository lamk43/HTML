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
 * Servlet implementation class naptienController
 */
@WebServlet("/naptienController")
public class naptienController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public naptienController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session =request.getSession();
		
		String tam= request.getParameter("sotiennap");
		String sotaikhoan= (String)session.getAttribute("sotaikhoan");
		ATMbo atmbo= new ATMbo();
		
		RequestDispatcher rd;
		if(tam!= null) {
			int sotiennap= Integer.parseInt(tam);
			if(sotiennap >0) {
				atmbo.NapTien(sotaikhoan, sotiennap);
				atmbo.NapTienCTTK(sotaikhoan, sotiennap);
				rd= request.getRequestDispatcher("giaodien.jsp");
			}else {
				rd= request.getRequestDispatcher("naptien.jsp");
			}
		}
		else {
			rd= request.getRequestDispatcher("naptien.jsp");
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
