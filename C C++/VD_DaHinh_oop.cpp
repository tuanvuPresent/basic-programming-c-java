#include <conio.h>
#include <iostream>
#include <math.h>
#define PI 2 * asin(1)
using namespace std;
class HinhHoc {
public:
  virtual float tinhDienTich() { return 0; }
};

class HinhTron : public HinhHoc {
public:
  float banKinh;

  HinhTron(float banKinh0) { banKinh = banKinh0; }
  float tinhDienTich() { return PI * banKinh * banKinh; }
};
class HinhTamGiac : public HinhHoc {
public:
  int day;
  int cc;

  HinhTamGiac(int day0, int cc0) {
    day = day0;
    cc = cc0;
  }
  float tinhDienTich() { return day * cc / 2; }
};
class HinhChuNhat : public HinhHoc {
public:
  int cd;
  int cr;

  HinhChuNhat(int cd0, int cr0) {
    cd = cd0;
    cr = cr0;
  }
  float tinhDienTich() { return cd * cr; }
};

int main() {
  HinhHoc *h[4];
  h[0] = new HinhTron(2);
  h[1] = new HinhTamGiac(5, 6);
  h[2] = new HinhChuNhat(5, 4);
  float max = h[0]->tinhDienTich();
  for (int i = 1; i < 3; i++) {
    float temp = h[i]->tinhDienTich();
    if (max < temp)
      max = temp;
  }

  cout << max;
  getch();

  return 0;
}
