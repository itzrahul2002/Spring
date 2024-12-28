package Spring;

public class User {
	private int id;
	private String name;
	private String course;
	private UserAddress address;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, String course, UserAddress address) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public UserAddress getAddress() {
		return address;
	}
	public void setAddress(UserAddress address) {
	    this.address = address;
	}
	
	@Override
	public String toString() {
	    return "User[id=" + id + ", name=" + name + ", course=" + course + ", address=" + address + "]";
	}

	
	
}
