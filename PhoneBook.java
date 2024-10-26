import java.util.ArrayList;
public class PhoneBook{

	private ArrayList<Contact> contacts = new ArrayList<Contact>();

	public void addContact(String firstName,String lastName ,String phoneNumber){

		Contact contact = new Contact();

		contacts.add(contact);

		contact.setFirstName(firstName);

		contact.setLastName(lastName);

		contact.setPhoneNumber(phoneNumber);

	}

	public void removeContact(String phoneNumber){

		for(int count = 0; count < contacts.size();count++){

			if(phoneNumber.equals(contacts.get(count).getPhoneNumber()))

				contacts.remove(contacts.get(count));

		}	
	
	}
	public void edit(String phoneNumber,String newName){

		for(int count = 0; count < contacts.size();count++){

			if(phoneNumber.equals(contacts.get(count).getPhoneNumber()))

				contacts.get(count).setFirstName(newName);
		}

	}

	public ArrayList<Contact> findFirstName(String firstName){

		ArrayList<Contact> matches = new ArrayList<Contact>();

		for(int count = 0; count < contacts.size();count++){

			if(firstName.equals(contacts.get(count).getFirstName()))

				matches.add(contacts.get(count));

		}	

		return matches;

	}

	public ArrayList<Contact> findLastName(String lastName){

		ArrayList<Contact> matches = new ArrayList<Contact>();

		for(int count = 0; count < contacts.size();count++){

			if(lastName.equals(contacts.get(count).getLastName()))

				matches.add(contacts.get(count));

		}	

		return matches;

	}

	public ArrayList<Contact> findPhoneNumber(String phoneNumber){

		ArrayList<Contact> matches = new ArrayList<Contact>();

		for(int count = 0; count < contacts.size();count++){

			if(phoneNumber.equals(contacts.get(count).getPhoneNumber()))

				matches.add(contacts.get(count));

		}	

		return matches;

	}

	



}