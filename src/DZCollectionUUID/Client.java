package DZCollectionUUID;


import java.util.Objects;
import java.util.UUID;

public class Client {
    private String name;
    private int age;
    private UUID uuidClient = UUID.randomUUID();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return age == client.age && Objects.equals(name, client.name) && Objects.equals(uuidClient, client.uuidClient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, uuidClient);
    }

    public Client(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public UUID getUuidClient() {
        return uuidClient;
    }

    @Override
    public String toString() {
        return "Client{\n" +
                "NAME='" + name + '\'' +
                "\nAGE=" + age +
                "\nUUID Client=" + uuidClient +
                '}';
    }
}