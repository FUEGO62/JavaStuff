import java.util.Scanner;

import java.security.SecureRandom;

public class RockPaperScissors{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("scissors(0), rock(1), paper(2)");

int number = input.nextInt();

if(number<3){

SecureRandom randomNumber = new SecureRandom();

int combat = randomNumber.nextInt(4);

int rllcombat=combat-1;

if(rllcombat==0){System.out.printf("I choose scissors!%n");

if(number==0){System.out.print("Its a draw!");}

if(number==1){System.out.print("YOU WIN!");}

if(number==2){System.out.print("YOU LOOSE!");}

}

if(rllcombat==1){System.out.printf("I choose rock!%n");

if(number==1){System.out.print("Its a draw!");}

if(number==2){System.out.print("YOU WIN!");}

if(number==0){System.out.print("YOU LOOSE!");}
}

if(rllcombat==2){System.out.printf("I choose paper!%n");

if(number==2){System.out.print("Its a draw!");}

if(number==0){System.out.print("YOU WIN!");}

if(number==1){System.out.print("YOU LOOSE!");}

}


}

else{System.out.print("Get sense !!!!");}













}

}