#include<stdio.h>
#include<stdlib.h>
#include<math.h>

main(){
	float x;
	int n;
	printf("Nhap vao so thuc x= "); scanf("%f",&x);
	printf("Nhap vao so nguyen n="); scanf("%d",&n);
	float F=0;
	float F1=pow(x,2)+x+1;
	float F2=pow(x,2)-x+1;
	F=pow(F1,n)+pow(F2,n);
	printf("Tong F= (x^2+x+1)^n + (x^2-x+1)^n =%.2f",F);
	system("pause");
}
	
