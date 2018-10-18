import java.util.Scanner;
public class MainA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		Calculate cal1 = new Calculate();
		
		System.out.print("Enter number: ");
		int num = inp.nextInt();
		cal1.setNumber(num);
		if(cal1.isOverNumber(num)) {
			System.out.print(cal1.callNumberToString());
		}
		
	}

}
