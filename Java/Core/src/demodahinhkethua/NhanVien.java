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
public class NhanVien extends Person {

  private int luong;

  public NhanVien() {}

  public NhanVien(int luong, String hoTen, int tuoi) {
    super(hoTen, tuoi);
    this.luong = luong;
  }

  public int getLuong() { return luong; }

  @Override
  public int getTuoi() {
    return super.getTuoi(); // To change body of generated methods, choose Tools
                            // | Templates.
  }

  @Override
  public String getHoTen() {
    return super.getHoTen(); // To change body of generated methods, choose
                             // Tools | Templates.
  }

  /**
   *
   */
  @Override
  public void show() {
    super.show(); // To change body of generated methods, choose Tools |
                  // Templates.
    System.out.println("L��ng: " + this.luong);
  }

  @Override
  public void say() {
    System.out.println("T�i l� nh�n vi�n ");
  }
}
