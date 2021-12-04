#include <math.h>
#include <stdio.h>
#include <stdlib.h>

int main() {
  float x;
  int n;
  printf("Nhap vao so thuc x= ");
  scanf("%f", &x);
  printf("Nhap vao so nguyen n=");
  scanf("%d", &n);
  float f = 0;
  float f1 = pow(x, 2) + x + 1;
  float f2 = pow(x, 2) - x + 1;
  f = pow(f1, n) + pow(f2, n);
  printf("Tong F= (x^2+x+1)^n + (x^2-x+1)^n =%.2f", f);
  system("pause");

  return 0;
}
