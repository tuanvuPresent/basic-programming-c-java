#include <math.h>
#include <stdio.h>
#include <stdlib.h>

int main() {
  float a, b, c;
  printf("Nhap vao canh a=");
  scanf("%f", &a);
  printf("Nhap vao canh b=");
  scanf("%f", &b);
  printf("Nhap vao canh c=");
  scanf("%f", &c);
  if (fabs(a - b) < c && c < a + b && fabs(a - c) < b && b < a + c &&
      fabs(c - b) < a && a < c + b && a > 0 && b > 0 && c > 0)
    printf("Ba canh vua nhap la mot tam giac.");
  else
    printf("Ba canh vua nhap khong la mot tam giac");
  system("pause");

  return 0;
}
