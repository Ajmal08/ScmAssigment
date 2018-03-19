import java.util.Comparator;

public class Car {
	// Declaring variable for Car records.
	int regid;
	String make;
	String model;
	String colour;
	String type;
	int engineCapacity;
	int year;
	int price;
	
	
	//ToString method to test and print out the car details
	@Override
	public String toString() {
		return "Car [regid=" + regid + ", make=" + make + ", model=" + model + ", colour=" + colour + ", type=" + type
				+ ", engineCapacity=" + engineCapacity + ", year=" + year + ", price=" + price + "]";
	}
	public Car(int regid, String make, String model, String colour, String type, int engineCapacity, int year,
			int price) {
		super();
		this.regid = regid;
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.type = type;
		this.engineCapacity = engineCapacity;
		this.year = year;
		this.price = price;
	}
	public int getRegid() {
		return regid;
	}
	public void setRegid(int regid) {
		this.regid = regid;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// Comparator for sorting the list by Brand
	public static Comparator<Car> BrandComparator = new Comparator<Car>() {

		public int compare(Car c1, Car c2) {
		   String CarBrand1 = c1.getMake().toUpperCase();
		   String CarBrand2 = c2.getMake().toUpperCase();

		   //ascending order
		   return CarBrand1.compareTo(CarBrand2);

		   //descending order
		   //return CarBrand2.compareTo(CarBrand1);
	    }};
	    
	    
		// Comparator for sorting the list by Price
		public static Comparator<Car> PriceComparator = new Comparator<Car>() {

			public int compare(Car c1, Car c2) {
			   int CarPrice1 = c1.getPrice();
			   int CarPrice2 = c2.getPrice();

			   //ascending order
			   return CarPrice1-CarPrice2;

			    //descending order
			   //return CarPrice2-CarPrice1;
		    }};
		    
		 // Comparator for sorting the list by year
			public static Comparator<Car> YearComparator = new Comparator<Car>() {

				public int compare(Car c1, Car c2) {
				   int CarYear1 = c1.getYear();
				   int CarYear2 = c2.getYear();

				   //ascending order
				   return CarYear1-CarYear2;

				   //descending order
				   //return CarYear1-CarYear2;
			    }};  
			    
			    
			 // Comparator for sorting the list by year
				public static Comparator<Car> EngineComparator = new Comparator<Car>() {

					public int compare(Car c1, Car c2) {
					   int CarEngine1 = c1.getEngineCapacity();
					   int CarEngine2 = c2.getEngineCapacity();

					   //ascending order
					   return CarEngine1-CarEngine2;

					   //descending order
					   //return CarEngine2-CarEngine1;
				    }};  
				    

}
