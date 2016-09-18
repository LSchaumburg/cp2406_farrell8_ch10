package Horses;

/**
 * Created by jc247746 on 12/09/16.
 */
public class RaceHorse extends Horse {

    private int races;

    public RaceHorse(String name, String color, int birthyear, int races) {
        super(name, color, birthyear);

        this.races = races;
    }

    public int getRaces() {
        return races;
    }

    public void setRaces(int races) {
        this.races = races;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Number of races raced = " + races);
    }
}
