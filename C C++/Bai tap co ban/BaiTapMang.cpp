#include <math.h>
#include <stdio.h>
#include <stdlib.h>
void nhap(int a[], int n) {
  for (int i = 0; i < n; i++) {
    printf("a[%d]=", i);
    scanf("%d", &a[i]);
  }
}
void xuat(int a[], int n) {
  for (int i = 0; i < n; i++)
    printf("%d ", a[i]);
}
float tinhTbc(int a[], int n) {
  int s = 0;
  for (int i = 0; i < n; i++)
    s += a[i];
  return (float)s / n;
}
void swap(int &a, int &b) {
  int c = a;
  a = b;
  b = c;
}
void sapXepTang(int *a, int n) {
  for (int i = 0; i < n - 1; i++) {
    for (int j = 0; j < n - 1 - i; j++) {
      if (a[j] > a[j + 1])
        swap(a[j], a[j + 1]);
    }
  }
}
int max(int *a, int n) {
  int max = a[0];
  int vt = 0;
  for (int i = 1; i < n; i++) {
    if (max < a[i]) {
      max = a[i];
      vt = i;
    }
  }
  printf("\nvi tri max la %d", vt + 1);
  return max;
}
int min(int *a, int n) {
  int min = a[0];
  int vt = 0;
  for (int i = 1; i < n; i++) {
    if (min > a[i]) {
      min = a[i];
      vt = i;
    }
  }
  printf("\nvi tri min la %d", vt + 1);
  return min;
}

float tbcSoAm(int *a, int n) {
  int sum = 0, dem = 0;
  for (int i = 0; i < n; i++) {
    if (a[i] < 0) {
      sum = sum + a[i];
      dem++;
    }
  }
  if (dem == 0)
    return 0;
  else
    return (float)sum / dem;
}

void xoaViTri(int *a, int &n, int vt) {
  for (int i = vt; i < n - 1; i++) {
    a[i] = a[i + 1];
  }
  n--;
}
void xoaPhanTuGiongNhau(int *a, int &n) {
  for (int i = 0; i < n; i++)
    for (int j = i + 1; j < n; j++) {
      if (a[i] == a[j]) {
        xoaViTri(a, n, j);
        j--;
      }
    }
}

void them(int *a, int &n, int vt, int x) {
  for (int i = n; i > vt; i--)
    a[i] = a[i - 1];
  a[vt] = x;
  n++;
}

void mangXenKe(int *&c, int *a, int *b) {}

int ktSnt(int x) {
  if (x < 2)
    return 0;
  int a = sqrt(x);
  for (int i = 2; i <= a; i++) {
    if (x % i == 0)
      return 0;
  }
  return 1;
}

void soNguyenTo(int *a, int n) {
  for (int i = 0; i < n; i++) {
    if (ktSnt(a[i]) == 1)
      printf("%d ", a[i]);
  }
}

int ktShh(int n) {
  int sum = 1;
  for (int j = 2; j <= n / 2; j++) {
    if (n % j == 0)
      sum += j;
  }
  if (sum == n && n >= 6)
    printf("%d ", n);
}

void soHoanHao(int *a, int n) {
  for (int i = 0; i < n; i++) {
    ktShh(a[i]);
  }
}

int timKiem(int *a, int n, int x) {
  int count = 0;
  for (int i = 0; i < n; i++) {
    if (a[i] == x)
      count++;
  }
  return count;
}
void mangDuong(int *kq, int *a, int &n) {
  int j = 0;
  for (int i = 0; i < n; i++) {
    if (a[i] > 0)
      kq[j++] = a[i];
  }
  n = j;
}

int main() {
  int a[99] = {};
  int kq[99] = {};
  int n;
  //
  printf("Nhap so phan tu ");
  scanf("%d", &n);
  nhap(a, n);
  xoaPhanTuGiongNhau(a, n);
  them(a, n, n, 25);
  printf("\nMang bi xoa va them 25 vao cuoi la: ");
  xuat(a, n);
  printf("\n-------------------------------------------------");
  printf("\nMax=%d", max(a, n));

  printf("\nMin=%d", min(a, n));

  printf("\nMang sap xep tang la: ");
  sapXepTang(a, n);
  xuat(a, n);

  printf("\nTBC       =%.2f", tinhTbc(a, n));

  printf("\nTBC so am =%.2f", tbcSoAm(a, n));

  printf("\nCac so nguyen to la: ");
  soNguyenTo(a, n);

  printf("\nCac so hoan hao la   : ");
  soHoanHao(a, n);

  printf("\nCo %d so nguyen 5", timKiem(a, n, 5));

  printf("\nMang >0 la: ");
  mangDuong(kq, a, n);
  xuat(kq, n);
  system("pause");

  return 0;
}
