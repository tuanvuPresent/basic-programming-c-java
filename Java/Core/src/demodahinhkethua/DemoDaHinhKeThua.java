/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demodahinhkethua;

import java.util.ArrayList;

/**
 *
 * @author NguyenTuanVu
 */
public class DemoDaHinhKeThua {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    ArrayList<Person> arrPerson = new ArrayList<>();
    Person person = new Person();
    // khởi tạo các đổi tượng
    person = new Person("Nguyễn Văn A", 30);
    arrPerson.add(person);

    person = new SinhVien("DH BKHN ", "Nguyễn Văn B", 21);
    arrPerson.add(person);

    person = new NhanVien(10000000, "Nguyễn Văn D", 50);
    arrPerson.add(person);
    // hiển thị thông tin cách 1
    //        for (int i = 0; i < p.size(); i++) {
    //            p.get(i).say();
    //            p.get(i).show();
    //            System.out.println("");
    //        }
    // hiển thị thông tin cách 2
    for (Person p : arrPerson) {
      p.say();
      p.show();
      System.out.println("");
    }
    // tìm tuổi max
    int vt = 0;
    int max = arrPerson.get(0).tuoi;
    for (int i = 1; i < arrPerson.size(); i++) {
      if (max < arrPerson.get(i).tuoi) {
        max = arrPerson.get(i).tuoi;
        vt = i;
      }
    }
    System.out.println("Người có tuổi cao nhất là: " + arrPerson.get(vt).hoTen);
  }
}
