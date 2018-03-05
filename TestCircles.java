package spyros;

public class TestCircles {
	
	static Circle[] my;
	
	static void testCircles() {
		Circle c1;
		
		c1 = new Circle(3,4,6);
		
		Circle c2 = new Circle(30, 40, 8);
		
		System.out.format("\nCircle One Area= %7.2f", c1.area());
		System.out.format("\nCircle One Peri= %7.2f", c1.perimetros());
		
		System.out.format("\nCircle Two Area= %7.2f", c2.area());
		System.out.format("\nCircle Two Peri= %7.2f", c2.perimetros());
		
		System.out.format("\nCircle Count= %2d", Circle.getCount());
		System.out.println();

		
		if(c1.greaterThan(c2)) {
			System.out.println("c1 is bigger");	
		}else {	
			System.out.println("c2 is bigger");	
		}
		
		if(c1.intersects(c2)){
			System.out.println("Your circles intersect.");
		}else{
			System.out.println("Your dumb circles don't intersect.");
		}
		
		
	}	
	
	static void makeCircles(int k){
		my= new Circle[k];
		for(int i=0;i<k;i++){
			my[i]= new Circle(i+1);
		}
		
	}
	
	static void printCircles(){
		for(int i=0; i < my.length; i++){
			System.out.println(my[i].write());
		}
	}
	
	/****************************************************************
	 * Main Program
	 ***************************************************************/
	public static void main(String[] args) {
		testCircles();
		//makeCircles(30);
		//printCircles();
	}



}
