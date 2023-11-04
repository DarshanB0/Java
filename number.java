import java.util.Scanner;
public class number
{
 public static void main(String[] args)
 {
  Scanner number=new Scanner(System.in);
  System.out.println("Enter a number");
  int num=number.nextInt();
  if (num%3==0 && num%5==0)
  {
   System.out.println("Hii Hello");
  }
  else if(num%3==0)
  {
    System.out.println("hello");
  }
  else if(num%5==0)
   {
    System.out.println("Hii");
   }
   else
    {
      System.out.println("number is invalid");
    }
  }
}