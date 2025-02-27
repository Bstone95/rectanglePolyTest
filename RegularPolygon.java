/*Bradley Stone
 * HW 1 / 2
 * Spring 2023
 * COSC 1337
 */
public class RegularPolygon {
	
	//required variables//
	private int n;
	private double side;
	private double x;
	private double y;
	
	//no args constructor//
	public RegularPolygon(){
		this.n = 3;
		this.side = 1;
		this.x = 0;
		this.y = 0;	
	}
	
	//args constructor for side number and size of sides//
	public RegularPolygon(int n, double side) {
		this.n = n;
		this.side = side;
		x = 0;
		y = 0;
	}
	
	//full build polygon// 
	public RegularPolygon (int n, double side, double x, double y) {
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	
	//returns number of sides//
	public int getNumOfSides() {
		return n;
	}
	
	//sets number of sides//
	public void setNumOfSides(int n) {
		this.n = n;
	}
	
	//returns side size//
	public double getSide() {
		return side;
	}
	
	//sets size of side
	public void setSide(double side) {
		this.side = side;
	}
	
	//returns x variable//
	public double getX() {
		return x;
	}
	
	//sets x variable// 
	public void setX(double x) {
		this.x = x;
	}
	
	//gets y variable//
	public double getY() {
		return y;
	}
	
	//sets y variable//
	public void setY(double y) {
		this.y = y;
	}
	
	//returns perimeter//
	public double getPerimeter() {
		return n*side;
	}
	
	//returns area//
	public double getArea(){
		return (n*side*side)/(4*Math.tan(Math.PI/n));
	}
}
