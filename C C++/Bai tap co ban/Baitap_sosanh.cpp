#include<stdio.h>
#include<stdlib.h>
#include<math.h>

main(){
	float a;
	float b;
	printf("Nhap vao so thu nhat:"); scanf("%f",&a);
	printf("Nhap vao so thu hai:"); scanf("%f",&b);
	float z=(a+b)/2+ fabs(a-b)/2;
	printf("So lon hon la: %.f",z);
	system("pause");
}
