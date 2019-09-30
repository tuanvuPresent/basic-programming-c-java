#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int Tong1denN(int n){
	int s=0;
	for(int i=1;i<=n;i++){
		s=s+i;
	}
	return s;
}

main(){
	while(1){
	int n;
	printf("Nhap vao so nguyen n="); scanf("%d",&n);
	int tong=Tong1denN(n);
	printf("Tong tu 1 den %d = %d\n",n,tong);
	system("pause");
}
}
