package Com.Collection;

public class Address {
	private String country;
	private String city;
	private int pincode;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Address(String country, String city, int pincode) {
		super();
		this.country = country;
		this.city = city;
		this.pincode = pincode;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "Address [country=" + country + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	
}	
