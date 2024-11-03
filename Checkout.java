import java.util.ArrayList;
import java.util.Scanner;

public class Checkout {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Item item = new Item();
        ArrayList<Item> cart = new ArrayList<Item>();
        String continuePurchase = "yes";
        double payment = 0.0;

        System.out.println("Enter Customer name ");
        String name = input.nextLine();

	try{

        while (!continuePurchase.contains("no")) {

            System.out.println("What did the customer buy ");
            String itemBought = input.nextLine();

	    while(itemBought.equals("")){

		System.out.println("Please enter the name of the product the customer bought");
		itemBought = input.nextLine();

	    }

            System.out.println("How many pieces?");
            int quantity = input.nextInt();

	    while(quantity<=0){

		System.out.println("Invalid value for quantity, please re-enter");
		quantity = input.nextInt();

	    }

            System.out.println("How much was one unit");
            double prices = input.nextDouble();

	    while(prices<=0){

		System.out.println("Invalid value for price, please re-enter");
		prices = input.nextInt();

	    }


            item = addToCart(itemBought, quantity, prices);
            cart.add(item);

            System.out.println("Add more items? yes/no");
            continuePurchase = input.nextLine().toLowerCase();
            continuePurchase = input.nextLine().toLowerCase();

            while(!continuePurchase.contains("yes") && !continuePurchase.contains("no")) {

                System.out.println("Invalid input");

                System.out.println("Add more items? yes/no");
                continuePurchase = input.nextLine().toLowerCase();
            }

        }

        System.out.println("what is your name?");
        String cashierName = input.nextLine();

        System.out.println("How much discount does he have?");
        double discount = input.nextInt();

	 while(discount<0){

		System.out.println("Invalid value for discount, please re-enter");
		discount = input.nextDouble();

	    }


        double billTotal = printReceipt(cart, name, cashierName, discount);
        printChar('=');
        System.out.printf("THIS IS NOT A RECEIPT KINDLY PAY %.2f",billTotal);
        printChar('=');

        System.out.printf("how much did the customer give to you: ");
        while (payment<billTotal) {
            payment = input.nextDouble();
            if (payment <= billTotal) {
                System.out.printf("insufficient funds, request correct amount: ");
            }
        }
        billTotal = printReceipt(cart, name, cashierName, discount);
        System.out.printf("%n%18s%11.2f%n","Amount Paid:",payment);
        System.out.printf("%18s%11.2f","Balance:",payment - billTotal);
        printChar('=');
        System.out.printf("%38s","THANK YOU FOR YOUR PATRONAGE");
        printChar('=');

    }
    catch(Exception e){System.out.println("integer input required, please restart program");}

    }

    public static double printReceipt(ArrayList<Item> cart,String name , String cashierName , double discount) {

        double subTotal = 0;
        System.out.println("SEMICOLON STORES\nMAIN BRANCH\n");
        System.out.println("LOCATION: 312, HERBERT MACAULY WAY, SABO YABA, LAGOS.\n");
        System.out.println("TEL: 03293828343\nDate: 18-Dec-22 8:48:11 pm\n");
        System.out.println("Cashier: " + cashierName);
        System.out.println("Customer Name: " + name);
        printChar('=');
        System.out.printf("%12s%8s%8s%13s","ITEM","QTY","PRICE","TOTAL(NGN)");
        printChar('-');


        for(int count = 0; count < cart.size(); count++) {

            double total = cart.get(count).getPrice()*cart.get(count).getQuantity();
            System.out.printf("%10s%8s%11.2f%9.2f",cart.get(count).getName(),cart.get(count).getQuantity(),cart.get(count).getPrice(),total);
            System.out.println();
            subTotal += total;
        }

        printChar('-');
        System.out.printf("%18s%11.2f%n%18s%11.2f%n","Sub Total:",subTotal,"Discount:",(discount/100)*subTotal);
        System.out.printf("%18s%11.2f","VAT @ 17.50%:",(17.50/100)*subTotal);
        printChar('=');
        double billTotal = subTotal-((discount/100)*subTotal)+((17.50/100)*subTotal);
        System.out.printf("%18s%11.2f","Bill Total:",billTotal);

        return billTotal;
    }

    public static Item addToCart(String name, int quantity, double price) {

        Item item = new Item();
        item.setName(name);
        item.setPrice(price);
        item.setQuantity(quantity);

        return item;
    }

    public static void printChar(char a) {

        System.out.println();

        for(int i = 0; i<50; i++){
            System.out.print(a);
        }

        System.out.println();
    }
}