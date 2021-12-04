#include <math.h>
#include <stdio.h>
#include <stdlib.h>

void gptBac2(float a, float b, float c, float &x1, float &x2, int &r) {
  if (a != 0) {
    float denta = b * b - 4 * a * c;
    if (denta >= 0) {
      x1 = (-b - sqrt(denta)) / (2 * a);
      x2 = (-b + sqrt(denta)) / (2 * a);
    } else
      r = 0;
  } else if (b != 0) {
    x1 = -c / b;
    x2 = -c / b;
  } else if (c != 0)
    r = 0;
  else
    r = 1;
}

int main() {
  float a, b, c, x1, x2;
  int r;
  printf("Nhap vao a=");
  scanf("%f", &a);
  printf("Nhap vao b=");
  scanf("%f", &b);
  printf("Nhap vao c=");
  scanf("%f", &c);

  gptBac2(a, b, c, x1, x2, r);

  if (r == 0)
    printf("Phuong trinh vo nghiem");
  else if (r == 1)
    printf("Phuong trinh vo so nghiem");
  else
    printf("x1=%.2f\nx2=%.2f", x1, x2);
  system("pause");
  return 0;
}
