package Com.StandAlone;

import java.util.List;
import java.util.Map;
import java.util.Vector;

public class Person {
	private List<String> friends;
	private Map<String, Integer> fee;
	private Vector<String> center;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(List<String> friends, Map<String, Integer> fee, Vector<String> center) {
		super();
		this.friends = friends;
		this.fee = fee;
		this.center = center;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Map<String, Integer> getFee() {
		return fee;
	}

	public void setFee(Map<String, Integer> fee) {
		this.fee = fee;
	}

	public Vector<String> getCenter() {
		return center;
	}

	public void setCenter(Vector<String> center) {
		this.center = center;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", fee=" + fee + ", center=" + center + "]";
	}

	
	
	
}
