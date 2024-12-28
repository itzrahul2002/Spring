package Com.SPEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{90+20}")
	private int value;
	@Value("#{10*2+5-1*10}")
	private int ans;
	@Value("#{5>8}")
	private boolean isActive;
	
	@Value("#{ T (java.lang.Math).sqrt(25)}")
	private double sqr;
	
	@Value("#{T (java.lang.Math).PI}")
	private double PI;
	@Value("#{new java.lang.String('Java')}")
	private String name;
	
	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Demo(int value, int ans, boolean isActive, double sqr, double pI, String name) {
		super();
		this.value = value;
		this.ans = ans;
		this.isActive = isActive;
		this.sqr = sqr;
		PI = pI;
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getAns() {
		return ans;
	}

	public void setAns(int ans) {
		this.ans = ans;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public double getSqr() {
		return sqr;
	}

	public void setSqr(double sqr) {
		this.sqr = sqr;
	}

	public double getPI() {
		return PI;
	}

	public void setPI(double pI) {
		PI = pI;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Demo [value=" + value + ", ans=" + ans + ", isActive=" + isActive + ", sqr=" + sqr + ", PI=" + PI
				+ ", name=" + name + "]";
	}

	
}
