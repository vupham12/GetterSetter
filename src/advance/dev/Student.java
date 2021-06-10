package advance.dev;

public class Student extends MainApp {
	private String name;
	private byte age;
	private String address;
	private String phone;
	private double đtb;
	
	public Student() { 	
 
}
    public Student(String name, byte age, String address, String SĐT, double đtb) {
	super();
	this.name = name;
	this.age = age;
	this.address = address;
	this.phone = phone;
	this.đtb = đtb;
	
}
    public String getName() {
    	return name;
    }
    public void setName() {
    	this.name = name;
    }
    public byte getAge() {
    	return age;
    }
    public void setAge(byte age) {
    	this.age = age;
    }
    public String getAddress() {
    	return address;
    }
    public void setAddress() {
    	this.address = address;
    }
    public String getPhone() {
    	return phone;
    }
    public void setPhone() {
    	this.phone = phone;
    }
    public double getĐtb() {
    	return đtb;
    }
    public void setĐtb() {
    	this.đtb = đtb;
    }

}