#include <iostream>
#include <string>
#include "BestHouse.h"
using namespace std;

BestHouse::BestHouse(string c, int p, int beds, int baths)
{
    string city = c;
    int price = p;
    int bedrooms = beds;
    int bathrooms = baths;
}

string BestHouse::getCity(){
    return city;
}

int BestHouse::getPrice()
{
    return price;
}
int getBedrooms()
{
    return bedrooms;
}
int getBathrooms()
{
    return bathrooms;
}
void changeCityName(string newName)
{
    city = newName;
}
void changePrice(int change)
{
    price += change;
}
void setPrice(int newPrice)
{
    price = newPrice;
}
void changeBedrooms(int change)
{
    bedrooms += change;
}
void setBedrooms(int newBedrooms)
{
    bedrooms = newBedrooms;
}
void changeBathrooms(int change)
{
    bathrooms += change;
}
void setBathrooms(int newBathrooms)
{
    bathrooms = newBathrooms;
}