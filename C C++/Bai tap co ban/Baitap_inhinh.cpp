#include<stdio.h>
#include<stdlib.h>
#include<math.h>

void HinhTamGiac(int n){
	//Tam giac vuong
	for(int i=0;i<n;i++){
		for(int j=0;j<=i;j++)
		printf("*");
		printf("\n");
	}
	printf("------------------------------------------------------------------\n");
	//Tam giac can
	for(int i=0;i<n;i++){
		for(int j=1;j<n-i;j++)
		printf(" ");
		for(int j=0;j<=2*i;j++)
		printf("*");
		printf("\n");
	}
	printf("------------------------------------------------------------------\n");
	//Tam giac vuong rong
	for(int i=0;i<n;i++){
		for(int j=0;j<=i;j++)
			if(j==0||j==i||i==n-1) printf("*");
			else printf(" ");
		printf("\n");
	}
	printf("------------------------------------------------------------------\n");
	//Tam giac can rong
	for(int i=0;i<n;i++){
		for(int j=1;j<n-i;j++)
		printf(" ");
		for(int j=0;j<=2*i;j++)
			if(j==0||j==2*i||i==n-1) printf("*");
			else printf(" ");
		printf("\n");
	}
}

void HinhChuNhat(int a,int b){
	printf("------------------------------------------------------------------\n");
	//Hinh chu nhat 
	for(int i=0;i<a;i++){
	for(int j=0;j<b;j++)
		printf("*");
	printf("\n");
	}
	printf("------------------------------------------------------------------\n");
	//Hinh chu nhat rong
	for(int i=0;i<a;i++){
	for(int j=0;j<b;j++)
		if(j==0||j==b-1||i==0||i==a-1)printf("*");
		else printf(" ");
	printf("\n");
	}
}
main(){
	HinhTamGiac(6);
	HinhChuNhat(4,9);
	system("pause");
}
