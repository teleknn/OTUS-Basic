package DZCollection2;

import java.util.List;

public interface Bank {

    List<Account> getAccounts(Client client);

    Client findClient(Account account);

    Client addClient(String name, Integer age);

    Account createAccount(String name, Integer id, Integer goldCoin);

    Account addDeleteCoin(String name, Integer accountId, Integer coins);

}
