package Spring;

public class UserAddress {
	private String state;
	private String city;
	private String pincode;
	
	public UserAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserAddress(String state, String city, String pincode) {
		super();
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "UserAddress [state=" + state + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	 

}
