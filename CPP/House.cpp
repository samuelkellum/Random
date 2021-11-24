#include <iostream>
#include <string>

using namespace std;

class House
{
private:
        string city;
        int price;
        int bedrooms;
        int bathrooms;

public:
        House(string c, int p, int beds, int baths)
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

int main(){
        House house1 = House("New Orleans", 500000, 1, 2);

        cout << house1.getCity() << endl;

        cout << house1.getPrice() << endl;

        house1.changePrice(-100000);
        cout << house1.getPrice() << endl;

        house1.setPrice(1234567);
        cout << house1.getPrice() << endl;

        House house2 = House("Los Angeles", 160000000, 20, 23);

        cout << "\n" << house2.getPrice() << endl;
        cout << house2.getCity() << endl;

}