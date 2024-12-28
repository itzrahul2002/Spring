package Spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
    private List<Integer> id;
    private String uname; // Changed from Set<String> name
    private List<String> salary;
    private Map<String, Integer> designation; // Corrected typo

    public Employee(){
        super();
    }

    public Employee(List<Integer> id, String uname, List<String> salary, Map<String, Integer> designation) {
        this.id = id;
        this.uname = uname;
        this.salary = salary;
        this.designation = designation;
    }

    // Getters and setters omitted for brevity

    public List<Integer> getId() {
		return id;
	}

	public void setId(List<Integer> id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public List<String> getSalary() {
		return salary;
	}

	public void setSalary(List<String> salary) {
		this.salary = salary;
	}

	public Map<String, Integer> getDesignation() {
		return designation;
	}

	public void setDesignation(Map<String, Integer> designation) {
		this.designation = designation;
	}

	@Override
    public String toString() {
        return "Employee [id=" + id + ", uname=" + uname + ", salary=" + salary + ", designation=" + designation + "]";
    }
}
