package Game;

/**
 * Class for player
 */
public class Player {

    private int money;
    private int food;
    private int lasso;
    private int day;

    public Player(int money, int food, int lasso, int day) {
        this.money = money;
        this.food = food;
        this.lasso = lasso;
        this.day = day;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getLasso() {
        return lasso;
    }

    public void setLasso(int lasso) {
        this.lasso = lasso;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Player{" +
                "money=" + money +
                ", food=" + food +
                ", lasso=" + lasso +
                ", day=" + day +
                '}';
    }
}
