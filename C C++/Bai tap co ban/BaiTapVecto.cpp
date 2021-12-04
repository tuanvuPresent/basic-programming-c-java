#include <math.h>
#include <stdio.h>
#include <stdlib.h>
const float PI = 2 * acos(0);

struct Vecto {
  int x;
  int y;
};
void nhapVecto(Vecto &x) {
  printf("x=");
  scanf("%d", &x.x);
  printf("y=");
  scanf("%d", &x.y);
}
float doDaiVecto(Vecto x) { return (float)sqrt(x.x * x.x + x.y * x.y); }
float goc(Vecto a, Vecto b) {
  float x = (float)(a.x * b.x + a.y * b.y) / (doDaiVecto(a) * doDaiVecto(b));
  x = acos(x);
  return x / PI * 180;
}
void cong(Vecto &a, Vecto b) {
  a.x = a.x + b.x;
  a.y = a.y + b.y;
}

int main() {
  Vecto x, y;
  nhapVecto(x);
  nhapVecto(y);
  printf("Goc giua 2 vecto la: %.2f(do)", goc(x, y));
  cong(x, y);
  printf("\nVecto A+B= (%d;%d)", x.x, x.y);
  system("pause");

  return 0;
}
