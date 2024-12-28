package Com.Collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private String EmpName;
	private List<String> phone;
	private Set<String> email;
	private Map<String,String> course;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String empName, List<String> phone, Set<String> email, Map<String, String> course) {
		super();
		EmpName = empName;
		this.phone = phone;
		this.email = email;
		this.course = course;
	}
	
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public Set<String> getEmail() {
		return email;
	}
	public void setEmail(Set<String> email) {
		this.email = email;
	}
	public Map<String, String> getCourse() {
		return course;
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	
	@Override
	public String toString() {
		return "Employee [EmpName=" + EmpName + ", phone=" + phone + ", email=" + email + ", course=" + course + "]";
	}
	
	
}
