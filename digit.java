import java.util.*;
public class digit
{
 public static void main(String[] args)
 {
  int a,b,c; 
  Scanner num=new Scanner(System.in);
  System.out.println("Enter a number");
  int number= num.nextInt();
  {
    a=number/100;
    b=(number/10)%10;
    c=number%10;
     System.out.println("a="+a);
     System.out.println("b="+b);
     System.out.println("c="+c);
   }
  }
}
