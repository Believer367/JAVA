package is_a;

public abstract class Shape {
	
	 abstract void area(); 
	 
	 abstract void dimensions();
	 
	 void hasSides() {
		 System.out.println("Shape has sides");
	 }
}

abstract class TwoDimensional extends Shape {
	
	void dimensions() {
		System.out.println("Shape is two dimensional");
	}
}


final class Circle extends TwoDimensional{
	
	@Override
	void hasSides() {
		System.out.println("Circle does not have any side");
	}
	
	void area() {
		System.out.println("Area of circle is given by: pi x radius x radius");
	}
	
	void circumference() {
		System.out.println("Circle has circumference");
	}
}

final class Rectangle extends TwoDimensional{
	
	final int sides = 4;
	final int vertices=4;
	
	void area() {
		System.out.println("Area of rectangle is given by: length x breadth");
	}
	
	void sides() {
		System.out.println("Rectange has equal opposite sides but unequal adjacent sides");
	}
}
abstract class ThreeDimensional extends Shape {
	
	 abstract void volume();
	
	void dimensions() {
		System.out.println("Shape has 3 dimensions");
	}
}

final class Cube extends ThreeDimensional{
	
	void area(){
		System.out.println("Cube has area");
	}
	
	void faces() {
		System.out.println("Cube has 6 faces");
	}
	
	void volume() {
		System.out.println("Cube has volume");
	}
}

final class Sphere extends ThreeDimensional{
	
	void area() {
		System.out.println("Sphere has area");
	}
	
	void volume() {
		System.out.println("Sphere has volume");
	}
	
	@Override
	void hasSides() {
		System.out.println("Sphere does not have any side");
	}
}

 class TestClass {
	
	static void call(Shape shape) {                //Upcasting
		shape.dimensions();
		shape.area();
		shape.hasSides();
		
		if(shape instanceof Circle) {
			Circle circle = (Circle) shape;         //Downcasting
			circle.circumference();
		}
		else if(shape instanceof Cube) {
			Cube cube  = (Cube) shape;
			cube.faces();
			cube.volume();
		}
		else if(shape instanceof Sphere) {
			Sphere sphere = (Sphere) shape;
			sphere.volume();
		}
		
		else if(shape instanceof Rectangle) {
			Rectangle rectangle = (Rectangle) shape;
			rectangle.sides();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestClass.call(new Circle());
		System.out.println("\n######################################\n");
		TestClass.call(new Cube());
		System.out.println("\n######################################\n");
		TestClass.call(new Sphere());
		System.out.println("\n######################################\n");
		TestClass.call(new Rectangle());
		
		
		
		
	}

}
