public class Circle {
	private double x, y, r;
	private static int count=0;
	
	//Constructor ===================================================
	public Circle(double x, double y, double r){
		this.x= x;
		this.y= y;
		this.r= r;
		count++;
	}
	
	//Constructor ===================================================
	public Circle(double r){
		this(0, 0, r);
	}
	
	//Constructor ===================================================
	public Circle(){
		this(0, 0, 1);
	}
	
	//Methods =======================================================
	public double getX() {
		return x;
	}

	public void setX(double x) {
		
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public static int getCount() {
		return count;
	}
	
	public double area(){
		return Math.PI * r * r;
	}
	
	public double perimetros(){
		return Math.PI * r * 2;
	}	
	
	public boolean greaterThan(Circle other){
		return this.r > other.r;
	}
	
	public boolean intersects(Circle other){
		double d;
		d=(this.x-other.x)*(this.x-other.x)+(this.y-other.y)*(this.y-other.y);
		d=Math.sqrt(d);
		if(this.r+other.r<d) return true;
		return false;
	}

	@Override
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + ", r=" + r + "]";
	}
	
	public String write() {
		return "Circle [" + x + ", " + y + ", " + r + "]";
	}
}
