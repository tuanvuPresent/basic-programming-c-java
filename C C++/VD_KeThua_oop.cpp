#include <iostream>

using namespace std;
//============================================================================================
class Animal{
	public:
		void  Hello(){
			printf("Cac dong vat:\n");
		}
};

class Cat:public Animal{
	public:
		void Hello(){
			Animal::Hello();
			printf("Cat");
		}
};
int main(){
	Cat A;
	A.Hello();
	return 0;
}
