package j_collection;

import java.util.Objects;

public class Member {
	private String name;
	private int age;
	public Member() { //ctrl + space + enter
		// TODO Auto-generated constructor stub
	}
	public Member(String name, int age) { //constructor using field
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() { //generate getter n setter
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() { //generate toString
		return "Member [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) { //alt + shift + s -> age, name 둘 다 체크, use 3개 다 클릭 후 generate. name만 클릭하면 이름만 같아도 같은 것으로 간주
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Member)) {
			return false;
		}
		Member other = (Member) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	

}
