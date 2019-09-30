#include<stdio.h>
#include<stdlib.h>
#include<math.h>

main(){
	char Can[10][5]={"Canh","Tan","Nham","Quy","Giap","At","Binh","Dinh","Mau","Ki"};
	char Chi[12][5]={"Than","Dau","Tuat","Hoi","Ty'","Suu","Dan","Mao","Thin","Ty","Ngo","Mui"};
	int nam;
	printf("Nhap vao nam: ");scanf("%d",&nam);
	printf("Nam %d la nam %s %s",nam,Can[(nam)%10],Chi[(nam)%12]);
	system("pause");
	
}
