package bo;

import java.util.ArrayList;

import bean.chitiettaikhoan;
import dao.ATMdao;
import dao.dangnhapdao;

public class ATMbo {
	ATMdao atmdao = new ATMdao(); 
	  public long XemSoDu(String sotaikhoan) {
		  return atmdao.XemSoDu(sotaikhoan);
    }
	  public void NapTien (String sotaikhoan, int sotiennap) {
		  atmdao.NapTien(sotaikhoan, sotiennap);
	  }
	  public void NapTienCTTK (String sotaikhoannhan, int sotiennap) {
		  atmdao.NapTienCTTK(sotaikhoannhan, sotiennap);
	  }
	  
	    public void DoiMaPIN (String sotaikhoan, String maPINmoi) {
	    	atmdao.DoiMaPIN(sotaikhoan, maPINmoi);
	    }
	    public boolean RutTien (String sotaikhoan, long sotienrut, String ghichu) {
	    	return atmdao.RutTien(sotaikhoan, sotienrut, ghichu);
	    }
	    public ArrayList<chitiettaikhoan> XemLSGD(String sotaikhoan){
	    	return atmdao.XemLSGD(sotaikhoan);
	    }
	    public boolean chuyenkhoan(String sotaikhoan, String sotaikhoannhan, int sotienchuyen) {
	    	return atmdao.chuyenkhoan(sotaikhoan, sotaikhoannhan, sotienchuyen);
	    }
}
