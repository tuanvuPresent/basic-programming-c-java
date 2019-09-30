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
public class Person {

	public String HoTen;
	public int Tuoi;

	public Person() {
	}

	public Person(String HoTen, int Tuoi) {
		this.HoTen = HoTen;
		this.Tuoi = Tuoi;
	}

	public String getHoTen() {
		return HoTen;
	}

	public int getTuoi() {
		return Tuoi;
	}

	public void setHoTen(String HoTen) {
		this.HoTen = HoTen;
	}

	public void setTuoi(int Tuoi) {
		this.Tuoi = Tuoi;
	}

	public void Show() {
		System.out.println("Họ tên: " + this.HoTen + " \nTuổi: " + this.Tuoi);
	}

	public void say() {
		System.out.println("Tôi là person ");
	}
}
