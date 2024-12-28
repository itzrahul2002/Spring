package Com.JavaConfig;

import org.springframework.stereotype.Component;

@Component("FirstStd")
public class Student {
	
	private Address address;
	
	
	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void study() {
		System.out.println("Stdents Are Studying");
	}
}
