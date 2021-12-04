#include <math.h>
#include <stdio.h>
#include <stdlib.h>

void bang(int n) { // ham nay in ra 1 trong bang cuu chuong
  for (int i = 1; i <= 10; i++)
    printf("%d x %d =%d\n", n, i, n * i);
}
void bangCuuChuong() {
  for (int i = 1; i <= 10; i++)
    for (int j = 1; j <= 5; j++)
      printf("%d x %d =%d\t", j, i, j * i);
  printf("\n");
  for (int i = 1; i <= 10; i++)
    for (int j = 6; j <= 10; j++)
      printf("%d x %d =%d\t", j, i, j * i);
}
int main() {
  bangCuuChuong();
  system("pause");
  return 0;
}
