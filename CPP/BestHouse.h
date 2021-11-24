#include <iostream>
#include <string>
using namespace std;

class BestHouse
{
private:
    string city;
    int price;
    int bedrooms;
    int bathrooms;

public:
    BestHouse(string c, int p, int beds, int baths);
    string getCity();
    int getPrice();
    int getBedrooms();
    int getBathrooms();
    void changeCityName(string newName);
    void changePrice(int change);
    void setPrice(int newPrice);
    void changeBedrooms(int change);
    void setBedrooms(int newBedrooms);
    void changeBathrooms(int change);
    void setBathrooms(int newBathrooms);
};