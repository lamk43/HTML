package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Dienthoaibean;


import bo.dienthoaibo;



/**
 * Servlet implementation class htHomeController
 */
@WebServlet("/htHomeController")
public class htHomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Object request;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public htHomeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			request.setCharacterEncoding("utf-8");
	  	 	response.setCharacterEncoding("utf-8");
			
			dienthoaibo dbo = new dienthoaibo();
			ArrayList<Dienthoaibean>  dsDienthoai = dbo.getDienthoai();
			
			String key= request.getParameter("txttk");
		
			if(key!=null) {
				dsDienthoai=dbo.Tim(key);
			}
			request.setAttribute("dsDienthoai", dsDienthoai);
			
		            RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
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
