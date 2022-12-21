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
import javax.websocket.Session;

import bo.ATMbo;
import dao.ATMdao;

/**
 * Servlet implementation class ruttienController
 */
@WebServlet("/ruttienController")
public class ruttienController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ruttienController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session= request.getSession();
		String sotien= request.getParameter("st");
		String sokhac= request.getParameter("sokhac");
		String stk= (String)session.getAttribute("sotaikhoan");
		ATMbo atm =new ATMbo();
		RequestDispatcher rd;
		
		if(sotien!=null) {
			long sotien1=Long.parseLong(sotien);
			atm.RutTien(stk, sotien1, "Rút tiền");
			rd= request.getRequestDispatcher("giaodien.jsp");
		}else {
			if(sokhac!=null) {
				long sokhac1=Long.parseLong(sokhac);
				if(sokhac1>=50000 && sokhac1%50000==0) {
					atm.RutTien(stk, sokhac1, "Rút tiền");
					rd= request.getRequestDispatcher("giaodien.jsp");
				}else {
					rd= request.getRequestDispatcher("sokhac.jsp");
				}
			}else {
				rd= request.getRequestDispatcher("ruttien.jsp");
			}
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
