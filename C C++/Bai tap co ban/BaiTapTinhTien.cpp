#include <math.h>
#include <stdio.h>
#include <stdlib.h>

int main() {
  int a, b;
  printf("nhap so nguyen a=");
  scanf("%d", &a);
  printf("nhap so nguyen b=");
  scanf("%d", &b);

  printf("so lon hon la: %.0f ", (a + b) / 2 + fabs(a - b) / 2);
  system("pause");
  return 0;
}
