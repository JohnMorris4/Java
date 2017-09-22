package Morrisje.com;

public class Main {

    public static void main(String[] args) {
	//Define the Animal
        Animal animal = new Animal("Animal",1,1,5,14);

        Dog dog = new Dog("Buddy", 8,16,4,48,2,1,"Phom","course");
        dog.eat();
        dog.walk();
        dog.run();
    }
}
