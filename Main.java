import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the customer name");
		String name = sc.nextLine();
		System.out.println("Enter the phone number");
		String phone = sc.nextLine();
		System.out.println("Enter the street name");
		String street = sc.nextLine();
		System.out.println("Enter the bill amount");
		double bill = sc.nextDouble();
		System.out.println("Enter the distance");
		int dis = sc.nextInt();
		
		CustomerDetails s = new CustomerDetails(name,phone,street,bill,dis);
		
		double bonus = s.calculateBonusPoints();
		double delivery = s.deliveryCharge();
		
		System.out.println("Enter the customer name "+s.getCustomerName());
		System.out.println("Enter the phone number "+s.getPhoneNumber());
		System.out.println("Enter the street name "+s.getStreetName());
		System.out.printf("Bonus points %.1f\n",bonus);
		System.out.printf("Delivery charge %.1f",delivery);
		
	
	}
}










