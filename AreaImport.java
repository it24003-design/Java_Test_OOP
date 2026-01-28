
public class AreaImport
  {
   public static void main(String[] args)
	{
	 double width,height;
	 
	 width = Double.parseDouble(args[0]);
         height = Double.parseDouble(args[1]);

	 double AreaOfRectangular = width*height;
	 double perimeter = 2*(width+height);

	 System.out.printf("Area of the rectanghular is: %.3f\n",AreaOfRectangular);
	 System.out.printf("Perimeter of the rectangular is: %.3f",perimeter);

	}
  }
