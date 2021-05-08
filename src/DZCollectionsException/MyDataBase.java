package DZCollectionsException;

import java.util.ArrayList;
import java.util.List;

public class MyDataBase implements AutoCloseable {
    @Override
    public void close()  {
        //System.out.println("Closed MyResource");
    }

    public List<Client> getClients () {
        Client client1 = new Client("Vasiliy", 30);
        Client client2 = new Client("Petr", 12);
        Client client3 = new Client("Andrey", 35);
        Client client4 = new Client("Urii", 40);
        List<Client> result = new ArrayList<>();
        result.add(client1);
        result.add(client2);
        result.add(client3);
        result.add(client4);

        return result;
    }
}
