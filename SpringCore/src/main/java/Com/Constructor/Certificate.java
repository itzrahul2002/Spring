package Com.Constructor;

public class Certificate {	
	String name;
	String cno;
	
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Certificate(String name, String cno) {
		super();
		this.name = name;
		this.cno = cno;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	
	@Override
	public String toString() {
		return "Certificate [name=" + name + ", cno=" + cno + "]";
	}
	
	
	
	
}
