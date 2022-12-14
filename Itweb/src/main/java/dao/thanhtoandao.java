package dao;

import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

public class thanhtoandao {

	
	public void ThemHoaDon(int makh) {
		try {
			KetNoidao kn = new KetNoidao();
			kn.KetNoi();
			
			// Update bảng hoadon
			String sql = "insert into hoadon values(?,?,?)";
			PreparedStatement cmd = kn.Cn.prepareStatement(sql);
			cmd.setInt(1, makh);
			SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
			Date ngayutil = new Date();
			java.sql.Date ngaysql = new java.sql.Date(ngayutil.getTime());
			cmd.setDate(2, ngaysql);
			cmd.setInt(3, 1);
			cmd.executeUpdate();
			
			
			kn.Cn.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void ThemChiTietHoaDon(int makh, String MaSach, long SoLuong) {
		try {
			KetNoidao kn = new KetNoidao();
			kn.KetNoi();
			
			// Lấy Mã Hóa đơn vừa đc thêm vào từ bảng hoadon
			String sql = "select MaHoaDon from hoadon where makh=?";
			PreparedStatement cmd = kn.Cn.prepareStatement(sql);
			cmd = kn.Cn.prepareStatement(sql);
			cmd.setInt(1, makh);
			ResultSet rs = cmd.executeQuery();
			
			int MaHoaDon = 0;
			while(rs.next()) {
				MaHoaDon = rs.getInt("MaHoaDon");
			}
			
			
			// Update bảng ChiTietHoaDon
			sql = "insert into ChiTietHoaDon values(?,?,?,?)";
			cmd = kn.Cn.prepareStatement(sql);
			cmd.setString(1, MaSach);
			cmd.setLong(2, SoLuong);
			cmd.setInt(3, MaHoaDon);
			cmd.setObject(4, 1);
			
			cmd.executeUpdate();
			
			
			kn.Cn.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
