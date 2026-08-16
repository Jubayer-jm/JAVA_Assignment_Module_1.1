public class Animal {

    void sound() {
        System.out.println("Some sound");
    }

    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Bark");
    }
}