import java.util.Scanner;
class input1 
{
	public static void main(String[] args) 
	{
		System.out.println("Entered a input ");
		Scanner in = new Scanner(System.in);

		String s = in.nextLine();
		System.out.println("Entered a string : " + s);
		int int1 = in.nextInt();
		System.out.println("Entered a Integer : " + int1);
		float f = in.nextFloat();
		System.out.println("Entered a Float  : " + f);

		//in.close();

	}
}
