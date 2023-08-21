import java.util.Scanner;
import java.text.DecimalFormat;

public class receipt {
    public static void main(String[] args) {
        // declare variables
        String firstName, lastName, productName;
        double productPrice, totalPrice, amountPaid, change;
        int quantity;
        
        // declare objects
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("###,###.00 ");

        // get input
        
         System.out.println("----------Welcome to Karen's Shoppe!---------- ");
         System.out.println("Cebu City");
         
         System.out.println("Contact # 09123456789");
         System.out.println("kcomandante@ssct.edu.ph");
        System.out.println("------------------------------------------------");
        System.out.print(" first name: ");
        firstName = keyboard.nextLine();
        System.out.print(" last name: ");
        lastName = keyboard.nextLine();

        System.out.println("-------------------------------------------");

        System.out.print("Enter the product name: ");
        productName = keyboard.nextLine();
        System.out.print("Enter the product price: ");
        productPrice = keyboard.nextDouble();
        System.out.print("Enter the quantity: ");
        quantity = keyboard.nextInt();

        System.out.println("-------------------------------------------");
        System.out.print("Enter the amount paid: ");
        amountPaid = keyboard.nextDouble();
        
        // calculate total price
        totalPrice = productPrice * quantity;
        
        // calculate change
        change = amountPaid - totalPrice;
        
        // print receipt
        System.out.println("-------------------------------------------");
        System.out.println(lastName + ", " + firstName);
        System.out.println("Product name: " + productName);
        System.out.println("Product price: " + formatter.format(productPrice));
        System.out.println("Quantity: " + quantity);
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println("Total price: " + formatter.format(totalPrice));

        System.out.println("-------------------------------------------");
       
        System.out.println("AMOUNT PAID: " +    formatter.format(amountPaid));
        
        // Display how much moneDD the customer paid
        if (amountPaid >= totalPrice) {
            System.out.println("CHANGE: " +     formatter.format(change));
        } else {
            System.out.println("Insufficient payment. Additional " + formatter.format(totalPrice - amountPaid) + " ₱ required.");
        }
        System.out.println("         Thank You! Come Again!    ");
    }
}
