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

import bean.giohangbean;
import bean.khachhangbean;
import bo.giohangbo;
import bo.khachhangbo;
import dao.giohangdao;

/**
 * Servlet implementation class ktdnController
 */
@WebServlet("/ktdnController")
public class ktdnController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ktdnController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		khachhangbo tkdao= new khachhangbo();
	 	ArrayList<khachhangbean> dstaikhoan = tkdao.getTaiKhoan();
		String un = request.getParameter("txtun");
		String pass = request.getParameter("txtpass");
		
		RequestDispatcher rd = null;
		if(un!=null && pass!=null) {
			for(khachhangbean item : dstaikhoan) {
				if(un.equals(item.getTendn()) && pass.equals(item.getPass())) {
					HttpSession session = request.getSession();
					session.setAttribute("dn", un);		// tạo đối tượng session
					session.setAttribute("makh", item.getMakh());
					
					// Lấy giỏ hàng trong csdl gán vào session
					giohangdao ghdao = new giohangdao();
					session.setAttribute("gioCSDL", ghdao.getGioHang(item.getMakh()));
					// Xóa dữ liệu giỏ hàng cũ chưa mua trong csdl
					ghdao.XoaCTHD(ghdao.getMaHoaDon(item.getMakh()));
					ghdao.XoaHoaDon(item.getMakh());
					
					
				 	// Nhập giỏ hàng lưu trong CSDL với session gio
				 	ArrayList<giohangbean> ghcsdl = (ArrayList<giohangbean>) session.getAttribute("gioCSDL");
				 	giohangbo ghbo = (giohangbo)session.getAttribute("gio");
				 	if(ghcsdl!=null) {
			  	 		giohangbo gh;
			  		 	if(session.getAttribute("gio")==null){//Mua lan dau
			  			 	gh= new giohangbo();
			  		 		session.setAttribute("gio", gh);
			  		 	}
			  		 	else {
			  		 		for(giohangbean itemGiohangbean: ghcsdl) {
			  	  	 			ghbo.Them(itemGiohangbean.getAnh(), itemGiohangbean.getMasach(), itemGiohangbean.getTensach(), itemGiohangbean.getSoluong(), itemGiohangbean.getGia());
			  	  	 		}
			  	  	 		session.removeAttribute("gioCSDL");
			  	  	 		session.setAttribute("gio", ghbo);
			  		 	}
			  	 	}
					
					
					rd = request.getRequestDispatcher("htsachController");
					break;
				}
				else {
					rd = request.getRequestDispatcher("dangnhap.jsp");
				}
			}
		}
		else {
			rd = request.getRequestDispatcher("dangnhap.jsp");
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
