package Game;

/**
 * Class for player
 */
public class Player {

    private int money;
    private int food;
    private int lasso;
    private int day;
    private Horsey horsey;

    // instances for other classes, but gives here due to saving changed instances instead of changing each time

    private int foodAvailability = 5;
    private int LassoAvailability = 5;
    private int foodPrice = 4;
    private int lassoPrice = 10;

    public Player(int money, int food, int lasso, int day, Horsey horsey) {
        this.money = money;
        this.food = food;
        this.lasso = lasso;
        this.day = day;
        this.horsey = horsey;
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

    public Horsey getHorsey() {
        return horsey;
    }

    public void setHorsey(Horsey horsey) {
        this.horsey = horsey;
    }

    public int getFoodAvailability() {
        return foodAvailability;
    }

    public void setFoodAvailability(int foodAvailability) {
        this.foodAvailability = foodAvailability;
    }

    public int getLassoAvailability() {
        return LassoAvailability;
    }

    public void setLassoAvailability(int lassoAvailability) {
        LassoAvailability = lassoAvailability;
    }

    public int getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(int foodPrice) {
        this.foodPrice = foodPrice;
    }

    public int getLassoPrice() {
        return lassoPrice;
    }

    public void setLassoPrice(int lassoPrice) {
        this.lassoPrice = lassoPrice;
    }

    @Override
    public String toString() {
        return "Player{" +
                "money=" + money +
                ", food=" + food +
                ", lasso=" + lasso +
                ", day=" + day +
                ", horsey=" + horsey +
                ", foodAvailability=" + foodAvailability +
                ", LassoAvailability=" + LassoAvailability +
                ", foodPrice=" + foodPrice +
                ", lassoPrice=" + lassoPrice +
                '}';
    }
}
