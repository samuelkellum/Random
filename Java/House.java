public class House{
    private String city;
    private int price;
    private int bedrooms;
    private int bathrooms;

    public House(String city, int price, int bedrooms, int bathrooms){
        this.city = city;
        this.price = price;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
    }

    public String getCity(){
        return this.city;
    }

    public int getPrice(){
        return this.price;
    }

    public int getBedrooms(){
        return this.bedrooms;
    }

    public int getBathrooms(){
        return this.bathrooms;
    }

    public void changeCityName(String newName){
        this.city = newName;
    }

    public void changePrice(int change){
        this.price += change;
    }

    public void setPrice(int newPrice){
        this.price = newPrice;
    }

    public void changeBedrooms(int change){
        this.bedrooms += change;
    }

    public void setBedrooms(int newBedrooms){
        this.bedrooms = newBedrooms;
    }

    public void changeBathrooms(int change){
        this.bathrooms += change;
    }

    public void setBathrooms(int newBathrooms){
        this.bathrooms = newBathrooms;
    }

    public static void main(String[] args) {
        House house1 = new House("New Orleans", 500000, 1, 2);
        System.out.println(house1.getPrice());
        System.out.println(house1.getCity());

        house1.changePrice(-100000);
        System.out.println(house1.getPrice());

        house1.setPrice(1234567);
        System.out.println(house1.getPrice());

        House house2 = new House("Los Angeles", 160000000, 20, 23);
        System.out.println();
        System.out.println(house2.getPrice());
        System.out.println(house2.getCity());
    }

}