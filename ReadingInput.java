import java.util.Scanner;

class ReadingInput
{
  public static void main(String []args)
  {
      Scanner sc = new Scanner(System.in);
	  System.out.println("ENTER YOUR NAME");
	  String name = sc.nextLine();
	  System.out.println(name);
  }
}