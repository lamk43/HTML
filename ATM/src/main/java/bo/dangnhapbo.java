package bo;

import bean.taikhoanbean;
import dao.dangnhapdao;

public class dangnhapbo {
    taikhoanbean tk= new taikhoanbean();
    dangnhapdao dn= new dangnhapdao();
    
    public taikhoanbean ktdn (String sotaikhoan, String matkhau) {
    	tk= dn.ktdn(sotaikhoan, matkhau);
    	return tk; 
    }
}
