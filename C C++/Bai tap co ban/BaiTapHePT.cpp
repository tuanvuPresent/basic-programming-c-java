#include <conio.h>
#include <math.h>
#include <stdio.h>

void nhapMaTran(int a[10][10], int n) {
  for (int i = 0; i < n; i++)
    for (int j = 0; j <= n; j++) {
      printf("a[%d][%d]=", i, j);
      scanf("%d", &a[i][j]);
    }
}
void xuatMaTran(int a[10][10], int n) {
  for (int i = 0; i < n; i++) {
    printf("\n");
    for (int j = 0; j <= n; j++)
      printf("%-10d ", a[i][j]);
  }
}
void change(int kq[10][10], int a[10][10], int n) {
  for (int i = 0; i < n; i++)
    for (int j = 0; j <= n; j++)
      kq[i][j] = a[i][j];
}
void hpt(int kq[10][10], int a[10][10], int n) {
  change(kq, a, n);
  int test = 0;
  for (int i = 0; i < n; i++)
    while (test < n - 1) {
      for (int i = test + 1; i < n; i++)
        for (int j = 0; j <= n; j++) {
          kq[i][j] = a[test][test] * a[i][j] - a[i][test] * a[test][j];
        }
      test++;
      change(a, kq, n);
    }
}
float ghpt(float *x, int a[10][10], int n) {
  for (int i = n - 1; i >= 0; i--) {
    x[i] = a[i][n] / a[i][n - 1];
  }
}
int main() {
  int n = 3;
  int a[10][10] = {};
  int kq[10][10] = {};
  float x[10];
  nhapMaTran(a, n);
  xuatMaTran(a, n);
  hpt(kq, a, n);
  printf("\n");
  xuatMaTran(kq, n);
  ghpt(x, kq, n);
  printf("\n");
  for (int i = 0; i < n; i++) {
    printf("\t%.2f", x[i]);
  }
  getch();

  return 0;
}
