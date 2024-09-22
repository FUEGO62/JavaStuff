public class Testing {

    public static void main(String[] args){

	char[] array = {'a','b','c'};
	int i = 45;

	System.out.print(putInList(i));
	



    }

	public static char[] putInList(int number){

		String name =  String.valueOf(number);
		char[] list = new char [name.length()];
		for(int count = 0; count<list.length;count++){
		
			list[count] = name.charAt(count);
		
		}

		return list;

	}
	
}