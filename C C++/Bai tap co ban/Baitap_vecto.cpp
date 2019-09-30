#include<stdio.h>
#include<stdlib.h>
#include<math.h>
const float PI = 2 * acos(0);

struct vecto{
	int x;
	int y;	
};
void NhapVecto(vecto &x){
	printf("x=");scanf("%d",&x.x);
	printf("y=");scanf("%d",&x.y);
}
float DoDaiVecto(vecto x){
	return (float) sqrt(x.x*x.x+x.y*x.y);	
}
float Goc(vecto a,vecto b){
	float x=(float) (a.x*b.x+a.y*b.y )/ (DoDaiVecto(a)*DoDaiVecto(b));
	x=acos(x);
	return x/PI*180;
}
void Cong(vecto &a,vecto b){
	a.x=a.x+b.x;
	a.y=a.y+b.y;
}

main(){
	vecto x,y;
	NhapVecto(x);
	NhapVecto(y);
	printf("Goc giua 2 vecto la: %.2f(do)",Goc(x,y));
	Cong(x,y);
	printf("\nVecto A+B= (%d;%d)",x.x,x.y);
	system("pause");
}
