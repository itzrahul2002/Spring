package Com.JavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "Com.JavaConfig.JavaConfig")
public class JavaConfig {
	
	@Bean
	public Student getStudent() {
		Student std = new Student();
		
		return std;
	}
	
	public Address getAddress() {
		return new Address();
	}
}
