package Morrisje.com;

public class Fish extends Animal {
    private int gills;
    private int fins;
    private int eyes;

    public Fish(String name,int size, int weight, int gills, int fins, int eyes) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.fins = fins;
        this.eyes = eyes;
    }

    private void rest(int speed){
        rest(1);
        System.out.println("Fish speed called ");
    }
    private void moveMuscle(){}
    private void moveFin(){}
    private void swim(int speed){
        moveMuscle();
        moveFin();
        super.move(7);
        System.out.println("Fish swim called " + speed);
    }
}
