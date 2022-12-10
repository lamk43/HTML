package bo;

import java.util.ArrayList;

import bean.khachhangbean;
import dao.dangnnhapdao;

public class khachhangbo {
	dangnnhapdao dndao = new dangnnhapdao();
	ArrayList<khachhangbean> ds;
	
	public ArrayList<khachhangbean> getTaiKhoan() {
		ds = dndao.getTaiKhoan(); // sai thang dao lay ve
		return ds;
	}
}
