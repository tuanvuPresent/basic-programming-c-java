#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void nhapString(char s[256]) {
  printf("Nhap vao chuoi :");
  gets(s);
}
void xoaViTri(char *a, int vt) { // dung de xoa vi tri vt
  int n = strlen(a);             // lay do dai` chuoi
  for (int i = vt; i < n; i++) {
    a[i] = a[i + 1];
  }
}

void xoaMotKyTu(char *a, char c) { // dung` de xoa cac ki tu c
  int n = strlen(a);               // lay do dai` chuoi
  for (int i = 0; i < n; i++)
    if (a[i] == c) {
      for (int j = i--; j < n; j++)
        a[j] = a[j + 1];
      n--; // moi lan xoa thi` do dai` chuoi giam 1
    }
}
void addString(char *s, int vt,
               char c) { // dung de them vao chuoi ki tu c tai vi tri vt
  int n = strlen(s);
  for (int i = n; i >= vt; i--) {
    s[i + 1] = s[i];
  }
  s[vt] = c;
}
void stringNumber(char *s) { // can ham xoavitri()
  int i;
  for (i = 0; i < strlen(s); i++) {
    if (s[i] < '0' || s[i] > '9') {
      xoaViTri(s, i);
      i--;
    }
  }
}

void stringText(char *s) { // can ham xoavitri()
  int i;
  for (i = 0; i < strlen(s); i++) {
    if (s[i] >= '0' && s[i] <= '9') {
      xoaViTri(s, i);
      i--;
    }
  }
}

int congChuoi(char *s1, char *s2) { // can ham addstring();
  char s[256] = {NULL};
  // them ky tu 0 vao chuoi ngan
  int k1 = strlen(s2) - strlen(s1);
  int k2 = strlen(s1) - strlen(s2);
  for (int i = 0; i < k1; i++)
    addString(s1, 0, 48); // them 0 vao s1 neu s1 ngan hon
  for (int i = 0; i < k2; i++)
    addString(s2, 0, 48); // them 0 vao s2 neu s2 ngan hon
  // cong 2 chuoi lai
  int tang = 0; // la` bien nho'
  k1 = strlen(s2);
  for (int i = k1 - 1; i >= 0; i--) {
    s[i + 1] = s1[i] + s2[i] - 48 + tang;
    if (s[i + 1] > '9') {       // tong >9
      s[i + 1] = s[i + 1] - 10; // lay ket qua hang don vi
      tang = 1;                 // nho' 1
    } else
      tang = 0;
  }
  // ket qua
  s[0] = tang + 48;
  puts(s);
}

void tachSo(char *s) { // can ham addstring()
  int k = strlen(s) - 3;
  while (k > 0) {
    addString(s, k, 32);
    k = k - 3;
  }
}
void vietHoaText(char *s) {
  int k = strlen(s);
  for (int i = 0; i < k; i++) {
    if (s[i] == ' ') // sau dau cach thi` viet hoa
      s[i + 1] = toupper(s[i + 1]);
  }
  s[0] = toupper(s[0]); // viet hoa dau cau
}

int kiemTraChuoiDx(char *s) {
  // khai bao bien
  int k = strlen(s);
  int j = k / 2;
  // kiem tra
  for (int i = 0; i < j; i++) {
    if (s[i] != s[--k]) {
      return 0;
    }
  }
  return 1;
}
int demKiTuHoa(char *s) {
  int k = strlen(s);
  int count = 0;
  for (int i = 0; i < k; i++) {
    //		if(isupper(s[i])) count++;
    if ('A' <= s[i] && s[i] <= 'Z')
      count++;
  }
  return count;
}
int demKiTuThuong(char *s) {
  int k = strlen(s);
  int count = 0;
  for (int i = 0; i < k; i++) {
    //		if(islower(s[i])) count++;
    if ('a' <= s[i] && s[i] <= 'z')
      count++;
  }
  return count;
}
int demKiTuSo(char *s) {
  int k = strlen(s);
  int count = 0;
  for (int i = 0; i < k; i++) {
    if ('0' <= s[i] && s[i] <= '9')
      count++;
  }
  return count;
}
int demSo(char *s) { // diem chuoi so co trong chuoi
  int k = strlen(s);
  int count = 0;
  int isCount = 1;
  for (int i = 0; i < k; i++) {
    if ('0' <= s[i] && s[i] <= '9') { // neu la` so thi tang len 1
      if (isCount) {
        count++;
        isCount = 0;
      }
    } else if (('a' <= s[i] && s[i] <= 'z') ||
               ('A' <= s[i] && s[i] <= 'Z')) // la TEXT thi` moi duoc tang
      isCount = 1;
  }
  return count;
}
void xoaKhoangTrang(char *s) { // can ham xoavitri()
  int k = strlen(s);
  for (int i = 0; i < k; i++) {
    if (s[i] == 32) {
      xoaViTri(s, i);
      i--;
    }
  }
}
/*
+75: ph�m sang trai
+77: ph�m sang ph?i
+72: ph�m l�n tr�n
+80: ph�m xu?ng
+32: Ph�m Space
+27: phim ESC  */
int main() {
  char s1[256], s2[256];

  while (1) {
    system("cls");

    nhapString(s1);
    nhapString(s2);
    stringNumber(s1);
    stringNumber(s2);
    printf("KET QUA: %s+%s=", s1, s2);
    congChuoi(s1, s2);

    system("pause");
  }
  return 0;
}
