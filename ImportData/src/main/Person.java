package main;

public class Person {
	private String nu;
	private String name;
	private int math;
	private int chinese;
	private int english;
	public String getNu() {
	 return nu;
	}
	public void setNu(String nu) {
	 this.nu = nu;
	}
	public String getName() {
	 return name;
	}
	public void setName(String name) {
	 this.name = name;
	}
	public int getMath() {
	 return math;
	}
	public void setMath(int math) {
	 this.math = math;
	}
	public int getChinese() {
	 return chinese;
	}
	public void setChinese(int chinese) {
	 this.chinese = chinese;
	}
	public int getEnglish() {
	 return english;
	}
	public void setEnglish(int english) {
	 this.english = english;
	}
	@Override
	public String toString() {
	 return "nu=" + nu + ", name=" + name + ", math=" + math + ", chinese=" + chinese + ", english=" + english;
	}
	public Person() {
		
	}
public Person(String nu,String name,int math,int chinese,int english) {
	this.nu=nu	;
	this.name=name	;
	this.chinese=chinese	;
	this.math=math	;
	this.english=english	;
	}
}
