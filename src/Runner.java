public class Runner {
    public static void main(String[] args) {
        AbstractClassExample dog = new AbstractClassExample() {
            @Override
            public void eat() {
                System.out.println("Dog eats.");
            }
        };

        dog.eat();

        InterfaceExample cat = () -> System.out.println("Cat eats.");

        cat.eat();
    }
}
