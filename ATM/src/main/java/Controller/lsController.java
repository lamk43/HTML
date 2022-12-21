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

import bean.chitiettaikhoan;

import dao.ATMdao;


/**
 * Servlet implementation class lsController
 */
@WebServlet("/lsController")
public class lsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public lsController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher rd;
		
		
		
		if(session.getAttribute("sotaikhoan")!=null) {
			
			String soTaiKhoa = (String) session.getAttribute("sotaikhoan");
			ATMdao lsdao = new ATMdao();
			ArrayList<chitiettaikhoan> ls = lsdao.XemLSGD(soTaiKhoa);
			session.setAttribute("ls", ls);
			
			rd = request.getRequestDispatcher("lsgd.jsp");
			rd.forward(request, response);
		}
		else {
			rd = request.getRequestDispatcher("dangnhapController");
		 	rd.forward(request, response);
		}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
