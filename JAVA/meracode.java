import java.util.*;
public class meracode {
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);

  // System.out.println("Enter two numbers: ");
  // int a = sc.nextInt();
  // int b = sc.nextInt();
  // System.out.println("The sum is: " + (a+b)); // for taking input of integer data type

  // System.out.println("Enter a long number: ");
  // long c = sc.nextLong(); // for taking input of long data type
  // System.out.println("The long number is: " + c);

  // char ch = sc.next().charAt(0); // for taking input of character data type
  // System.out.println("The character is: " + ch);

  System.out.println("Enter a string: ");
  String str = sc.next();
  System.out.println(str); // for taking input of string till first space
  
  System.out.println();

  System.out.println("Enter a string with space: ");
  String str2 = sc.nextLine();
  System.out.println(str2); // for taking input of string with space
  
  sc.close();

  
  //  System.out.println("Kaushal");
  //  int a = 5;
  //  int b = 10;
  //  System.out.println(a+b);

  }
}