import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner sc = new Scanner(System.in);
      int a,b;
      a=sc.nextInt();
     // b=sc.nextInt();
      b=(a/10)+(a%10);
      System.out.println(b);
	}
}