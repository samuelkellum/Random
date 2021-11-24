#include <iostream>
#include <string>

using namespace std;

class BetterHouse
{
private:
        string city;
        int price;
        int bedrooms;
        int bathrooms;

public:
        BetterHouse(string c, int p, int beds, int baths)
        {
                city = c;
                price = p;
                bedrooms = beds;
                bathrooms = baths;
        }
        string getCity()
        {
                return this->city;
        }
        int getPrice()
        {
                return this->price;
        }
        int getBedrooms()
        {
                return this->bedrooms;
        }
        int getBathrooms()
        {
                return this->bathrooms;
        }
        void changeCityName(string newName)
        {
                this->city = newName;
        }
        void changePrice(int change)
        {
                this->price += change;
        }
        void setPrice(int newPrice)
        {
                this->price = newPrice;
        }
        void changeBedrooms(int change)
        {
                this->bedrooms += change;
        }
        void setBedrooms(int newBedrooms)
        {
                this->bedrooms = newBedrooms;
        }
        void changeBathrooms(int change)
        {
                this->bathrooms += change;
        }
        void setBathrooms(int newBathrooms)
        {
                this->bathrooms = newBathrooms;
        }
};