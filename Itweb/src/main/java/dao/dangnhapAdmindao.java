
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.dangnhapAdminbean;
import bean.khachhangbean;

public class dangnhapAdmindao {
	public dangnhapAdminbean ktdn(String tendn, String pass) {
		try {
			KetNoidao kn= new KetNoidao();
			kn.KetNoi();
			String sql="select * from Dangnhap where TenDangNhap=? and MatKhau=?";
			PreparedStatement cmd= kn.Cn.prepareStatement(sql);
			cmd.setString(1, tendn);
			cmd.setString(2, pass);
			ResultSet rs=cmd.executeQuery();
			dangnhapAdminbean dn=null;
			if(rs.next()){//Dang nhap dung
				 String TenDangNhap=rs.getString("TenDangNhap");
				 String MatKhau=rs.getString("MatKhau");;
				 boolean Quyen=rs.getBoolean("Quyen");
				 dn=new dangnhapAdminbean(TenDangNhap, MatKhau, Quyen);
			}
			rs.close();kn.Cn.close();
			return dn;
			
		} catch (Exception e) {
			e.printStackTrace();return null;
		}
	}
}
