/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demodahinhkethua;

/**
 *
 * @author NguyenTuanVu
 */
public class SinhVien extends Person {

	private String Truong;

	public SinhVien() {
	}

	public SinhVien(String Truong, String HoTen, int Tuoi) {
		super(HoTen, Tuoi);
		this.Truong = Truong;
	}

	@Override
	public void setTuoi(int Tuoi) { 
		super.setTuoi(Tuoi); // To change body of generated methods, choose Tools | Templates.
	}

	public void setTruong(String Truong) {
		this.Truong = Truong;
	}

	@Override
	public void setHoTen(String HoTen) {
		super.setHoTen(HoTen); // To change body of generated methods, choose Tools | Templates.
	}

	/**
	 *
	 * @return
	 */
	@Override
	public int getTuoi() {
		return super.getTuoi(); // To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public String getHoTen() {
		return super.getHoTen(); // To change body of generated methods, choose Tools | Templates.
	}

	public String getTruong() {
		return Truong;
	}

	@Override
	public void Show() {
		super.Show(); // To change body of generated methods, choose Tools | Templates.
		System.out.println("Trường: " + this.Truong);
	}

	public void say() {
		System.out.println("Tôi là  sinh viên");
	}
}
