package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ATMdao;


/**
 * Servlet implementation class dangkyController
 */
@WebServlet("/dangkyController")
public class dangkyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dangkyController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String SoTaiKhoan = request.getParameter("txtsotk");
		String HoTen = request.getParameter("txthoten");
		String SoTien = request.getParameter("txtSoTien");
		String MatKhau = request.getParameter("txtpass");
		String DiaChi = request.getParameter("txtdiachi");
		String SDT = request.getParameter("txtsodt");
		String Email = request.getParameter("txtemail");

		RequestDispatcher rd;
		
		if(SoTaiKhoan!=null && HoTen!=null && SoTien!=null && MatKhau!=null && DiaChi!=null && SDT!=null && Email!=null ) {
			ATMdao dkdao = new ATMdao();
			dkdao.dangky(SoTaiKhoan, HoTen, SoTien, MatKhau, DiaChi, SDT, Email);
			rd = request.getRequestDispatcher("giaodien.jsp");
		} 
		else {
			rd = request.getRequestDispatcher("dangky.jsp");
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
