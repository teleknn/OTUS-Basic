package DZCollection2;

import java.util.Objects;

public class Account {
    private int id;
    private int goldCoins;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id && goldCoins == account.goldCoins;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, goldCoins);
    }

    public Account(int id, int goldCoins) {
        this.id = id;
        this.goldCoins = goldCoins;
    }

    public int getId() {
        return id;
    }

    public int getGoldCoins() {
        return goldCoins;
    }

    public void setGoldCoins(int goldCoins) {
        this.goldCoins = goldCoins;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", goldCoins=" + goldCoins +
                '}';
    }

    public int addCoins (int goldCoins){
        this.goldCoins += goldCoins;

        return this.goldCoins;
    }
}
