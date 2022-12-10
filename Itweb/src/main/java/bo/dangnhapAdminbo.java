package bo;

import java.util.ArrayList;

import bean.dangnhapAdminbean;
import bean.khachhangbean;
import dao.dangnhapAdmindao;
import dao.dangnnhapdao;

public class dangnhapAdminbo {
	  dangnhapAdmindao dndao= new dangnhapAdmindao();
	  public dangnhapAdminbean ktdn(String tendn, String pass) {
		  return dndao.ktdn(tendn, pass);
	  }

}
