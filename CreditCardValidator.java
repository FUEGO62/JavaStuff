import java.util.Scanner;

public class CreditCardValidator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hello, Kindly Enter credit card details to verify");
        String cardNumber = input.nextLine();

	if(cardNumber.length()<13||cardNumber.length()>16)cardNumber="a";

	while(!cardNumber.matches("[0-9]+")){

	    System.out.println("invalid input for credit card structure(i.e  4388576018410707)");

	    cardNumber = input.nextLine();
	    if(cardNumber.length()<13||cardNumber.length()>16)cardNumber="a";

	}

        char[] cardFirstNumbers = {'4','5','6'};
        String [] cardTypes = {"Visa Card","MasterCard","Discover card"};
        String cardType = "Not recognized";
        boolean isValid = false;

        if(cardNumber.charAt(0)=='3'& cardNumber.charAt(1)=='7'){
            cardType = "American Express Card";
        }
        for(int i = 0; i < cardFirstNumbers.length; i++){
            if(cardNumber.charAt(i)==cardFirstNumbers[i]){
                cardType = cardTypes[i];
            }
        }

        int evenSum = 0;
        int oddSum = 0;
        for(int i = 0; i < cardNumber.length(); i++){
            int number = Integer.parseInt(cardNumber.charAt(i)+"");

            if(i%2==0){
                number *= 2;
                if(number>9){number = number%10 + number/10;}
                evenSum += number;
            }
            else{
                oddSum += number;
            }
        }

        if(evenSum+oddSum%10==0){isValid = true;}

        printStars();

        System.out.println("**Credit Card Type: "+cardType);
        System.out.printf("**Credit Card Number: %s\n",cardNumber);
        System.out.printf("**Credit Card Length: %d\n",cardNumber.length());
        System.out.printf("**Credit Card Validity Status: %s",isValid ? "Valid" : "Invalid");

	printStars();

    }

    public static void printStars(){
        System.out.println();

        for(int i = 0; i<30; i++){
            System.out.print("*");
        }

        System.out.println();
    }
}
