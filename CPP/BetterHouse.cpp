#include <iostream>
#include <string>
#include "BetterHouse.h"

using namespace std;

int main(){
    BetterHouse house1 = BetterHouse("New Orleans", 500000, 1, 2);

    cout << house1.getCity() << endl;
    cout << house1.getPrice() << endl;
        
    house1.changePrice(-100000);
    cout << house1.getPrice() << endl;

    house1.setPrice(1234567);
    cout << house1.getPrice() << endl;

    BetterHouse house2 = BetterHouse("Los Angeles", 160000000, 20, 23);

    cout << "\n" << house2.getPrice() << endl;
    cout << house2.getCity() << endl;

}