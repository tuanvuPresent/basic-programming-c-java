#include <stdio.h>
#include <conio.h>
#include <math.h>

void NhapMaTran(int a[10][10],int n){
	for(int i=0;i<n;i++)
		for(int j=0;j<=n;j++){
			printf("a[%d][%d]=",i,j);scanf("%d",&a[i][j]);
		}
}
void XuatMaTran(int a[10][10],int n){
	for(int i=0;i<n;i++){
		printf("\n");
		for(int j=0;j<=n;j++)
			printf("%-10d ",a[i][j]);
		}
}
void Change(int kq[10][10],int a[10][10],int n){
	for(int i=0;i<n;i++)
		for(int j=0;j<=n;j++)
			kq[i][j]=a[i][j];
}
void hpt(int kq[10][10],int a[10][10],int n){
	Change(kq,a,n);
	int test=0;
	for(int i=0;i<n;i++)
	while(test<n-1){
		for(int i=test+1;i<n;i++)
			for(int j=0;j<=n;j++){
				kq[i][j]=a[test][test] * a[i][j] - a[i][test] *a[test][j];
			}	
			test++;
		Change(a,kq,n);
		}
}
float ghpt(float *x,int a[10][10],int n){
	for(int i=n-1;i>=0;i--){
		x[i]=a[i][n]/a[i][n-1];
	}
}
main(){
	int n=3;
	int a[10][10]={};
	int kq[10][10]={};
	float x[10];
	NhapMaTran(a,n);
	XuatMaTran(a,n);
	hpt(kq,a,n);
	printf("\n");
	XuatMaTran(kq,n);
	ghpt(x,kq,n);
	printf("\n");
	for(int i=0;i<n;i++){
		printf("\t%.2f",x[i]);
	}
	getch();
}
