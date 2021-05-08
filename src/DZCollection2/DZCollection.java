package DZCollection2;

public class DZCollection {
    public static void main(String[] args) {
        BankImpl alfa = new BankImpl();
        Client client1 = alfa.addClient("Vasiliy", 30);
        Client client2 = alfa.addClient("Petr", 12);
        Client client3 = alfa.addClient("Andrey", 35);
        Client client4 = alfa.addClient("Urii", 40);
        Client client5 = alfa.addClient("Den", 33);
        Client client6 = alfa.addClient("Maria", 30);
        Client client7 = alfa.addClient("Luba", 41);
        Client client8 = alfa.addClient("Vasiliy", 30);

        Account account10 = alfa.createAccount("Vasiliy", 10, 100);
        Account account11 = alfa.createAccount("Vasiliy", 11, 0);
        Account account12 = alfa.createAccount("Vasiliy", 12, 300);
        Account account13 = alfa.createAccount("Vasiliy", 13, 355);

        Account account14 = alfa.createAccount( "Petr", 14,200);

        Account account15 = alfa.createAccount( "Andrey", 15,0);

        Account account16 = alfa.createAccount( "Den", 16,0);

        //alfa.addCoin(10,1000,"Vasiliy");

        //System.out.println(alfa.addCoin(10,100,"Vasiliy"));

        System.out.println(alfa.getAccounts(client1) + "\n");

        System.out.println(alfa.findClient(account11) + "\n");

        //System.out.println(alfa.findClient(account15));
        System.out.println(alfa.getAccounts(client3) + "\n");

        alfa.addDeleteCoin("Vasiliy", 10, -100);
        alfa.addDeleteCoin("Petr", 14, 2000);

        System.out.println(alfa.getAccounts(client1) + "\n");
        System.out.println(alfa.getAccounts(client2) + "\n");

    }
}
