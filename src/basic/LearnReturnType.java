package basic;

public class LearnReturnType {

	public static void main(String[] args) {
		LearnReturnType init=new LearnReturnType();
		init.getresult();
		
		System.out.println(init.getresult());
		System.out.println("************	 ********");
		LearnReturnType.getsum(10, 20);
		System.out.println("My total cl"+" "+LearnReturnType.getsum(12, 15));
		
	}
	
	public String getresult() {
		String name= "Tomal";
		String name1= "Linkon";
		String name2;
		System.out.println("first name"+name);
		System.out.println("last name"+name1);
		return name;
		
	}
	 
	public static int getsum(int number1,int number2) {
		 int number3 = number1 + number2;
		int number4 = number1*number2;
		 System.out.println("My Total Sum is for adition"+" "+number3);
		 System.out.println("My total Sum is for multification"+" "+number4);
		 return number3;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
