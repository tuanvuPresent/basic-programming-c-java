#include<stdlib.h>
#include <stdio.h>
#include<string.h>
#include<ctype.h>

void nhapstring(char s[256]){
		gets(s);
}
void xoavitri(char *a,int vt){							//dung de xoa vi tri vt
	int n=strlen(a);									//lay do dai` chuoi
	for(int i=vt;i<n;i++){
		a[i]=a[i+1];
	}
}

void  xoamotkytu(char *a, char c){						//dung` de xoa cac ki tu c
    int n=strlen(a);									//lay do dai` chuoi
    for(int i=0;i<n;i++)
        if(a[i]==c)										
        {
            for(int j=i--; j<n;j++)						
                a[j]=a[j+1];							
            n--;										//moi lan xoa thi` do dai` chuoi giam 1
        }
}  
void addstring(char *s,int vt,char c){					//dung de them vao chuoi ki tu c tai vi tri vt	
	int n=strlen(s);	
    for(int i=n; i>=vt;i--){
    	s[i+1]=s[i];
	}
	s[vt]=c;
}
void stringnumber(char *s){				//can ham xoavitri()
	int i;
	for(i=0;i<strlen(s);i++){
	if (s[i]<'0'||s[i]>'9'){
			xoavitri(s,i);
			i--;
		}
	}
}


void stringText(char *s){				//can ham xoavitri()
	int i;
	for(i=0;i<strlen(s);i++){
	if (s[i]>='0'&&s[i]<='9'){
			xoavitri(s,i);
			i--;
		}
	}
}


int cong2chuoi(char *s1,char *s2){			//can ham addstring();
	char s[256]={NULL};
	//them ky tu 0 vao chuoi ngan
	int k1=strlen(s2)-strlen(s1);
	int k2=strlen(s1)-strlen(s2);	
	for(int i=0;i<k1;i++) 
		addstring(s1,0,48);					//them 0 vao s1 neu s1 ngan hon
	for(int i=0;i<k2;i++) 
		addstring(s2,0,48);					//them 0 vao s2 neu s2 ngan hon
	//cong 2 chuoi lai
	int tang=0;								//la` bien nho'
	k1=strlen(s2);
	for(int i=k1-1;i>=0;i--){
		s[i+1]=s1[i]+s2[i]-48+tang;						
		if(s[i+1]>'9'){						//tong >9 	
			s[i+1]=s[i+1]-10;				//lay ket qua hang don vi	
			tang=1;							//nho' 1
		}
		else tang=0;
	}
	//ket qua
	s[0]=tang+48;							
	puts(s);
}

void tachso(char *s){					//can ham addstring()
	int k=strlen(s)-3;
	while(k>0){
		addstring(s,k,32);		
		k=k-3;
	}
}

void VietHoaText(char *s){
	int k=strlen(s);
	for(int i=0;i<k;i++){
		if(s[i]==' ')						//sau dau cach thi` viet hoa
			s[i+1]=toupper(s[i+1]);
	}
	s[0]=toupper(s[0]);						//viet hoa dau cau
}

int KiemTraChuoiDX(char *s){
	//khai bao bien
	int k=strlen(s);
	int j=k/2;
	//kiem tra
	for(int i=0;i<j;i++){
		if(s[i]!=s[--k]){		
			return 0;
		}
	}
	return 1;
}
int DemKiTuHoa(char *s){
	int k=strlen(s);
	int count=0;
	for(int i=0;i<k;i++){
//		if(isupper(s[i])) count++;
		if('A'<=s[i]&&s[i]<='Z') count++;
	}
	return count;
}
int DemKiTuThuong(char *s){
	int k=strlen(s);
	int count=0;
	for(int i=0;i<k;i++){
//		if(islower(s[i])) count++;
		if('a'<=s[i]&&s[i]<='z') count++;
	}
	return count;
}
int DemKiTuSo(char *s){
	int k=strlen(s);
	int count=0;
	for(int i=0;i<k;i++){
		if('0'<=s[i]&&s[i]<='9') count++;
	}
	return count;
}
int DemSo(char *s){						//diem chuoi so co trong chuoi
	int k=strlen(s);
	int count=0;
	int chopheptang=1;
	for(int i=0;i<k;i++){
		if('0'<=s[i]&&s[i]<='9'){			//neu la` so thi tang len 1
			if(chopheptang){
				count++;
				chopheptang=0;
			}
		}
		else if(('a'<=s[i]&&s[i]<='z')||('A'<=s[i]&&s[i]<='Z')) //la TEXT thi` moi duoc tang 
			chopheptang=1;
	}
	return count;
}
void XoaKhoangTrang(char *s){						//can ham xoavitri()
	int k=strlen(s);
	for(int i=0;i<k;i++){
		if(s[i]==32){									
			xoavitri(s,i);
			i--;
	}
}
}

int DaoNguocTu(char *s)
{
    int i, j,k=0;
    int n= strlen(s);
    char s1[256];
    for(i=n-1; i>=0; i--)
        {
        	//xu ly dau cach
            if(s[i]==32){
                {	          	  	
                    for(j=i+1; j<n; j++)
						s1[k++]=s[j];
                }
                s1[k++]=' ';
                n=i;
			}
			//xu ly dau chuoi
			if(i==0){
				for(j=i;j<n;j++)
					s1[k++]=s[j];
			}
        }    
    s1[strlen(s)]='\0';    
    strcpy(s,s1);
}
int TimKiem(char *s){
	//khai bao
	char key[256];
	int k=strlen(s);
	int j=0;
	int vt=-1;
	//nhap ky tu can tim
	printf("nhap ky tu can tim:");
	gets(key);
	int count=strlen(key);
	//tim kiem
	for(int i=0;i<k;i++){
		if(s[i]==key[j]){
			count--;
			if(count==0) return 1;
			j++;
		}
		else j=0;
	}
	return 0;
}
char *ThayThe(char *s,char *s1,char *s2){
	int len = strlen (s);
	int len1 = strlen (s1);
	int len2 = strlen (s2);
	int i = 0, luu;
	
	while(i<len){
		if(s[i]==s1[0]){
			luu=i;
			int j=0;
			while(s[++i]==s1[++j]&&j<len1);			//kiem tra xem co tim thay khong
			if(j==len1) {
			while(j--)
				xoavitri(s,luu);					//xoa ky tu tim thay
			j=len2;	
			while(j--)	
				addstring(s,luu,s2[j]);				//thay the
			}
		}
		else i++;
	}
	return s;
}
/*
+75: phím sang trai
+77: phím sang ph?i
+72: phím lên trên
+80: phím xu?ng
+32: Phím Space
+27: phim ESC  */
main(){
	char s[256],s1[256],s2[256];
	
	while(1){
	system("cls");	
	
	printf("Nhap vao chuoi 1: ");
	nhapstring(s);

	
	puts(s);

	system("pause");
}
}	
