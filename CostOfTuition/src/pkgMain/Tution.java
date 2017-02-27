package pkgMain;
import java.util.Scanner;

public class Tution {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter current cost of tuition:");
		double tuition = input.nextDouble();
		
		System.out.print("Enter rate of change of tuition per year:");
		double rate = input.nextDouble();
		
		double sum = 0;
		
		for(int i = 1; i <= 4 ; i++) {
			sum = sum + tuition;
			tuition = tuition * (1 + rate/100);
		}
		
		System.out.println("The total cost of tuition is " + sum);			
	}
	

}
