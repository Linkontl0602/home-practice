package basic;

public class MobilePhone {
    
	String mobilephonename;
	String mobilephonecolour;
	int mobilephonespace;
	String mobilephonemodel;
	String mobilephonebrand;
	int mobilephoneprice;
	public MobilePhone () {
		
		
		
		
	}
	
	
	public MobilePhone(String mobilephonename) {
	this.mobilephonename = 	mobilephonename ;
		System.out.println("Mobile Phone name"+" "+this.mobilephonename);
		
	}
	 public MobilePhone(String mobilephonecolour,int mobilephonespace ) {
		this.mobilephonecolour = mobilephonecolour ;
		this.mobilephonespace = mobilephonespace;
		System.out.println("Mobile colour"+" "+mobilephonecolour);	
		System.out.println("Mobile space"+" "+mobilephonespace);	
		}
	
	
	public MobilePhone(String mobilephonemodel,String mobilephonebrand,int mobilephoneprice) {
		this.mobilephonemodel=mobilephonemodel;
		this.mobilephonebrand=mobilephonebrand;
		this.mobilephoneprice=mobilephoneprice;
		System.out.println("Phone model"+" "+mobilephonemodel);
		System.out.println("Brand Name"+" "+mobilephonebrand);
		System.out.println("Price for Gadget"+" "+mobilephoneprice);
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		MobilePhone MonilePhone = new MobilePhone ();
		
		MobilePhone mymobilephone= new MobilePhone("Iphone 11 pro max");
		MobilePhone mbl = new MobilePhone("Black",264);
		MobilePhone mbl2 = new MobilePhone("11pro max","Iphone",1150);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
