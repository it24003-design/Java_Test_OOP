import java.util.Scanner;
public class CGPAGradeCalculation
{
 public static void main(String[] args)
 {
  Scanner sc= new Scanner(System.in);
  System.out.print("Student ID : ");
  String id = sc.nextLine();
  System.out.print("No. of courses : ");
  int course = sc.nextInt();
  int total = 0;
  double cg;
  double creditEarned = 0.00;
  double TotalPoint = 0.00;

  for (int C = 1; C <= course; C++)
  {
    int total1 = 0;
    System.out.print("C" + C + ": Credit(Max3) : ");
    int credit = sc.nextInt();
    total = total+credit;
    System.out.print("CT (Max 30) : ");
    int ct = sc.nextInt();
    System.out.print("AT (Max 10) : ");
    int at = sc.nextInt();
    System.out.print("FE (Max 60) : ");
    int fe = sc.nextInt();
    total1 = ct + at + fe;


    if(total1 >= 40)
	creditEarned = creditEarned+credit;
    else
	creditEarned = creditEarned+0;

    if (total1 >= 80 && total1 <= 100)
    { 
	cg = credit*4;
        TotalPoint = TotalPoint + cg;
    }

    else if (total1 >= 75 && total1 <= 79) 
    {
	cg = 3.75*credit;
	TotalPoint = TotalPoint + cg;
    }

    else if (total1 >= 70 && total1 <= 74) 
    {
	cg = 3.50*credit;
	TotalPoint = TotalPoint + cg;
    }
  
    else if (total1 >= 65 && total1 <= 69) 
    {
	cg = 3.25*credit;
	TotalPoint = TotalPoint + cg;
    }

    else if (total1 >= 60 && total1 <= 64) 
    {
	cg = 3.00*credit;
	TotalPoint = TotalPoint + cg;
    }
    
    else if (total1 >= 55 && total1 <= 59)
    {
        cg = 2.75*credit;
	TotalPoint = TotalPoint + cg;
    }

    else if (total1 >= 50 && total1 <= 54) 
    {
	cg = 2.50*credit;
	TotalPoint = TotalPoint + cg;
    }

    else if (total1 >= 45 && total1 <= 49) 
    {
	cg = 2.25*credit;
	TotalPoint = TotalPoint + cg;
    }

    else if (total1 >= 40 && total1 <= 44) 
    {
	cg = 2.00*credit;
	TotalPoint = TotalPoint + cg;
    }
    else
	TotalPoint = TotalPoint+0;
  } 

  float cgpa = 0;
  if (creditEarned > 0)
	cgpa = (float)(TotalPoint / creditEarned);
  double twoDigit = Math.floor(cgpa * 100) / 100;

  System.out.println();
  System.out.println();
  System.out.println("Student ID : " +id);
  System.out.println("Credit Taken : " + total);
  System.out.println("Credit Earned : " + creditEarned);
  System.out.println("CGPA : " +twoDigit);


  if (twoDigit == 4.00)
	System.out.println("Grade: A+");
  else if (twoDigit >= 3.75)
	System.out.println("Grade: A");
  else if (twoDigit >= 3.50)
        System.out.println("Grade: A-");
  else if (twoDigit >= 3.25)
        System.out.println("Grade: B+");
  else if (twoDigit >= 3.00)
        System.out.println("Grade: B");
  else if (twoDigit >= 2.75)
        System.out.println("Grade: B-");
  else if (twoDigit >= 2.50)
        System.out.println("Grade: C+");
  else if (twoDigit >= 2.25)
        System.out.println("Grade: C");
  else if (twoDigit >= 2.00)
        System.out.println("Grade: D");
  else
        System.out.println("Grade: F / R");  
 }
}
  
  
  
