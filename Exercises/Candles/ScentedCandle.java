package Candles;

/**
 * Created by Luke on 18/09/2016.
 */
public class ScentedCandle extends Candle{
    protected String scent;

    public ScentedCandle(String color, double height, String scent) {
        super(color, height);
        this.scent = scent;
    }

    public String getScent() {
        return scent;
    }

    public void setScent(String scent) {
        this.scent = scent;
    }

    @Override
    public void setHeight(double height){
            this.height = height;
            price = height * 3;
    }
}
