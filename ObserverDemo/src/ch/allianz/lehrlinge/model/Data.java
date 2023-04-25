package ch.allianz.lehrlinge.model;

public class Data {
	private String name;
	private String firstName;
	private int age;

	public Data(String name, String firstName,int age) {
		this.name = name;
		this.firstName = firstName;
		this.age = age;
	}
	
	public String toString() {
		return " Name: "+name+"\t Firstname: "+firstName +"\t Age: "+age; 
	}

}
