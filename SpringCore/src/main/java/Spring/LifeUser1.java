package Spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeUser1 implements DisposableBean,InitializingBean{
	
	private int Id;
	private String Name;
	private String Post;
	
	public LifeUser1(int id, String name, String post) {
		super();
		Id = id;
		Name = name;
		Post = post;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPost() {
		return Post;
	}

	public void setPost(String post) {
		Post = post;
	}

	@Override
	public String toString() {
		return "LifeUser1 [Id=" + Id + ", Name=" + Name + ", Post=" + Post + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("I am Init Method from Interface InitializingBean");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("I am Destroy from Interface DisposableBean");
	}
	
	

	
}
