package bean;

public class xacnhanbean {
  private long MaChiTietHoaDon;
  private long MaHoaDon;
  private String hoten;
  private long SoLuongMua;
  private long gia;
  private long thanhtien;
  private long damua;
public xacnhanbean() {
	super();
	// TODO Auto-generated constructor stub
}
public xacnhanbean(long maChiTietHoaDon, long maHoaDon, String hoten, long soLuongMua, long gia, long thanhtien,
		long damua) {
	super();
	MaChiTietHoaDon = maChiTietHoaDon;
	MaHoaDon = maHoaDon;
	this.hoten = hoten;
	SoLuongMua = soLuongMua;
	this.gia = gia;
	this.thanhtien = thanhtien;
	this.damua = damua;
}
public long getMaChiTietHoaDon() {
	return MaChiTietHoaDon;
}
public void setMaChiTietHoaDon(long maChiTietHoaDon) {
	MaChiTietHoaDon = maChiTietHoaDon;
}
public long getMaHoaDon() {
	return MaHoaDon;
}
public void setMaHoaDon(long maHoaDon) {
	MaHoaDon = maHoaDon;
}
public String getHoten() {
	return hoten;
}
public void setHoten(String hoten) {
	this.hoten = hoten;
}
public long getSoLuongMua() {
	return SoLuongMua;
}
public void setSoLuongMua(long soLuongMua) {
	SoLuongMua = soLuongMua;
}
public long getGia() {
	return gia;
}
public void setGia(long gia) {
	this.gia = gia;
}
public long getThanhtien() {
	return thanhtien;
}
public void setThanhtien(long thanhtien) {
	this.thanhtien = thanhtien;
}
public long getDamua() {
	return damua;
}
public void setDamua(long damua) {
	this.damua = damua;
}

  
  
}
