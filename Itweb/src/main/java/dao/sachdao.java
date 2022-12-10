package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.loaibean;
import bean.sachbean;

public class sachdao {
	public ArrayList<sachbean> getSach() {
		try {
			ArrayList<sachbean> ds = new ArrayList<>();
			// b1 Ket noi vao CSDL
			KetNoidao kn = new KetNoidao();
			kn.KetNoi();
			
			// b2: Lay du lieu ve
			// b2.1: Thiet lap cau lenh sql
			String sql = "select * from sach";
			// b2.2: Thuc hien cau lenh
			PreparedStatement cmd = kn.Cn.prepareStatement(sql);
			ResultSet rs = cmd.executeQuery();
			
			// b3: Duyet qua tap du lieu rs va luu vao mang ds
			while(rs.next()) {
				// Lay ve ma loai va ten loai
				String masach = rs.getString("masach");
			    String tensach = rs.getString("tensach");
			    String tacgia = rs.getString("tacgia");
			    Long gia = rs.getLong("gia");
			    Long soluong = rs.getLong("soluong");
			    String anh = rs.getString("anh");
			    String maloai = rs.getString("maloai");
			    ds.add(new sachbean(masach, tensach, tacgia, gia, soluong, anh, maloai));
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
	
	
	public ArrayList<sachbean> TimMa(String ma){
	   	ArrayList<sachbean> tam= new ArrayList<sachbean>();
	   	ArrayList<sachbean> ds= getSach();
	   	for(sachbean s: ds)
	   		if(s.getMaloai().equals(ma))
	   			tam.add(s);
	   	return tam;
    }
	
	
	public ArrayList<sachbean> Tim(String key){
   	 	ArrayList<sachbean> tam= new ArrayList<sachbean>();
   	 	ArrayList<sachbean> ds= getSach();
   	 	for(sachbean s: ds)
   	 		if(s.getTensach().toLowerCase().trim().contains(key.toLowerCase().trim()) || s.getTacgia().toLowerCase().trim().contains(key.toLowerCase().trim())||s.getMaloai().toLowerCase().trim().contains(key.toLowerCase().trim()))
   	 			tam.add(s);
   	 	return tam;
    }



}
