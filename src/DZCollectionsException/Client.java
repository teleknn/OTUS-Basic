package DZCollectionsException;


import java.util.Objects;
import java.util.UUID;

public class Client {
    private String name;
    private int age;
    private UUID uuidClient;

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

    private void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age must be > 0 ");
        }
    }

    public Client(String name, int age) {
        validateAge(age);
        this.name = name;
        this.age = age;
        uuidClient = UUID.randomUUID();
    }

    public Client(String name, int age, UUID uuidClient) {
        validateAge(age);
        this.name = name;
        this.age = age;
        this.uuidClient = uuidClient;
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
