import java.util.Scanner;
public class DiaryTest{

    public static void main(String[] args){

	displayMenu();
    }

    public static void displayMenu(){

	Scanner input = new Scanner(System.in);
	Diary diary = new Diary();
	Shelf shelf = new Shelf();

	String move = "";
	
	System.out.print("1-> Sign Up\n2->Log In\n3->Write\n4->Read\n5->Delete\n6->show all your titles\n99->end\n");
	
	while(!move.equals("99")){

		move = input.nextLine();
	
		switch(move){

			case "1":{ 
					
				System.out.println("Enter username");
			
				String username = input.nextLine();
	
				System.out.println("set your password");

				String password = input.nextLine();

				shelf.signUp(username, password);System.out.println("Enjoy your diary "+username);break;
			}
	
			case "2":{ 
		
				boolean loggedIn = true;				

				System.out.println("Enter username");
		
				String username = input.nextLine();

				System.out.println("enter password");
		
				String password = input.nextLine();

				try{ diary = shelf.logIn(username,password);}

				catch(Exception e){System.out.println("Invalid details");loggedIn = false;}

				if(loggedIn){System.out.println("Logged in successfully");}break;}

			case "3":{

				if(diary.getPassword().equals(""))System.out.println("no diary yet :(");	
				else{

				System.out.println("Enter todays title!");
		
				String title = input.nextLine();

				System.out.println("You may start your entry");

				String body = input.nextLine();
	
				diary.write(title,body);System.out.println("Done!!");}break;}

			case "4":{

				if(diary.getPassword().equals(""))System.out.println("no diary yet :(");	

				else{

				System.out.println("Which title are you looking for");
		
				String title = input.nextLine();
		
				diary.read(title);}break;}

			case "5":{

				if(diary.getPassword().equals(""))System.out.println("no diary yet :(");	
				else{

				System.out.println("Which title are you looking for");
		
				String title = input.nextLine();

				diary.delete(title);}break;}

			case "6":{

				if(diary.getPassword().equals(""))System.out.println("no diary yet :(");	
				else{

				diary.showAllTitles();System.out.println();}break;} 

			default: {if(!move.equals("99"))System.out.println("Invalid");break;}

		}
	}

    }

}