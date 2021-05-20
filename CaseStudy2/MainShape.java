package CaseStudy2;
import java.util.Scanner;
public class MainShape {
	public static void CircleData() {
			Scanner sc=new Scanner(System.in);
			Circle c=new Circle();
			System.out.print("Enter the radius of the circle=");
			c.radius=sc.nextDouble();
			System.out.println(c);
			System.out.printf("Area of the circle =",c.getArea());
			System.out.printf("Perimeter of the circle=",c.getPerimeter());
			
			sc.close();
		}
		public static void RectangleData() {
			Scanner sc=new Scanner(System.in);
			Rectangle r = new Rectangle();
			System.out.print("Enter the length of the rectangle= ");
			r.length=sc.nextDouble();
			System.out.print("Enter the width of the rectangle=");
			r.width=sc.nextDouble();
			
			System.out.println(r);
			System.out.printf("Area of the rectangle=",r.getArea());
			System.out.printf("Perimeter of the rectangle=",r.getPerimeter());
			
			sc.close();
		}
		
		public static void SquareData() {
			Scanner sc=new Scanner(System.in);
			Square s=new Square();
			
			System.out.print("Enter the side of the square=");
			s.length=sc.nextDouble();
			
			System.out.println(s);
			System.out.printf("Area of the square=",s.getArea());
			System.out.printf("Perimeter of the square=",s.getPerimeter());
			
			sc.close();
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			
			int choice;
			System.out.print("1=>Compute for Circle 2=>Compute for Rectangle 3=>Compute for Square \n#Enter your choice = ");
			choice = sc.nextInt();
			switch(choice) {
			case 1: CircleData();
					break;
			case 2: RectangleData();
					break;
			case 3: SquareData();
					break;
			default : System.out.println("Invalid choice!");
			}
			
			sc.close();
		}
}

