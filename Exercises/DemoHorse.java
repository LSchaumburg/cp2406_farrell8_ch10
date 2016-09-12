/**
 * Created by jc247746 on 12/09/16.
 */
public class DemoHorse {
    public static void main(String[] args) {
        Horse horse = new Horse("Penice", "Brown", 1995);
        RaceHorse athlete = new RaceHorse("Dyck", "Black", 2001, 12);

        horse.display();
        System.out.println("");
        athlete.display();

    }
}
