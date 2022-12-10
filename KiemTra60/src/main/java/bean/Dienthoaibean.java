package bean;

public class Dienthoaibean {
   private int Madidong;
   private String tendidong;
   private int gia;
   private int soluong;
   private String anh;
public Dienthoaibean() {
	super();
	// TODO Auto-generated constructor stub
}
public int getMadidong() {
	return Madidong;
}
public void setMadidong(int madidong) {
	Madidong = madidong;
}
public String getTendidong() {
	return tendidong;
}
public void setTendidong(String tendidong) {
	this.tendidong = tendidong;
}
public int getGia() {
	return gia;
}
public void setGia(int gia) {
	this.gia = gia;
}
public int getSoluong() {
	return soluong;
}
public void setSoluong(int soluong) {
	this.soluong = soluong;
}
public String getAnh() {
	return anh;
}
public void setAnh(String anh) {
	this.anh = anh;
}
public Dienthoaibean(int madidong, String tendidong, int gia, int soluong, String anh) {
	super();
	Madidong = madidong;
	this.tendidong = tendidong;
	this.gia = gia;
	this.soluong = soluong;
	this.anh = anh;
}
   
   

}