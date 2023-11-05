public class Cat implements AdoptableAnimal{

    String name;
    String description;
    double price;

    public Cat (String name, String description, double price){
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public String getDescription(){
        return description;
    }

    @Override
    public double getPrice(){
        return price;
    }
}
