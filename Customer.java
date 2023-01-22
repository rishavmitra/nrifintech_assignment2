/**
 * Customer
 */
public class Customer {
    private String name;
    private String DOB;
    private int age;
    private String sex;
    private int height;

    public Customer(String name, String DOB, int age, String sex, int height) {
        this.name = name;
        this.DOB = DOB;
        this.age = age;
        this.sex = sex;
        this.height = height;
    }

    public String showDetails() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", DOB='" + DOB + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", height='" + height + '\'' +
                '}';
    }

    public String showName() {
        return this.name;
    }
}