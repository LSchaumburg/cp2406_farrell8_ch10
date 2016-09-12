/**
 * Created by jc247746 on 12/09/16.
 */
public class Horse {
    protected String name;
    protected String color;
    protected int birthyear;

    public Horse(String name, String color, int birthyear) {
        this.name = name;
        this.color = color;
        this.birthyear = birthyear;

    }
    public void display(){
        System.out.println("Horse's name = " + name);
        System.out.println("Horse's color = " + color);
        System.out.println("Horse was born in = " + birthyear);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }
}
