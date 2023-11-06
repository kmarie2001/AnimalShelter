public abstract class Dog implements AdoptableAnimal{

    String name;
    String description;
    double price;

    public Dog(String name, String description, double price){
        this.name = name;
        this.description = description;
        this.price = price;
    }
    public abstract String getBreed();
}
//Side note: you can implement the getters
// for the dog fields inside the dog class
// and only override the breed name in the
// dog subclasses. Not require, but a good
// simplification that you can be aware of.
