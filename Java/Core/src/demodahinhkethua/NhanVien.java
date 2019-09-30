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

    private int Luong;

    public NhanVien() {
    }

    public NhanVien(int Luong, String HoTen, int Tuoi) {
        super(HoTen, Tuoi);
        this.Luong = Luong;
    }

    public int getLuong() {
        return Luong;
    }

    @Override
    public int getTuoi() {
        return super.getTuoi(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getHoTen() {
        return super.getHoTen(); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     */
    @Override
    public void Show() {
        super.Show(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Lýõng: " + this.Luong);
    }


    @Override
    public void say(){
        System.out.println("Tôi là nhân viên ");
    }
}
