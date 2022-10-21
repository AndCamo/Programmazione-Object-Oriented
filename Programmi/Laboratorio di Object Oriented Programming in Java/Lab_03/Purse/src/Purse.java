import java.util.ArrayList;
import java.util.List;

public class Purse {

    static final Coin DOLLAR = new Coin("Dollar", 1);
    static final Coin QUARTER = new Coin("Quarter", 0.25);
    static final Coin DIME = new Coin("Dime", 0.10);
    static final Coin NICKEL = new Coin("Nickel", 0.05);
    static final Coin CENT = new Coin("Cent", 0.01);

    private final List<Coin> coins;

    public Purse() {
        coins = new ArrayList<>();
    }

    public void add(Coin coin) {
        coins.add(coin);
    }

    public boolean find(Coin coin) {
        for(Coin tmpCoin : coins)
        {
            if(tmpCoin.equals(coin))
                return true;
        }
        return false;
    }

    public int count(Coin coin) {
        int counter = 0;
        for (Coin tmpCoin : coins)
        {
            if(tmpCoin.equals(coin))
                counter++;
        }

        return counter;
    }

    public Coin getMinimum() {
        if(coins.size() == 0) {
            System.out.println("Purse is empty!");
            return null;
        }
        Coin minCoin = coins.get(0);
        for (Coin tmpCoin : coins)
        {
            if (tmpCoin.getValue() < minCoin.getValue())
                minCoin = tmpCoin;
        }

        return minCoin;

    }

    public Coin getMaximum() {
        if (coins.size() == 0) {
            System.out.println("Purse is empty!");
            return null;
        }
        Coin maxCoin = coins.get(0);
        for (Coin tmpCoin : coins)
        {
            if (tmpCoin.getValue() > maxCoin.getValue())
                maxCoin = tmpCoin;
        }

        return maxCoin;
    }

    public double getTotal() {
        double total = 0;
        for(Coin tmpCoin : coins)
            total = total + tmpCoin.getValue();

        return  total;
    }

    public void remove(Coin coin) {
        for(int i = 0; i < coins.size(); i++)
        {
            if (coins.get(i).getValue() == coin.getValue())
            {
                coins.remove(i);
                break;
            }
        }
    }

    public boolean hasCoin(Coin coin) {
        for(Coin tmpCoin : coins)
        {
            if (tmpCoin.getValue() == coin.getValue())
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        int dollarCounter = count(DOLLAR);
        int quarterCounter = count(QUARTER);
        int dimeCounter = count(DIME);
        int nickelCounter = count(NICKEL);
        int centCounter = count(CENT);

        String purseString =
                "Purse[Dollar = " + dollarCounter +
                        ", Quarter = " + quarterCounter +
                        ", Dime = " + dimeCounter +
                        ", Nickel = " + dimeCounter +
                        ", Cent = " + centCounter +
                        "]";

        return purseString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Purse purse = (Purse) o;
        return (this.count(DOLLAR) == purse.count(DOLLAR)
                && this.count(QUARTER) == purse.count(QUARTER)
                && this.count(DIME) == purse.count(DIME)
                && this.count(NICKEL) == purse.count(NICKEL)
                && this.count(CENT) == purse.count(CENT));
    }
}