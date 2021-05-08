package DZCollectionUUID;

public class DZCollection {
    public static void main(String[] args) {
        BankImpl alfa = new BankImpl();
        Client client1 = alfa.addClient("Vasiliy", 30);
        Client client2 = alfa.addClient("Petr", 12);
        Client client3 = alfa.addClient("Andrey", 35);
        Client client4 = alfa.addClient("Urii", 40);

        Account account10 = alfa.createAccount(client1.getUuidClient(), 100);
        Account account11 = alfa.createAccount(client1.getUuidClient(), 0);
        Account account14 = alfa.createAccount(client2.getUuidClient(), 200);
        Account account15 = alfa.createAccount(client3.getUuidClient(), 0);

        System.out.println("Customer " + client1.getName() + " information:\n " + alfa.getAccounts(client1) + "\n");
        System.out.println("Customer " + client2.getName() + " information:\n " + alfa.getAccounts(client2) + "\n");

        System.out.println("Search for the account it belongs to:\n " + alfa.findClient(account11) + "\n");
        System.out.println("Search for the account it belongs to:\n " + alfa.findClient(account15) + "\n");

        System.out.println("AFTER ADD/DEL COINS: \n");


        System.out.println("Client " + client1.getName() + "\n" +
                alfa.addDelCoin(client1.getUuidClient(), account10.getUuidAccount(), 400) + "\n");

        System.out.println("Client " + client2.getName() + "\n" +
                alfa.addDelCoin(client2.getUuidClient(), account14.getUuidAccount(), 2000) + "\n");

        System.out.println("Client " + client3.getName() + "\n" +
                alfa.addDelCoin(client3.getUuidClient(), account15.getUuidAccount(), -2000) + "\n");

    }
}