package Com.Constructor;

public class Person {
	private int id;
	private String name;
	private Certificate certificate;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int id, String name, Certificate certificate) {
		super();
		this.id = id;
		this.name = name;
		this.certificate = certificate;
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

	public Certificate getCertificate() {
		return certificate;
	}

	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", certificate=" + certificate + "]";
	}
	
	
	
	
}
