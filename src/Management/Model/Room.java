package Management.Model;
import java.util.Scanner;
import java.util.ArrayList;

public class Room {
    private String id;
    private String name;
    private float price;
    private String type;

    public Room() {

    }
    public Room(String id, String name, float price, String type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }
}
