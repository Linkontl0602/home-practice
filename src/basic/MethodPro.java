package basic;

public class MethodPro {

	public static void main(String[] args) {
	MethodPro obj = new MethodPro();
	MethodPro.cardetail("MazdaRX8", 2500, 2009);
	obj.InfoNeded(1100, 2021, true, 400);	
	MethodPro.Showroom("Titanium", 40, "Toyota", 80000, 60000);	
		
	}
    public static void cardetail(String carname,int carprice,int carmodel ) {
	System.out.println("My car name is"+" "+carname);
	System.out.println("****************************");
	System.out.println("My car price is"+" "+carprice);
	System.out.println("******************************");
	System.out.println("The car model"+" "+carmodel);
	}
	public void InfoNeded(int carnumber,int paperexpires,boolean papersuptodate,int paperscost) {
		
	int totalpapercost=paperscost*4;
	System.out.println("Car number-"+carnumber);	
	System.out.println("Papers expires on"+" "+paperexpires);	
	System.out.println("Papers is up to date?"+" "+papersuptodate);	
	System.out.println("paper work costings"+"No 1-"+paperscost+"No 2-"+totalpapercost);
	}
	public static double Showroom(String showroomname,int totalcars,String carbrand,double totalcarvalues,double landvalue ) {
		double showroomvalue=totalcarvalues+landvalue;
		System.out.println("Name of the Showroom-"+showroomname);
		System.out.println("Total quantity of cars here"+" "+totalcars);
		System.out.println("The brand we sell here is"+" "+carbrand);
		System.out.println("Total car values we have is"+" "+totalcarvalues);
		System.out.println("The land costing was around"+" "+landvalue);
		System.out.println("Our showroom price we asking"+" "+showroomvalue);
		System.out.println("THANK YOU for visitung"+" "+showroomname);
		return showroomvalue;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
