#include <iostream>

using namespace std;

bool is_five(int num){
  if (num == 5){
    cout << ":)" << endl;
    return true;
  }
  else if (num == 2){
    cout << "Fuck" << endl;
  }
  return false;
}

int main(){
  is_five(5);
  is_five(2);
  return 0;
}
