#include <math.h>
#include <stdio.h>
#include <stdlib.h>

int main() {
  int gioThuNhat, phutThuNhat;
  int gioThuHai, phutThuHai;
  printf("Nhap vao gio thu nhat=");
  scanf("%d", &gioThuNhat);
  printf("Nhap vao phut thu nhat=");
  scanf("%d", &phutThuNhat);
  printf("Nhap vao gio thu hai=");
  scanf("%d", &gioThuHai);
  printf("Nhap vao phut thu hai=");
  scanf("%d", &phutThuHai);
  int tongGio;
  int tongPhut;
  int carry = 0;
  tongPhut = phutThuNhat + phutThuHai;
  while (tongPhut > 59) {
    tongPhut = tongPhut - 60;
    carry++;
  }
  tongGio = gioThuNhat + gioThuHai + carry;
  // in ket qua
  printf("Ket qua=%dgio%dPhut", tongGio, tongPhut);
  system("pause");

  return 0;
}
