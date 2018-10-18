import java.util.Scanner;

public class mainB {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("input your number : ");
		int num = in.nextInt();
		Calculate cal = new Calculate();
		cal.setNumber(num);
			System.out.println(cal.callNumberToMonth());
	}

}
