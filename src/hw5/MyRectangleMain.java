package hw5;

class MyRectangle{
	
	private double width , depth;
	
	//建構子
    public MyRectangle() {
    }

    public MyRectangle(double width, double depth) {
        this.width = width;
        this.depth = depth;
    }
    
	
	void setWidth(double width) {
		this.width = width;
	}
	
	void setDepth(double depth) {
		this.depth = depth;
	}
	
	double getArea() {
		System.out.println(width * depth);
		return width * depth;
	}
	
	
}

public class MyRectangleMain {
	
    public static void main(String[] args) {
    	
        MyRectangle m1 = new MyRectangle();  
        m1.setWidth(10);
        m1.setDepth(20);
        m1.getArea();
        
        MyRectangle m2 = new MyRectangle(10,20);
        m2.getArea();
    }
    
}

