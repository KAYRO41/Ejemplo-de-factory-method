package Product;

public class FactoryMethodExample {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        creatorA.someOperation(); 

        Creator creatorB = new ConcreteCreatorB();
        creatorB.someOperation();  
    }
}