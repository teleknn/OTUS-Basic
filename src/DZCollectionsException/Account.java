package DZCollectionsException;

import java.util.Objects;
import java.util.UUID;

public class Account {
    private UUID uuidAccount = UUID.randomUUID();
    private int goldCoins;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return goldCoins == account.goldCoins && Objects.equals(uuidAccount, account.uuidAccount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(goldCoins, uuidAccount);
    }

    public Account(int goldCoins) {
        this.goldCoins = goldCoins;
    }


    public int getGoldCoins() {
        return goldCoins;
    }

    public UUID getUuidAccount() {
        return uuidAccount;
    }

    public void setGoldCoins(int goldCoins) {
        this.goldCoins = goldCoins;
    }

    @Override
    public String toString() {
        return "Account{" +
                "UUID=" + uuidAccount +
                ", GOLD COINS=" + goldCoins +
                '}';
    }

    public int addCoins (int goldCoins){
        this.goldCoins += goldCoins;

        return this.goldCoins;
    }
}
