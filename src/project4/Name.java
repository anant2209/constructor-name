package project4;

import project4.Name;

class Name {
	public static void main(String args[]) {
		Name a = new Name("Anant", 55);
		System.out.println(a.name + "" + a.Id);
	}

	int Id;
	String name;

	public Name(String name, int Id) {
		this.name = name;
		this.Id = Id;

	}
}
