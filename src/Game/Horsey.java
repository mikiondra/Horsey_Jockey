package Game;

/**
 * Class, which horses will use
 */
public class Horsey {

    private String name;
    private int str;
    private int hunger;
    private boolean Alive;

    public Horsey(String name, int str, int hunger, boolean alive) {
        this.name = name;
        this.str = str;
        this.hunger = hunger;
        Alive = alive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public boolean isAlive() {
        return Alive;
    }

    public void setAlive(boolean alive) {
        Alive = alive;
    }

    @Override
    public String toString() {
        return "Horsey{" +
                "name='" + name + '\'' +
                ", str=" + str +
                ", hunger=" + hunger +
                ", Alive=" + Alive +
                '}';
    }
}
