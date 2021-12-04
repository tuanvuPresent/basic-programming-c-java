#include <stdio.h>
#include <stdlib.h>

void swapNumber(int *a, int *b) {
  int temp = *a;
  *a = *b;
  *b = temp;
}
void nhapMang(int *arr, int size) {
  for (int i = 0; i < size; i++) {
    printf("arr[%d]=", i);
    scanf("%d", &arr[i]);
  }
}

void xuat(int *arr, int size) {
  for (int i = 0; i < size; i++)
    printf("arr[%d]=%d", i, arr[i]);
}

int main() {
  int a = 5, b = 8;
  printf("Luc dau:          a= %d, b= %d\n", a, b);
  swapNumber(&a, &b);
  printf("Sau khi hoan doi: a= %d, b= %d\n", a, b);
  system("pause");

  return 0;
}
