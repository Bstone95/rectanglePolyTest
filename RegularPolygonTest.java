/*Bradley Stone
 * HW 1 / 2
 * Spring 2023
 * COSC 1337
 */
public class RegularPolygonTest {

	
	public static void main(String[] args) {
		
		//creates the requested rectangle//
		RegularPolygon poly1 = new RegularPolygon();
		RegularPolygon poly2 = new RegularPolygon(6,4);
		RegularPolygon poly3 = new RegularPolygon(10,4,5.6,7.8);
		
		//prints info for items//
		System.out.println("The perimeter of Polygon 1 is " + poly1.getPerimeter() + 
		" The area of Polygon 1 is " + poly1.getArea());
		
		System.out.println("The perimeter of Polygon 2 is " + poly2.getPerimeter() + 
				" The area of Polygon 2 is " + poly2.getArea());
		
		System.out.println("The perimeter of Polygon 3 is " + poly3.getPerimeter() + 
				" The area of Polygon 3 is " + poly3.getArea());
	}

}
