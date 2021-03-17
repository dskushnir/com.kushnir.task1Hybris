package threading.lesson4InventoryManager;

public class Product {
    int id;
    String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                        "| name:" + name;
    }
}
