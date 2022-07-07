package project4;

import project4.Constructor;

public class Constructor {
	int Id;
	String name;
	
	public String getName() {
		return  name;
	}
	public void setName(String n) {
		name=n;
		
		}
	public void  setId(int i) {
		Id=i;
	}
 public int getId() {
	 return Id;
 }
	public static void main(String[] args) {
	Constructor myname = new Constructor();
	 myname.setName("ANANT");
	 myname.setId(15);
		System.out.println(myname.getName());
		System.out.println(myname.getId());
		
	}

}
