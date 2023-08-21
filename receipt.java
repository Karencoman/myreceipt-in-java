import java.util.Scanner;

public class receipt {

    public static void main(String[] args) {
        /* Print out our Introduction of our Store/Company and Address */
        System.out.println("GAISANO MALL \nNational HWY., KM4 \nBrgy.Luna, Surigao City\nSurigao Del Norte");
        // Strings - Special Characters
        /*
         * The solution to avoid this problem, is to use the backslash escape character.
         * 
         * The backslash (\) escape character turns special characters into string
         * characters:
         * 
         * Example
         */
        // https://1.bp.blogspot.com/-m21EMUPvpKE/XvYpu7ngBkI/AAAAAAAABiA/GXBxEvsLS6EBDz7Ye3hajCmaFdp2gjflwCLcBGAsYHQ/s640/escape%2Bsequences%2Bin%2Bjava.png

        System.out.println("\n\n==========================================================================\n\n");

        /*
         * The Scanner class is used to get user input, and it is found in the java.util
         * package. import java.util.Scanner;
         */
        /*
         * To use the Scanner class, create an object of the class and use any of the
         * available methods found in the Scanner class documentation. In our example,
         * we will use the nextLine() method, which is used to read Strings:
         */
        /*
         * Input Types
         * In the example above, we used the nextLine() method, which is used to read
         * Strings. To read other types, look at the comment below:
         * 
         * nextBoolean() Reads a boolean value from the user
         * nextByte() Reads a byte value from the user
         * nextDouble() Reads a double value from the user
         * nextFloat() Reads a float value from the user
         * nextInt() Reads a int value from the user
         * nextLine() Reads a String value from the user
         * nextLong() Reads a long value from the user
         * nextShort() Reads a short value from the user
         */
        Scanner scan = new Scanner(System.in);

        String fname, lname, adrs;

        /* Input the Product name here!. */
        System.out.print("First Name : ");
        fname = scan.nextLine();
        System.out.print("Last Name : ");
        lname = scan.nextLine();
        System.out.print("Address : ");
        adrs = scan.nextLine();

        System.out.println("\n\n==========================================================================\n\n");

        System.out.println("Your Receipt Mr/Mrs. : " + fname + " " + lname + "\nAddress : " + adrs);

        /*
         * My String, int, and double variable are here mostly for obtaining Data from
         * the user input.
         */
        String pname1, pname2, pname3, pname4, p = " Pesos";
        int pduct1, pduct2, pduct3, pduct4;
        double num1, num2, num3, num4;

        /* 4 Product name here! */
        pname1 = "Milk";
        pname2 = "Biscuit";
        pname3 = "Bread";
        pname4 = "Chocolate";

        System.out.println("\n\n==========================================================================\n\n");

        /* Input How manay Product Quantity and What is the Product Price */
        System.out.print("1. Product QTY of " + pname1 + " : ");
        pduct1 = scan.nextInt();
        System.out.print("1. Product Price : ");
        num1 = scan.nextDouble();

        System.out.println("\n-----------------------------------------------------\n");

        System.out.print("2. Product QTY of " + pname2 + " : ");
        pduct2 = scan.nextInt();
        System.out.print("2. Product Price : ");
        num2 = scan.nextDouble();

        System.out.println("\n-----------------------------------------------------\n");

        System.out.print("3. Product QTY of " + pname3 + " : ");
        pduct3 = scan.nextInt();
        System.out.print("3. Product Price : ");
        num3 = scan.nextDouble();

        System.out.println("\n-----------------------------------------------------\n");

        System.out.print("4. Product QTY of " + pname4 + " : ");
        pduct4 = scan.nextInt();
        System.out.print("4. Product Price : ");
        num4 = scan.nextDouble();

        /* Casting my variable from double and int to float */
        float pduct1i = (float) pduct1, pduct2i = (float) pduct1, pduct3i = (float) pduct1, pduct4i = (float) pduct1;
        float num1i = (float) num1, num2i = (float) num2, num3i = (float) num3, num4i = (float) num4;
        float res1, res2, res3, res4, result;

        /* Price Multiply by Quantity */
        res1 = pduct1i * num1i;
        res2 = pduct2i * num2i;
        res3 = pduct3i * num3i;
        res4 = pduct4i * num4i;

        /* Sum the res1,res2,res3,res4 and it will show in variable name result */
        result = res1 + res2 + res3 + res4;
        System.out.println("\n\n==========================================================================\n\n");

        /*
         * Print out the result on what product did the customer and what is the price
         * and quantity then the total amount of each product
         */
        System.out.println("Product Name \t\t |Price \t\t\t\t\t |Quantity \t\t\t\t |Sub Total\n");
        System.out.println(pname1 + "\t\t\t\t |" + num1 + p + "\t\t\t\t |" + pduct1 + " QTY" + "\t\t\t\t |" + res1 + p);
        System.out.println(pname2 + "\t\t\t\t |" + num2 + p + "\t\t\t\t |" + pduct2 + " QTY" + "\t\t\t\t |" + res2 + p);
        System.out.println(pname3 + "\t\t\t\t |" + num3 + p + "\t\t\t\t |" + pduct3 + " QTY" + "\t\t\t\t |" + res3 + p);
        System.out.println(pname4 + "\t\t\t |" + num4 + p + "\t\t\t\t |" + pduct4 + " QTY" + "\t\t\t\t |" + res4 + p);

        System.out.println("\n\n==========================================================================\n\n");

        /*
         * This where we input VAT% and calculate on how much the customer purchase then
         * multyply by VAT%
         */
        double vats, vatr, vattotal, cash, change;
        System.out.print("What is the VAT % here in " + adrs + " : ");
        vats = scan.nextDouble();
        vatr = result * vats;
        vattotal = vatr + result;

        /* Casting my variable from double to float */
        float vatrf = (float) vatr, vattotalf = (float) vattotal;

        System.out.println("\n\n==========================================================================\n\n");

        /*
         * This is were all the Total Ammount without VAT, VAT and the will be show and
         * Total price of all he purchase plus VAT
         */
        System.out.println("Your EX VAT " + vats + " :\t\t\t\t\t" + result + p + "\n");

        System.out.println("Your Sales VAT " + vats + "% :\t\t\t\t" + vatrf + p + "\n");

        System.out.println("Your Total Amount + VAT " + vats + " :\t\t" + vattotalf + p + "\n");

        System.out.print("Input your Cash Amount! : \t\t\t");
        cash = scan.nextDouble();

        /* Calculating the Cash and Change. */

        change = cash - vattotal;

        System.out.println("\nYour Change is :\t\t\t\t\t" + change + p + "\n");

        System.out.println("\n==========================================================================\n\n");

        System.out.println("Thank You & Come Again!! Mr/Mrs. " + lname + " from " + adrs);

        System.out.println("\n\n==========================================================================\n\n");
    }
}
