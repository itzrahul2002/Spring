package Com.LifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.sound.midi.Soundbank;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class User{
	private int id;
	private String name;
	private String course;
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(int id, String name, String course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
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

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
	
	
//	public void init() {
//		System.out.println("Hello Init Method ");
//	}
//	
//	public void destroy() {
//		System.out.println("Hello Destroy Method ");
//	}

//	@Override
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("Hello Destroy Method By Using Interface DisposableBean");
//	}
//
//	@Override
//	public void destroy() throws Exception {
//		System.out.println("Hello Init Method By Using Interface InitializingBean");
//		
//	}
	
	@PostConstruct
	public void hello() {
		System.out.println("Hello Init Method By Using Annotation");
	}
	
	@PreDestroy
	public void bye() {
		System.out.println("Bye Destroy Method By Using Annotation");
	}
}
