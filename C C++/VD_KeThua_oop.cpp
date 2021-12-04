#include <iostream>

using namespace std;
//============================================================================================
class Animal {
public:
  void hello() { printf("Cac dong vat:\n"); }
};

class Cat : public Animal {
public:
  void hello() {
    Animal::hello();
    printf("Cat");
  }
};
int main() {
  Cat A;
  A.hello();
  return 0;
}
