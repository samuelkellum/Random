class House:
    def __init__(self, city, price, bedrooms, bathrooms):
        self.city = city
        self.price = price
        self.bedrooms = bedrooms
        self.bathrooms = bathrooms

    def getCity(self):
        return self.city

    def getPrice(self):
        return self.price

    def getBedrooms(self):
        return self.bedrooms

    def getBathrooms(self):
        return self.bathrooms

    def changeCityName(self, newName):
        self.city = newName

    def changePrice(self, change):
        self.price += change

    def setPrice(self, newPrice):
        self.price = newPrice

    def changeBedrooms(self, change):
        self.bedrooms += change

    def setBedrooms(self, newBedrooms):
        self.bedrooms = newBedrooms

    def changeBathrooms(self, change):
        self.bathrooms += change

    def setBathrooms(self, newBathrooms):
        self.bathrooms = newBathrooms

house1 = House("New Orleans", 500000, 1, 2)
print(house1.getPrice())
print(house1.getCity())

house1.changePrice(-100000)
print(house1.getPrice())

house1.setPrice(1234567)
print(house1.getPrice())

house2 = House("Los Angeles", 160000000, 20, 23)
print("")
print(house2.getPrice())
print(house2.getCity())