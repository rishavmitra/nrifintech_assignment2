import java.util.Scanner;

public class Main {

    public static final Scanner GET = new Scanner(System.in);

    public static Customer getDetailsCustomer(){
        System.out.println("Enter details for customer: ");

        System.out.print("Enter name: ");  String name = GET.nextLine();
        System.out.print("Enter height: "); int height = GET.nextInt();
        System.out.print("Enter age: "); int age = GET.nextInt();
        System.out.print("Enter DOB: "); String dob = GET.next();
        System.out.print("Enter sex: "); String sex = GET.next();

        return new Customer(name,dob,age,sex,height);
    }

    public static Product getDetailsProduct(){
        System.out.println("Enter details for product: "); GET.nextLine();
        System.out.print("Enter name: ");  String name = GET.nextLine();
        System.out.print("Enter age: "); int age = GET.nextInt();
        System.out.print("Enter id: "); String id = GET.next();
        System.out.print("Enter price: "); float price = GET.nextFloat();
        System.out.print("Enter quantity: "); int qty = GET.nextInt();

        return new Product(name,id,age,price,qty);
    }
    public static void main(String[] args) {
        Customer rishav = getDetailsCustomer();
        Product soap = getDetailsProduct();

        System.out.println(rishav.showDetails());
        System.out.println(rishav.showName());
        System.out.println(soap.showDetails());
        System.out.println(soap.showName());


    }
}

/*

Enter details for customer:
Enter name: Rishav Mitra
Enter height: 170
Enter age: 23
Enter DOB: 23/09/1999
Enter sex: male
Enter details for product:
Enter name: handwash
Enter age: 3
Enter id: rkry974lrakrh
Enter price: 79
Enter quantity: 2
Customer{name='Rishav Mitra', DOB='23/09/1999', age='23', sex='male', height='170'}
Rishav Mitra
Product{name='handwash', id='rkry974lrakrh', age=3, price=79.0, qty=2}
handwash

* */