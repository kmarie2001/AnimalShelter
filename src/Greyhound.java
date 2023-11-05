public class Greyhound extends Dog{

    String name;
    String description;
    double price;

    public Greyhound(String name, String description, double price){
        super(name, description, price);
        this.name = name;
        this.description = description;
        this.price = price;
    }
    @Override
    public String getBreed(){
        return "Greyhound";
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
