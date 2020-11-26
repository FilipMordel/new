package klasa_01;

public class Main01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        if (cat.equals(dog)) {
            System.out.println("Są równe");
        } else {
            System.out.println("Nie są równe");
        }
    }
}

