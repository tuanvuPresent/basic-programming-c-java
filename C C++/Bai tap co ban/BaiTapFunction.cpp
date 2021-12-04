#include <math.h>
#include <stdio.h>
#include <stdlib.h>

int soHoanHao(int n) {
  int sum = 0;
  for (int i = 6; i <= n; i++) {
    sum = 1;
    for (int j = 2; j <= i / 2; j++) {
      if (i % j == 0)
        sum += j;
    }
    if (sum == i)
      printf("%d ", i);
  }
}
int soNguyenTo(int n) {
  if (n < 2)
    return 0;
  int a = sqrt(n);
  for (int i = 2; i <= a; i++) {
    if (n % i == 0)
      return 0;
  }
  return 1;
}
int ucln(int a, int b) {
  while (a != b) {
    if (a > b)
      a = a - b;
    else
      b = b - a;
  }
  return a;
}
int bcnl(int a, int b) { return a * b / ucln(a, b); }
int kiemTraSoDx(int n) {
  int temp = n;
  int sDao = 0;
  while (temp > 0) {
    sDao = sDao * 10 + temp % 10;
    temp /= 10; // tuong t? n = n/10
  }
  if (sDao == n)
    return 1;
  else
    return 0;
}

int soChinhPhuong(int n) {
  printf("So chinh phuong la: ");
  for (int i = 1; i <= n; i++) {
    if (sqrt(i) == (float)sqrt(i))
      printf("%d ", i);
  }
}
int tongCsc(int dau, int cuoi, int kc) {
  int i = dau;
  int sum = 0;
  while (i <= cuoi) {
    sum += i;
    i += kc;
  }
  return sum;
}
int tongCsn(int dau, int cuoi, int csn) {
  int i = dau;
  int sum = 0;
  while (i <= cuoi) {
    sum += i;
    i *= csn;
  }
  return sum;
  // co the thay the = 2 dong code duoi day:
  //	int p=log(cuoi/dau)/log(csn);
  //	return sum=dau*(pow(csn,p+1)-1)/(csn-1);
}
int main() {
  while (1) {
    int a, b, c;
    printf("Nhap vao so nguyen: ");
    scanf("%d", &a);
    printf("Nhap vao so nguyen: ");
    scanf("%d", &b);
    printf("Nhap vao so nguyen: ");
    scanf("%d", &c);
    printf("Ket qua=%d\n", tongCsc(a, b, c));
    for (int i = 0; i < a; i++) {
      if (soNguyenTo(i) == 1)
        printf("%d ", i);
    }
    soHoanHao(100);
    system("pause");
  }

  return 0;
}
