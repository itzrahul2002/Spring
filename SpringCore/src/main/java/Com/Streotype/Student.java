package Com.Streotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Student {

	@Value("Rahul")
	private String stdName;
	@Value("Java Developer")
	private String stdCourse;
	@Value("rahulthakur95609@gmail.com")
	private String stdEmail;
	@Value("#{temp}")
	private List<String> stdAddress;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(String stdName, String stdCourse, String stdEmail, List<String> stdAddress) {
		super();
		this.stdName = stdName;
		this.stdCourse = stdCourse;
		this.stdEmail = stdEmail;
		this.stdAddress = stdAddress;
	}


	public String getStdName() {
		return stdName;
	}


	public void setStdName(String stdName) {
		this.stdName = stdName;
	}


	public String getStdCourse() {
		return stdCourse;
	}


	public void setStdCourse(String stdCourse) {
		this.stdCourse = stdCourse;
	}


	public String getStdEmail() {
		return stdEmail;
	}


	public void setStdEmail(String stdEmail) {
		this.stdEmail = stdEmail;
	}


	public List<String> getStdAddress() {
		return stdAddress;
	}


	public void setStdAddress(List<String> stdAddress) {
		this.stdAddress = stdAddress;
	}


	@Override
	public String toString() {
		return "Student [stdName=" + stdName + ", stdCourse=" + stdCourse + ", stdEmail=" + stdEmail + ", stdAddress="
				+ stdAddress + "]";
	}


	
	
}
