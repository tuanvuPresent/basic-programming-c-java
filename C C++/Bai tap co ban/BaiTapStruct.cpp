#include <stdio.h>
#include <stdlib.h>

struct PhanSo {
  int tu;
  int mau;
};
// nhap phan so.
void nhap(PhanSo &ps) {
  printf("Nhap tu:");
  scanf("%d", &ps.tu);
  printf("Nhap mau:");
  scanf("%d", &ps.mau);
}
// xuat
void xuatPhanSo(PhanSo ps) {
  if (ps.mau != 1)
    printf("Ket Qua=%d/%d", ps.tu, ps.mau);
  else
    printf("Ket Qua=%d", ps.tu);
}
// rut gon phan so
void rutGon(PhanSo &ps) {
  int ts = ps.tu, ms = ps.mau;
  while (ts != ms) {
    if (ts > ms)
      ts = ts - ms;
    else
      ms = ms - ts;
  }
  ps.mau = ps.mau / ts;
  ps.tu = ps.tu / ts;
}
void congPS(PhanSo &ketQua, PhanSo a, PhanSo b) {
  ketQua.tu = a.tu * b.mau + b.tu * a.mau;
  ketQua.mau = a.mau * b.mau;
}
void truPS(PhanSo &ketQua, PhanSo a, PhanSo b) {
  ketQua.tu = a.tu * b.mau - b.tu * a.mau;
  ketQua.mau = a.mau * b.mau;
}
void chiaPS(PhanSo &ketQua, PhanSo a, PhanSo b) {
  ketQua.tu = a.tu * b.mau;
  ketQua.mau = a.mau * b.tu;
}
void nhanPS(PhanSo &ketQua, PhanSo a, PhanSo b) {
  ketQua.tu = a.tu * b.tu;
  ketQua.mau = a.mau * b.mau;
}
void nghichDaoPS(PhanSo &ketQua, PhanSo ps) {
  ketQua.tu = ps.mau;
  ketQua.mau = ps.tu;
}

int main() {
  PhanSo a, b, ketQua;
  nhap(a);
  nhap(b);

  congPS(ketQua, a, b);
  rutGon(ketQua);
  printf("\nCong ");
  xuatPhanSo(ketQua);

  truPS(ketQua, a, b);
  rutGon(ketQua);
  printf("\nTru ");
  xuatPhanSo(ketQua);

  system("pause");
  return 0;
}
