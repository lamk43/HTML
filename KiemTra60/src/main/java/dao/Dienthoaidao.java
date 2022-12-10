package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.Dienthoaibean;

public class Dienthoaidao {
	public ArrayList<Dienthoaibean> getDienthoai() {
		try {
			ArrayList<Dienthoaibean> ds = new ArrayList<>();
			// b1 Ket noi vao CSDL
			Ketnoidao kn = new Ketnoidao();
			kn.KetNoi();
			
			// b2: Lay du lieu ve
			// b2.1: Thiet lap cau lenh sql
			String sql = "select * from DienThoai";
			// b2.2: Thuc hien cau lenh
			PreparedStatement cmd = kn.Cn.prepareStatement(sql);
			ResultSet rs = cmd.executeQuery();
			
			// b3: Duyet qua tap du lieu rs va luu vao mang ds
			while(rs.next()) {
				// Lay ve ma loai va ten loai
				int Madidong = rs.getInt("Madidong");
			    String tendidong = rs.getString("tendidong");
			    int gia = rs.getInt("gia");
			    int soluong = rs.getInt("soluong");
			    String anh = rs.getString("anh");
			    ds.add(new Dienthoaibean(Madidong, tendidong, gia, soluong, anh));
			}
			
			// b4: dong ket noi
			kn.Cn.close();
			rs.close();
			
			return ds;
			
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
