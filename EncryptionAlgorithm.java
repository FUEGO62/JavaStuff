import java.util.Scanner;

public class EncryptionAlgorithm {

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter a four-digit integer");

int number = input.nextInt();

int unit = number%10;

int digit2 = number/10;

int tens = digit2%10;

int digit3 = digit2/10;

int hundreds = digit3%10;

int digit4 = digit3/10;

int thousands = digit4%10;

int newunit = (unit+7)%10;

int newtens = (tens+7)%10;

int newhundreds = (hundreds+7)%10;

int newthousands = (thousands+7)%10;

int newNumber = newhundreds + newunit*100 + newthousands*10 +newtens*1000;

System.out.printf("%04d",newNumber);

}

}