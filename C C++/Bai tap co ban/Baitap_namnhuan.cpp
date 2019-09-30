#include<stdio.h>
#include<stdlib.h>

main(){
	//nam nhuan la nam: chia het cho 4 va khong chia het cho 100 hoac chia het cho 400
	int nam;
	printf("Nhap vao nam:"); scanf("%d",&nam);
	((nam%4==0)&&(nam%100!=0)||(nam%400==0))?printf("Nam %d la nam nhuan.",nam):printf("Nam %d khong phai nam nhuan.",nam);
	system("pause");
}
