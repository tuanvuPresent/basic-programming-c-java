#include <math.h>
#include <stdio.h>
#include <stdlib.h>
int sum(int n) { // de quy tuyen tinh(1 lan goi ham )
  if (n == 1)
    return 1;
  else
    return sum(n - 1) + n;
}
int fibonacci(int n) { // de quy nhi phan (2 lan goi ham )
  if (n == 0)
    return 0;
  else if (n <= 2)
    return 1;
  return fibonacci(n - 1) + fibonacci(n - 2);
}
float daySo(float n) { // 1+1/2+1/3+....
  if (n <= 1)
    return 1;
  else
    return daySo(n - 1) + 1 / n;
}
int main() {
  printf("%d", sum(100));
  for (int i = 0; i < 20; i++)
    printf("\n%d", fibonacci(i));
  printf("\n%.2f", daySo(5));
  system("pause");

  return 0;
}
