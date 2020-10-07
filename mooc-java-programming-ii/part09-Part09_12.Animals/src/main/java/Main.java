
public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.eat();

        Dog fido = new Dog("Fido");
        fido.bark();
        
        NoiseCapable dog1 = new Dog();
        dog1.makeNoise();

        NoiseCapable cat = new Cat("Garfield");
        cat.makeNoise();
        Cat c = (Cat) cat;
        c.purr();

    }

}
