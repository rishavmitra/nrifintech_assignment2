public class Product {
    private String name;
    private String id;
    private int age;
    private float price;
    private int qty;

    public Product(String name, String id, int age, float price, int qty) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.price = price;
        this.qty = qty;
    }

    public String showDetails() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    public String showName() {
        return this.name;
    }
}
