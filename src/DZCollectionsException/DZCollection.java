package DZCollectionsException;

import java.util.List;

public class DZCollection {
    public static void main(String[] args) {

        Client client1 = null;
        Client client2 = null;
        Client client3 = null;
        Client client4 = null;

        try (MyDataBase r = new MyDataBase()) {
            List<Client> listClient = r.getClients();
            client1 = listClient.get(0);
            client2 = listClient.get(1);
            client3 = listClient.get(2);
            client4 = listClient.get(3);

        } catch (Exception e) {
            e.printStackTrace();
        }

        BankImpl alfa = new BankImpl();
        alfa.addClient("Test", 40);
        alfa.addClient(client1);
        alfa.addClient(client2);
        alfa.addClient(client3);
        alfa.addClient(client4);

        Account account10 = alfa.createAccount(client1.getUuidClient(), 100);
        Account account11 = alfa.createAccount(client1.getUuidClient(), 0);

        Account account14 = alfa.createAccount(client2.getUuidClient(), 200);
        Account account15 = alfa.createAccount(client3.getUuidClient(), 0);

        System.out.println("Customer " + client1.getName() + " information:\n " + alfa.getAccounts(client1) + "\n");
        System.out.println("Customer " + client2.getName() + " information:\n " + alfa.getAccounts(client2) + "\n");

        System.out.println("Search for the account it belongs to:\n " + alfa.findClient(account11) + "\n");
        System.out.println("Search for the account it belongs to:\n " + alfa.findClient(account15) + "\n");

        System.out.println("AFTER ADD/DEL COINS: \n");

        try {
            System.out.println("Client " + client1.getName() + "\n" +
                    alfa.addDelCoin(client1.getUuidClient(), account10.getUuidAccount(), 400) + "\n");

            System.out.println("Client " + client2.getName() + "\n" +
                    alfa.addDelCoin(client2.getUuidClient(), account14.getUuidAccount(), 2000) + "\n");

            System.out.println("Client " + client3.getName() + "\n" +
                    alfa.addDelCoin(client3.getUuidClient(), account15.getUuidAccount(), 2000) + "\n");
        } catch (AccountException e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
            //System.exit(53);

        }

        //Даем на создание счет НЕ валидный UUID
        //UUID testClient = UUID.randomUUID();
        //Account account17 = alfa.createAccount(testClient, 200);


        //Client client5 = null;
        //alfa.addClient(client5);


    }
}