import java.util.Scanner;
/**
 * 
 * @author Jovanne Li
 *
 */
public class InputOutput 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Rectangle length: "); double length = in.nextDouble();
		System.out.print("Rectangle width: "); double width = in.nextDouble();
		
		double area = length*width;
		double perimeter = length + length + width + width;
		double diagonal = Math.sqrt((length*length) + (width*width));
		
		System.out.printf("Area: %10.2f", area);
		System.out.println();
		System.out.printf("Perimeter: %5.2f", perimeter);
		System.out.println();
		System.out.printf("Diagonal: %6.2f", diagonal);
	
	}

}
