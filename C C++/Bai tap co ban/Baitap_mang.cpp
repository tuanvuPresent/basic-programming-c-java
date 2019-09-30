#include<stdio.h>
#include<stdlib.h>
#include<math.h>
void Nhap(int a[],int n){
	for(int i=0;i<n;i++){
	printf("a[%d]=",i);	scanf("%d",&a[i]);
}
}
void Xuat(int a[],int n){
	for(int i=0;i<n;i++)
		printf("%d ",a[i]);
}
float tinhTBC(int A[],int n){	
	int s=0;
	for(int i=0;i<n;i++)
			s+=A[i];
	return (float)s/n;
}
void swap(int &a,int &b){
	int c=a;
	a=b;
	b=c;
}
void SapXepTang(int *a,int n){
	for(int i=0;i<n-1;i++){
		for(int j=0;j<n-1-i;j++){
			if(a[j]>a[j+1]) swap(a[j],a[j+1]);
		}
	}
}
int Max(int *a,int n){
	int max=a[0];
	int vt=0;
	for(int i=1;i<n;i++){
		if(max<a[i]){
			max=a[i];
			vt=i;
		}
	}
	printf("\nvi tri max la %d",vt+1);
	return max;
}
int Min(int *a,int n){
	int min=a[0];
	int vt=0;
	for(int i=1;i<n;i++){
		if(min>a[i]){
			min=a[i];
			vt=i;
		}
	}
	printf("\nvi tri min la %d",vt+1);
	return min;
}

float TBCSoAm(int *a,int n){
	int sum=0,dem=0;
	for(int i=0;i<n;i++){
		if(a[i]<0){
			sum=sum+a[i];
			dem++;
		}
	}
	if(dem==0) return 0;
	else return (float) sum/dem;
} 

void XoaViTri(int *a,int &n,int vt){
	for(int i=vt;i<n-1;i++){
		a[i]=a[i+1];
	}
	n--;
}
void XoaPhanTuGiongNhau(int *a,int &n){
	for(int i=0;i<n;i++)
		for(int j=i+1;j<n;j++){
			if(a[i]==a[j]) {
				XoaViTri(a,n,j);
				j--;
			}
	}
}

void Them(int *a,int &n,int vt,int x ){
	for(int i=n;i>vt;i--)
		a[i]=a[i-1];
		a[vt]=x;
		n++;
}
void MangXenKe(int *&c,int *a,int *b){
	
}
int ktSNT(int x){
	if(x<2) return 0;
	int a=sqrt(x);
	for(int i=2;i<=a;i++){
		if(x%i==0) return 0;
	}
	return 1;
}
void SoNguyenTo(int *a,int n){
	for(int i=0;i<n;i++){
		if(ktSNT(a[i])==1) printf("%d ",a[i]);
	}
		
}
int ktSHH(int n){
	int sum=1;
		for(int j=2;j<=n/2;j++){
			if(n%j==0) sum+=j;
		}
		if(sum==n&&n>=6) printf("%d ",n);	
}
void SoHoanHao(int *a,int n){
	for(int i=0;i<n;i++){
		ktSHH(a[i]);
	}
}

int TimKiem(int *a,int n,int x){
	int count=0;
	for(int i=0;i<n;i++){
		if(a[i]==x) count++; 
	}
	return count;
}
void MangDuong(int *kq,int *a,int &n){
	int j=0;
	for(int i=0;i<n;i++){
		if(a[i]>0)
			kq[j++]=a[i];	
}
	n=j;
}

main(){
	int a[99]={};
	int kq[99]={};
	int n;
	//
	printf("Nhap so phan tu ");scanf("%d",&n);
	Nhap(a,n);
	XoaPhanTuGiongNhau(a,n);
	Them(a,n,n,25);
	printf("\nMang bi xoa va them 25 vao cuoi la: "); Xuat(a,n);
	printf("\n-------------------------------------------------");
	printf("\nMax=%d",Max(a,n));
	
	printf("\nMin=%d",Min(a,n));
	
	printf("\nMang sap xep tang la: ");
	SapXepTang(a,n);
	Xuat(a,n);
	
	printf("\nTBC       =%.2f",tinhTBC(a,n));
	
	printf("\nTBC so am =%.2f",TBCSoAm(a,n));
	
	printf("\nCac so nguyen to la: "); SoNguyenTo(a,n);
	
	printf("\nCac so hoan hao la   : ");SoHoanHao(a,n);
	
	printf("\nCo %d so nguyen 5",TimKiem(a,n,5));
	
	printf("\nMang >0 la: ");MangDuong(kq,a,n);Xuat(kq,n);
	system("pause");
}
