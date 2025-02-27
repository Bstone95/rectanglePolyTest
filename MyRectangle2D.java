/*Bradley Stone
 * HW 1 / 2
 * Spring 2023
 * COSC 1337
 */
public class MyRectangle2D {
	
	//creates variables necessary for rect//
	private double x;
	private double y;
	private double w;
	private double h;
	
	//variables for corners of rectangle//
	private double topL;
	private double botL;
	private double topR;
	private double botR;
	
	
	
	//no arg rectangle//
	MyRectangle2D(){
		x = 0;
		y = 0;
		w = 1;
		h = 1;
		
		//
		topL = x - (this.w / 2.0);
		topR = x + (this.w / 2.0);
		botL = y - (this.h / 2.0);
		botR = y + (this.h / 2.0);
	}
	
	//arg constructor//
	MyRectangle2D(double x, double y, double w, double h){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		topL = this.x - (this.w / 2.0);
		topR = this.x + (this.w / 2.0);
		botL = this.y - (this.h / 2.0);
		botR = this.y + (this.h / 2.0);
	}
	
	//returns rectangle for set of points in a plane//
	public static MyRectangle2D getRectangle (double[][] points) {
		
		//sets X and Y coords//
		double xl = points [0][0];
		double xr = points [0][0];
		double yt = points [0][1];
		double yb = points [0][1];
		
		//returns points from inputs//
		for (int i = 1; i < points.length; i++) {
			
			//finds lowest x point//
			if (points [i][0] < xl) {
				xl = points [i][0];
			}
			//finds highest x point//
			else if (points [i][0] > xr) {
				xr = points [i][0];
			}
			//finds lowest y point//
			if (points [i][1] < yb) {
				yb = points [i][1];
			}
			//finds highest y point//
			else if (points [i][1] > yt) {
				yt = points [i][1];
			}
		}
		
		//sets up new rectangle with inputs//
		MyRectangle2D rect = new MyRectangle2D();
		
		rect.setWidth(xr - xl);
		rect.setHeight(yt - yb);
		rect.setX((xr + xl) / 2.0);
		rect.setY((yt + yb) /2.0);
		
		
		//returns new rectangle//
		return new MyRectangle2D (rect.x, rect.y, rect.w, rect.h);
	}
	//returns x//
	public double getX() {
		return x;
	}
	
	//sets x//
	public void setX(double x) {
		this.x = x;
	}
	
	//returns y//
	public double getY() {
		return y;
	}
	
	//sets y//
	public void setY(double y) {
		this.y = y;
}
	
	//returns height//
	public double getHeight() {
		return h;
	}
	
	//sets height//
	public void setHeight(double h) {
		this.h = h;
	}
	
	//returns width//
	public double getWidth() {
		return w;
	}
	
	//sets width//
	public void setWidth(double w) {
		this.w = w;
	}
	
	//returns area using formula//
	public double getArea() {
		return w*h;
	}
	
	//returns perimeter using formula//
	public double getPerimeter() {
		return 2 * (w+h);
	}
	
	// checks if point is within rectangle, returns true if given point is//
	public boolean contains (double x, double y) {
		if ((x >= topL && x<= topR)&& (y >= botL && y<= botR)){
			return true;
		}
		else
			return false;
	}
	
	//checks if rectangle is within given rectangle//
	public boolean contains (MyRectangle2D r) {
		double ul = r.getX() - (r.getWidth()/2.0);
		double ur = r.getX() + (r.getWidth()/2.0);
		double bl = r.getY() - (r.getHeight()/2.0);
		double br = r.getY() + (r.getHeight()/2.0);
		if ((ul >= topL && ur <= topR)&& (bl >= botL && br <= botR)){
			return true;
		}
		else
			return false;
	}
	
	//checks if rectangle overlaps rectangle//
	public boolean overlaps (MyRectangle2D r) {
		double distX = Math.abs(this.getX() - r.getX());
		double distY = Math.abs(this.getY() - r.getY());
		
		double totWidth = (this.getWidth() + r.getWidth())/ 2.0;
		double totHeight = (this.getHeight() + r.getHeight())/ 2.0;
		
		if (distX < totWidth && distY < totHeight) {
			return true;
		}
		else 
			return false;
	}
}
