package DZCollectionsException;

import java.util.List;
import java.util.UUID;

public interface Bank {

    List<Account> getAccounts(Client client);

    Client findClient(Account account);

    Client addClient(String name, Integer age);

    Account createAccount(UUID uuidClients, Integer goldCoin);

    Account addDelCoin(UUID uuidClients, UUID uuidAccount, Integer coins);

    List<Account> getAccounts(UUID uuidClient);

    Client findClient(UUID uuidAccount);

    public Client addClient(Client client);

}
