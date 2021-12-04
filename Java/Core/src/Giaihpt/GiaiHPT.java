/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Giaihpt;

/**
 *
 * @author NguyenTuanVu
 */
public class GiaiHPT {

  public void hpt2an(double kq[], double a[], double b[]) {
    double d = a[0] * b[1] - b[0] * a[1];
    double dx = a[2] * b[1] - b[2] * a[1];
    double dy = a[0] * b[2] - b[0] * a[2];
    if (d != 0) {
      kq[0] = 1;
      kq[1] = dx / d;
      kq[2] = dy / d;
    } else if (dx == 0 && dy == 0) {
      kq[0] = 0;
    } else {
      kq[0] = -1;
    }
  }

  public double tinhDinhThuc(double a[][]) {
    double x = a[0][0] * a[1][1] * a[2][2] + a[0][1] * a[1][2] * a[2][0] +
               a[0][2] * a[1][0] * a[2][1];
    double y = a[0][2] * a[1][1] * a[2][0] + a[0][1] * a[1][0] * a[2][2] +
               a[0][0] * a[1][2] * a[2][1];
    return x - y;
  }

  public static void main(String[] args) {
    double a[] = {1, 2, 3};
    double b[] = {1, -2, 4};
    double kq[] = new double[3];
    GiaiHPT hpt = new GiaiHPT();
    hpt.hpt2an(kq, a, b);
    if (kq[0] == 1) {
      System.out.println("x=" + kq[1] + "\ny=" + kq[2]);
    } else if (kq[0] == 0) {
      System.out.println("Hệ vô số nghiệm");
    } else
      System.out.println("Hệ vô nghiệm");
  }
}
