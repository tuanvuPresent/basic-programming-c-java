#include <math.h>
#include <stdio.h>
#include <stdlib.h>

int sum(int n) {
  int s = 0;
  for (int i = 1; i <= n; i++) {
    s = s + i;
  }
  return s;
}

int main() {
  while (1) {
    int n;
    printf("Nhap vao so nguyen n=");
    scanf("%d", &n);
    int tong = sum(n);
    printf("Tong tu 1 den %d = %d\n", n, tong);
    system("pause");
  }
  return 0;
}
