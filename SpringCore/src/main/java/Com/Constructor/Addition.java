package Com.Constructor;

public class Addition {
	private int a;
	private int b;
	public Addition() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Addition(double a, double b) {
		super();
		this.a = (int)a;
		this.b = (int)b;
		
		System.out.println("Constructor double  : double");
	}
	
	
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		
		System.out.println("Constructor Int  : Int");
	}
	
	public Addition(String a, String b) {
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		
		System.out.println("Constructor String  : String");
	}
	
	
	public void sum() {
		System.out.println("A is "+a);
		System.out.println("B is "+b);
		System.out.println("Sum is : "+(a+b));
	}
	
	
}
