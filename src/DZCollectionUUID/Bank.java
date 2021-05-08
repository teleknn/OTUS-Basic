package DZCollectionUUID;

import java.util.List;
import java.util.UUID;

public interface Bank {

    List<Account> getAccounts(Client client);

    Client findClient(Account account);

    Client addClient(String name, Integer age);

    Account createAccount(UUID uuidClients, Integer goldCoin);

    Account addDelCoin(UUID uuidClients, UUID uuidAccount, Integer coins);

}