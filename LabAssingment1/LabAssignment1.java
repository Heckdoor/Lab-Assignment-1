import java.util.Scanner;

public class LabAssignment1 {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		{
			//declaring my variables
			double num1, num2, num3, num4, num5;
			double dev1, dev2, dev3, dev4, dev5, dev6, dev7;
			double sum;
			double avg;
			double ps_deviation;
			{
				//saving the user input for each variable
				System.out.printf("Input your first number: ");
				num1 = sc.nextInt();
				System.out.printf("Input your second number: ");
				num2 = sc.nextInt();
				System.out.printf("Input your third number: ");
				num3 = sc.nextInt();
				System.out.printf("Input your fourth number: ");
				num4 = sc.nextInt();
				System.out.printf("Input your fifth number: ");
				num5 = sc.nextInt();
			}
			{
				//finding the sum of all the variables
				sum = (double) num1 + num2 + num3 + num4 + num5;
				//finding the mean or average of all the variables
				avg = (double) (num1 + num2 + num3 + num4 + num5) / 5;
				{
					//this block of code is the math used to find the population standard deviation of the variables
					dev1 = (num1 - avg);
					dev2 = (num2 - avg);
					dev3 = (num3 - avg);
					dev4 = (num4 - avg);
					dev5 = (num5 - avg);
					dev6 = (dev1 * dev1) + (dev2 * dev2) + (dev3 * dev3) + (dev4 * dev4) + (dev5 * dev5);
					dev7 = dev6 / 5;
					ps_deviation = Math.sqrt(dev7);
				}
			}
			System.out.printf("The sum of 5 numbers is: %.2f", sum);
			System.out.printf("\nThe average of 5 numbers is: %.2f", avg);
			System.out.printf("\nThe population standard deviation of 5 numbers is: %.2f", ps_deviation);
		}
	}
}