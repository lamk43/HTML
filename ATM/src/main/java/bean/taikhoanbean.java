/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.io.Serializable;


public class taikhoanbean {
    private String SoTaiKhoan;
    private String HoTen;
    private long SoTien;
    private String MatKhau;
    private String DiaChi;
    private String SDT;
    private String Email;

  

	public taikhoanbean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public taikhoanbean(String soTaiKhoan, String hoTen, long soTien, String matKhau, String diaChi, String sDT,
			String email) {
		super();
		SoTaiKhoan = soTaiKhoan;
		HoTen = hoTen;
		SoTien = soTien;
		MatKhau = matKhau;
		DiaChi = diaChi;
		SDT = sDT;
		Email = email;
	}

	public String getSoTaiKhoan() {
		return SoTaiKhoan;
	}

	public void setSoTaiKhoan(String soTaiKhoan) {
		SoTaiKhoan = soTaiKhoan;
	}

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public long getSoTien() {
		return SoTien;
	}

	public void setSoTien(long soTien) {
		SoTien = soTien;
	}

	public String getMatKhau() {
		return MatKhau;
	}

	public void setMatKhau(String matKhau) {
		MatKhau = matKhau;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}

	public String getSDT() {
		return SDT;
	}

	public void setSDT(String sDT) {
		SDT = sDT;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
 
   
    
}
