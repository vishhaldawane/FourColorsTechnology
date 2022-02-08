package com.bags;

public class GirlTest {
	public static void main(String[] args) {
		
		Girl g1 = new Girl("Janet","Brown",5.4f,22);
		Girl g2 = new Girl("Amita","Wheatish",5.4f,22);
		
		Girl g3 = new Girl("Thando","DarkBrown",6.4f,22);
	
		g1.selfComprarison();
		
		if(g1.heightComprarison(g2) > 0 ) {
			System.out.println(g1.name+" is taller than "+g2.name);
		}
		else if(g1.heightComprarison(g2) < 0 ) {
			System.out.println(g1.name+" is shorter than "+g2.name);
		}
		else 
			System.out.println("Both "+g1.name+" and "+g2.name+" are of same height...");

		
		
	}
}

class Girl 
{
	String name;
	String color;
	float height;
	int age;
	
	public Girl(String name, String color, float height, int age) {
		super();
		this.name = name;
		this.color = color;
		this.height = height;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Girl [name=" + name + ", color=" + color + ", height=" + height + ", age=" + age + "]";
	}
	
	
	void selfComprarison() {
		System.out.println(name+" Comparing..with herself....");
	}
	
	int heightComprarison(Girl x) {
		System.out.println(name+" Comparing. height .with ...."+x.name);
		if(height > x.height) // 5.4  < 6.3
			return 1;
		else if(height < x.height) // 5.4  < 6.3
			return -1;
		else
			return 0;
		
			
	}
	
}