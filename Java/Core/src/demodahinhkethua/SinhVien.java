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

  private String truong;

  public SinhVien() {}

  public SinhVien(String truong, String hoTen, int tuoi) {
    super(hoTen, tuoi);
    this.truong = truong;
  }

  @Override
  public void setTuoi(int tuoi) {
    super.setTuoi(tuoi);
  }

  public void setTruong(String truong) { this.truong = truong; }

  @Override
  public void setHoTen(String hoTen) {
    super.setHoTen(hoTen);
  }

  /**
   *
   * @return
   */
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

  public String getTruong() { return truong; }

  @Override
  public void show() {
    super.show(); // To change body of generated methods, choose Tools |
                  // Templates.
    System.out.println("Trường: " + this.truong);
  }

  public void say() { System.out.println("Tôi là  sinh viên"); }
}
