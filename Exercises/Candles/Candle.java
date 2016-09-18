package Candles;

/**
 * Created by Luke on 18/09/2016.
 */
public class Candle {
    protected String color;
    protected double height;
    protected double price;

    public Candle(String color, double height){
        this.color = color;
        this.height = height;
        this.price = height * 2;
    }

    public void display(){
        System.out.println("Price comes to: $" + price);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
