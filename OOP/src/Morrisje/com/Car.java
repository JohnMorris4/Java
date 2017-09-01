package Morrisje.com;

/**
 * Created by John on 8/30/2017.
 */
public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;


    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals ("nova") || validModel.equals ("mustang")) {
            this.model = model;
        } else {
            this.model = "unknown";
        }
    }
    public String  getModel(){
        return this.model;
    }
}
