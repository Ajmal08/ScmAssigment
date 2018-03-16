
public class Car {
	int regid;
	String make;
	String model;
	String colour;
	String type;
	int engineCapacity;
	int year;
	int price;
	
	//Hello World
	
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
	

}
