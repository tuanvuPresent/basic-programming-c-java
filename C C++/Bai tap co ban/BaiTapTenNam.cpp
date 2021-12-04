#include <math.h>
#include <stdio.h>
#include <stdlib.h>

int main() {
  char CAN[10][5] = {"Canh", "Tan",  "Nham", "Quy", "Giap",
                     "At",   "Binh", "Dinh", "Mau", "Ki"};
  char CHI[12][5] = {"Than", "Dau", "Tuat", "Hoi", "Ty'", "Suu",
                     "Dan",  "Mao", "Thin", "Ty",  "Ngo", "Mui"};
  int nam;
  printf("Nhap vao nam: ");
  scanf("%d", &nam);
  printf("Nam %d la nam %s %s", nam, CAN[(nam) % 10], CHI[(nam) % 12]);
  system("pause");

  return 0;
}
