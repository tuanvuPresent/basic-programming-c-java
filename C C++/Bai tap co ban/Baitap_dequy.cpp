#include<stdio.h>
#include<stdlib.h>
#include<math.h>
int TongTu1DenN(int n){					//de quy tuyen tinh(1 lan goi ham )
	if(n==1) return 1;
	else return TongTu1DenN(n-1)+n;
}
int Fibonacci(int n){					//de quy nhi phan (2 lan goi ham )
	if(n==0) return 0;
	else if(n<=2) return 1;
	return Fibonacci(n-1)+ Fibonacci (n-2);
}
float DaySo(float n){					//1+1/2+1/3+....
	if(n<=1) return 1;
	else return DaySo(n-1)+1/n ;
}
main(){
	printf("%d",TongTu1DenN(100));
	for(int i=0;i<20;i++)
	printf("\n%d",Fibonacci(i));
	printf("\n%.2f",DaySo(5));
	system("pause");
}
