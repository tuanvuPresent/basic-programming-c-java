#include <iostream>
#include <conio.h>
#include <math.h>
#define Pi 2*asin(1) 
using namespace std;
class HinhHoc
{
	public:
	virtual  float TinhDienTich(){
		return 0;
	}
};

class HinhTron:public HinhHoc
{
	public:
		float BanKinh;
		
		HinhTron(float BanKinh0){
			BanKinh=BanKinh0;
		}
		float TinhDienTich(){
			return Pi*BanKinh*BanKinh;
		}
};
class HinhTamGiac:public HinhHoc
{
	public:
		int Day;
		int Cc;
		
		HinhTamGiac(int Day0,int Cc0){
			Day=Day0;
			Cc=Cc0;
		}
		float TinhDienTich()
		{
			return Day*Cc/2;
		}
};
class HinhChuNhat:public HinhHoc
{
	public:
		int cd;
		int cr;
		
		HinhChuNhat(int cd0,int cr0)
		{
			cd=cd0;
			cr=cr0;
		}
		float TinhDienTich()
		{
			return cd*cr;
		}
};


 main()
{
	HinhHoc *H[4];
 	H[0]=new HinhTron(2);
 	H[1]=new HinhTamGiac(5,6);
 	H[2]=new HinhChuNhat(5,4);
 	float max=H[0]->TinhDienTich();
 	for(int i=1;i<3;i++){
 		float temp=H[i]->TinhDienTich();
 		if(max<temp)
 		 	max=temp;
	 }
	 
	cout<<max;
	getch();
}
