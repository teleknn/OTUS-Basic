package DZCollectionsException;


import java.util.*;

public class BankImpl implements Bank {

    private Map<UUID, Client> clients = new HashMap<>();
    private Map<UUID, List<Account>> clientAccounts = new HashMap<>();
    private Map<UUID, Client> accounts = new HashMap<>();


    @Override
    public List<Account> getAccounts(Client client) {

        return clientAccounts.get(client.getUuidClient());
    }

    @Override
    public List<Account> getAccounts(UUID uuidClient) {

        return clientAccounts.get(uuidClient);
    }

    @Override
    public Client findClient(Account account) {

        return accounts.get(account.getUuidAccount());
    }

    @Override
    public Client findClient(UUID uuidAccount) {

        return accounts.get(uuidAccount);
    }

    @Override
    public Client addClient(String name, Integer age) {
        Client client = null;
        try {
            client = new Client(name, age);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
        clients.put(client.getUuidClient(), client);
        clientAccounts.put(client.getUuidClient(), new ArrayList<Account>(0));
        return client;
    }

    public Client addClient(Client client) {
        if (client == null) {
            throw new NullPointerException();
        }
        clients.put(client.getUuidClient(), client);
        clientAccounts.put(client.getUuidClient(), new ArrayList<Account>(0));
        return client;
    }

    @Override
    public Account createAccount(UUID uuidClients, Integer goldCoin) {
        Account account = new Account(goldCoin);

        Client client = clients.get(uuidClients);
        if (client == null) {
            throw new NullPointerException();
        }
        clientAccounts.get(uuidClients).add(account);

        accounts.put(account.getUuidAccount(), client);
        return account;

    }

    @Override
    public Account addDelCoin(UUID uuidClients, UUID uuidAccount, Integer coins) {

        List<Account> acc = clientAccounts.get(uuidClients);
        for (Account a : acc) {
            if (uuidAccount.equals(a.getUuidAccount())) {
                if (coins < 0 && a.getGoldCoins() + coins < 0) {
                    Client client = clients.get(uuidClients);
                    throw new AccountException("Account error: not enough money for client UUID = " + client.getUuidClient());
//
                }
                a.addCoins(coins);
                return a;
            }

        }

        return null;
    }
}

