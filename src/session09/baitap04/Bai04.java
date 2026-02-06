package session09.baitap04;

public class Bai04 {
    public static void main(String[] args) {

        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        Animal[] animals = { animal1, animal2 };

        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();

            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                dog.bark();
            } else if (animal instanceof Cat) {
                Cat cat = (Cat) animal;
                cat.meow();
            }
        }
    }
}
