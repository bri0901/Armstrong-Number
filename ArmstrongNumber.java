import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int org, temp, sum= 0, r;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number to find its Armstrong number: ");
		org = in.nextInt();
		
		temp = org;
		
		while(temp != 0) {
			r = temp%10;
			sum = sum +(r*r*r);
			temp = temp - r;
			temp = temp/10;
		}
		
		if(org == sum){
			System.out.println("The number " + org + " is a Armstrong number");
		}
		else {
			System.out.println("The number " + org + " is not a Armstrong number");
		}
				
	}
}
