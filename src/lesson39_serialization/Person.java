package lesson39_serialization;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 3022705707575126704L;
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id +", name=" + name + "]";
	}

}
