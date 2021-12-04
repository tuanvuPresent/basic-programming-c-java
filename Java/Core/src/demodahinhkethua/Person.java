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

  public String hoTen;
  public int tuoi;

  public Person() {}

  public Person(String hoTen, int tuoi) {
    this.hoTen = hoTen;
    this.tuoi = tuoi;
  }

  public String getHoTen() { return hoTen; }

  public int getTuoi() { return tuoi; }

  public void setHoTen(String hoTen) { this.hoTen = hoTen; }

  public void setTuoi(int tuoi) { this.tuoi = tuoi; }

  public void show() {
    System.out.println("Họ tên: " + this.hoTen + " \nTuổi: " + this.tuoi);
  }

  public void say() { System.out.println("Tôi là person "); }
}
