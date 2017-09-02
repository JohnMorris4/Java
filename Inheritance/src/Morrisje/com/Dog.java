package Morrisje.com;

public class Dog extends Animal {
    private int legs;
    private int teeth;
    private int eyes;
    private int tail;
    private String breed;
    private String coat;
    public Dog(String name, int size, int weight, int legs, int teeth, int eyes, int tail, String breed, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes=eyes;
        this.legs=legs;
        this.teeth=teeth;
        this.tail=tail;
        this.breed=breed;
        this.coat=coat;
    }
    private void chew(){
        System.out.println("Chew called whoff whoff");
    }

    @Override
    public void eat() {
        chew();
        super.eat();
    }
    public void walk(){
    super.move(4);

    }
    public void run(){
    move(11);
    }
    private void moveLegs(int speed){
        System.out.println("dog moveLegs called");
    }
    @Override
    public void move(int speed) {
        moveLegs(speed);
        System.out.println("The override dog.move called");
        super.move(speed);
    }
}
