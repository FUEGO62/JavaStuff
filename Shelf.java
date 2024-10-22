import java.util.ArrayList;
public class Shelf{

	private ArrayList<Diary> diaries = new ArrayList<Diary>();

	public void signUp(String username, String password){

		Diary diary = new Diary();

		diary.setUsername(username);
		diary.setPassword(password);
		
		diaries.add(diary);
	}

	public Diary logIn(String username,String password){

		boolean found = false;
		String details = username+password;
		int count = 0;

		for(count = 0; count < diaries.size();count++){	
			if((diaries.get(count).getUsername()+diaries.get(count).getPassword()).equals(details)){found=true;break;}
		}
	
		if(found==false) throw new ArithmeticException();   
		return diaries.get(count); 
	}

}