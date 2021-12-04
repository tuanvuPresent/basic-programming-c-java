#include <math.h>
#include <stdio.h>
#include <stdlib.h>

int tamGiac(float a, float b, float c) {
  if (fabs(a - b) < c && c < a + b && fabs(a - c) < b && b < a + c &&
      fabs(c - b) < a && a < c + b && a > 0 && b > 0 && c > 0)
    return 1;
  else
    return 0;
}

int main() {
  float a, b, c;
  printf("Nhap vao canh a=");
  scanf("%f", &a);
  printf("Nhap vao canh b=");
  scanf("%f", &b);
  printf("Nhap vao canh c=");
  scanf("%f", &c);
  //	printf("Nhap vao canh c=");scanf("%f",&c);
  if (tamGiac(a, b, c)) {
    if (a == b && a == c)
      printf("Tam giac ABC la tam giac deu");
    else if (a == c || a == b || b == c)
      printf("Tam giac ABC la tam giac can");
    else if (a * a + b * b == c * c || a * a + c * c == b * b ||
             b * b + c * c == a * a)
      printf("Tam giac ABC la tam giac vuong");
    else
      printf("Tam giac ABC la tam giac thuong");
  } else
    printf("Cac canh vua nhap khong phai la mot tam giac");
  system("pause");

  return 0;
}
