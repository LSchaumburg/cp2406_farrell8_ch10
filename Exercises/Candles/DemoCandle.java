package Candles;

/**
 * Created by Luke on 18/09/2016.
 */
public class DemoCandle {
    public static void main(String[] args) {
        Candle candle = new Candle("Red", 5.5);
        ScentedCandle scented = new ScentedCandle("Cream", 7.25, "honey");

        candle.display();
        System.out.println("");
        scented.display();
    }
}
