package Spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeUser2 {
	
	private int empId;
	private String empName;
	private String empPost;
	
	public LifeUser2(int empId, String empName, String empPost) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empPost = empPost;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpPost() {
		return empPost;
	}
	public void setEmpPost(String empPost) {
		this.empPost = empPost;
	}
	
	@Override
	public String toString() {
		return "LifeUser2 [empId=" + empId + ", empName=" + empName + ", empPost=" + empPost + "]";
	}
	
	@PostConstruct
	public void first() {
		System.out.println("Intit by Annotation");
	}
	
	@PreDestroy
	public void last() {
		System.out.println("Destroy by Annotation");
	}
	
}
