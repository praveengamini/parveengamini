import java.util.Scanner;
public class Program3
{
  public static void main(String[] args)
  {
    float a,b;
    int choice;
    Scanner input=new Scanner(System.in);
    System.out.print("Enter the value of a : ");
    a=input.nextFloat();
    System.out.print("Enter the value of b : ");
    b=input.nextFloat();
  System.out.print("The following operations are\n1. ADDITION\n2. SUBTRACTION\n3. MULTIPLICATION\n4. DIVISION\n");
    System.out.print("Enter your choice from 1 to 4 : ");
    choice=input.nextInt();
    input.close();
    if(choice==1)
    {
      System.out.println(+a+" + "+b+" is "+(a+b));
    }
    else if(choice==2)
    {
      System.out.println(+a+" -  "+b+" is "+(a-b));
     }
    else if(choice==3)
    {
      System.out.println(+a+" * "+b+" is "+(a*b));
    }
    else if(choice==4)
    {
      System.out.println(+a+" / "+b+" is "+(a/b));
    }
    else
    {
      System.out.println("Enter valid choice!!");
    }
  }
}
