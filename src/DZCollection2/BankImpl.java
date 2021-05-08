package DZCollection2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankImpl implements Bank {

    private Map<String, Client> clients = new HashMap<>();
    private Map<String, List<Account>> clientAccounts = new HashMap<>();
    private Map<Integer, Client> accounts = new HashMap<>();


    @Override
    public List<Account> getAccounts(Client client) {

        return clientAccounts.get(client.getName());
    }

    @Override
    public Client findClient(Account account) {

        return accounts.get(account.getId());
    }

    @Override
    public Client addClient(String name, Integer age) {
        Client client = new Client(name, age);
        clients.put(name, client);
        clientAccounts.put(client.getName(), new ArrayList<Account>(0));
        return client;
    }

    @Override
    public Account createAccount(String name, Integer id, Integer goldCoin) {
        Account account = new Account(id, goldCoin);
        Client client = clients.get(name);
        clientAccounts.get(name).add(account);
        accounts.put(id, client);
        return account;

    }

    @Override
    public Account addDeleteCoin(String name, Integer accountId, Integer coins) {

        List<Account> acc = clientAccounts.get(name);
        for (Account a : acc) {
            if (accountId.equals(a.getId())) {
                if (coins < 0 && a.getGoldCoins() + coins < 0) {
                    System.out.println("Account error: not enough money");
                    return a;
                }
                a.addCoins(coins);
                return a;
            }

        }

        return null;
    }
}

