import java.util.ArrayList;
public class Diary{

	private String username = "";
	private String password = "";
	private ArrayList<Entries> entries = new  ArrayList<Entries>();

	public void setUsername(String username){
	
		this.username = username;
	}

	public void setPassword(String password){
	
		this.password = password;
	}

	public String getUsername(){
	
		return username;
	}

	public String getPassword(){
	
		return password;
	}

	public void write(String title, String body){

		Entries entry = new Entries();
		
		entry.setTitle(title);
		entry.setBody(body);
		
		entries.add(entry);

	}

	public void read(String title){

		boolean notFound = true;

		for(int count = 0; count < entries.size();count++){

			if(entries.get(count).getTitle().equals(title)){System.out.println("     "+entries.get(count).getTitle() + "\n\n" + entries.get(count).getBody());notFound=false;}
			
		}

		if(notFound){System.out.println(":( title not found");}
	}

	public void delete(String title){

		boolean notFound = true;

	
		for(int count = 0; count < entries.size();count++){

			if(entries.get(count).getTitle().equals(title)){entries.remove(count);notFound=false;}

		}

		if(notFound){System.out.println(":( title not found");}

	}


	public void showAllTitles(){

		for(int count = 0; count < entries.size();count++){

			System.out.printf("%5s",entries.get(count).getTitle());

		}

	}	
}