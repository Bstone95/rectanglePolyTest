/*Bradley Stone
 * HW 1 / 2
 * Spring 2023
 * COSC 1337
 */
import java.util.Scanner;

public class Rectangle2DTest {

	public static void main(String[] args) {
		
		//requests input from user for points//
		System.out.print("Enter five points: ");
		
		//creates scanner to accept inputs//
		Scanner input = new Scanner (System.in);
		
		//creates array of points to take in inputs//
		double [][] rectPoints = new double [5][2];
		
		
		//sets array based off of inputs//
		for(int i=0; i<rectPoints.length; i++) {
			for(int j=0; j<rectPoints[i].length; j++) {
				rectPoints[i][j] = input.nextDouble();
			}
	
		}
		
		//calls method to return rectangle based off of points input//
		MyRectangle2D rect1 = MyRectangle2D.getRectangle(rectPoints);
		
		//prints rectangles info as requested//
		System.out.println("The bounding rectangle's center (" + rect1.getX() + ","
				+ rect1.getY() + "), width " + rect1.getWidth() + ", height " + rect1.getHeight());

	}

}

