package com.fourcolours;

public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2D p2d = new Point2D(10,20);
		p2d.showPoint2D();
		
		System.out.println("--------");
		
		Point3D p3d = new Point3D(50,60,70);
		p3d.showPoint3D();
		
		System.out.println("--------");
		
		ColouredPoint3D cp3d = new ColouredPoint3D(150,160,170,"Green");
		cp3d.showColouredPoint3D();
	}

}


class Point2D
{
	private int x;
	private int y;
	
	Point2D(int x, int y) {
		if(x<0) {
			RuntimeException runTimeEx = new RuntimeException("Point x value should NOT be in negative...");
			throw runTimeEx;
		}
		else
			this.x=x;  // this is the pointer to the current object

		if(y<0) {
			RuntimeException runTimeEx = new RuntimeException("Point y value should NOT be in negative...");
			throw runTimeEx;
		}
		else
			this.y=y;
	}
	void showPoint2D() {
		System.out.println("(x "+x+")");
		System.out.println("(y "+y+")");
	}
}


class Point3D extends Point2D
{	
	//automatically it is inheriting all the data members of the super class here
	//int x;
	//int y;
	
	private int z;	
	
	Point3D(int x, int y,   int z) {
		
		super(x,y); // a call to the "super class's constructor" from a constructor
						// this line must be the first line, else an error
		if(z<0) {
			RuntimeException runTimeEx = new RuntimeException("Point z value should NOT be in negative...");
			throw runTimeEx;
		}
		else
			this.z = z;
	}
	void showPoint3D() {
		super.showPoint2D(); // utilize the parent class's function
		System.out.println("[z "+z+"]");
	}
}

class ColouredPoint3D extends Point3D
{	
	//automatically it is inheriting all the data members of the super class here
	//int x;
	//int y;
	//int z;
	
	private String  color;	
	
	ColouredPoint3D(int x, int y, int z,String col) {
		
		super(x,y,z); // a call to the "super class's constructor" from a constructor
						// this line must be the first line, else an error
		color=col;
	}
	void showColouredPoint3D() {
		super.showPoint3D(); // utilize the parent class's function
		System.out.println("[color "+color+"]");
	}
}
/*
class Point3D 
{
	private int x;
	private int y;
	
	private int z;
	
	
	Point3D(int x, int y,   int z) {
		this.x=x;  // this is the pointer to the current object
		this.y=y;
		
		this.z = z;
	}
	void showPoint3D() {
		System.out.println("x "+x);
		System.out.println("y "+y);

		System.out.println("z "+z);
	}
}



	Point2D p2d = new Point2D(10,20);
	
	
	
	stack						heap
	
								x        y
								-----------------
								|		|		|
								------------------
		 +--------------------->100
		 |
	+----|--+
	|	100	|
	+-------+
	p2d

						Point2D(x,y) { }
						showPoint2D() { sop(x,y) }


	Point3D p3d = new Point3D(50,60,70);
	
	
	
	stack						heap
	
								x        y		z
								-------------------------
								|		|		|		|
								-------------------------
		 +--------------------->200
		 |
	+----|--+
	|	200	|
	+-------+
	p3d

						Point3D(x,y,  z) { }
						showPoint3D() { sop(x,y,  z) }

*/
