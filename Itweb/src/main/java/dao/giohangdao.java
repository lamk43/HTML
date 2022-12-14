package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import bean.giohangbean;

public class giohangdao {

	public void ThemHoaDon(int makh) {
		try {
			KetNoidao kn = new KetNoidao();
			kn.KetNoi();
			
			// Update bảng hoadon
			String sql = "insert into hoadon values(?,?,?)";
			PreparedStatement cmd = kn.Cn.prepareStatement(sql);
			cmd.setInt(1, makh);
			Date ngayutil = new Date();
			java.sql.Date ngaysql = new java.sql.Date(ngayutil.getTime());
			cmd.setDate(2, ngaysql);
			// Chưa mua nên set = 0
			cmd.setInt(3, 0);
			cmd.executeUpdate();
			
			
			kn.Cn.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void ThemCTHD(int makh, String MaSach, long SoLuong) {
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
			// Chưa mua nên set = 0
			cmd.setObject(4, 0);
			
			cmd.executeUpdate();
			
			
			kn.Cn.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void XoaHoaDon(int makh) {	// Xóa hóa đơn chưa mua
		try {
			KetNoidao kn = new KetNoidao();
			kn.KetNoi();
			
			// Update bảng hoadon
			String sql = "delete from hoadon where makh=? and damua=0";
			PreparedStatement cmd = kn.Cn.prepareStatement(sql);
			cmd.setInt(1, makh);
			cmd.executeUpdate();
			
			
			kn.Cn.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void XoaCTHD(int MaHoaDon) {
		try {
			KetNoidao kn = new KetNoidao();
			kn.KetNoi();
			
			// Update bảng hoadon
			String sql = "delete from ChiTietHoaDon where makh=? and damua=0";
			PreparedStatement cmd = kn.Cn.prepareStatement(sql);
			cmd.setInt(1, MaHoaDon);
			cmd.executeUpdate();
			
			
			kn.Cn.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public ArrayList<giohangbean> getGioHang(int makh) {
		try {
			ArrayList<giohangbean> gio = new ArrayList<giohangbean>();
			// b1 Ket noi vao CSDL
			KetNoidao kn = new KetNoidao();
			kn.KetNoi();

			String sql = "select hd.makh, hoten, hd.MaHoaDon, NgayMua, hd.damua, s.MaSach, s.tensach, s.anh, SoLuongMua, gia "
					+ "from KhachHang as kh join hoadon as hd on kh.makh=hd.makh "
					+ "join ChiTietHoaDon as cthd on hd.MaHoaDon = cthd.MaHoaDon "
					+ "join sach as s on s.masach = cthd.MaSach "
					+ "where hd.makh=? and hd.damua=0 and cthd.damua=0";

			PreparedStatement cmd = kn.Cn.prepareStatement(sql);
			cmd.setInt(1, makh);
			ResultSet rs = cmd.executeQuery();
			
			while(rs.next()) {
				String MaSach = rs.getString("MaSach");
				String tensach = rs.getString("tensach");
				String anh = rs.getString("anh");
				int SoLuongMua = rs.getInt("SoLuongMua");
				int gia = rs.getInt("gia");
				
				gio.add(new giohangbean(anh, MaSach, tensach, SoLuongMua, gia));
			}
			
			kn.Cn.close();
			rs.close();
			
			return gio;
			
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	// Lấy mã hóa đơn của khách hàng chưa mua hàng (damua=0)
	public int getMaHoaDon(int makh) {
		try {
			KetNoidao kn = new KetNoidao();
			kn.KetNoi();
			
			// Lấy Mã Hóa đơn vừa đc thêm vào từ bảng hoadon
			String sql = "select MaHoaDon from hoadon where makh=? and damua=0";
			PreparedStatement cmd = kn.Cn.prepareStatement(sql);
			cmd = kn.Cn.prepareStatement(sql);
			cmd.setInt(1, makh);
			ResultSet rs = cmd.executeQuery();
			
			if(rs.next()) {
				return rs.getInt("MaHoaDon");
			}
			
			kn.Cn.close();
			return 0;
			
		} catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	
}
