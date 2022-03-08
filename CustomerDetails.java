
public class CustomerDetails implements BonusPoints,DoorDelivery{
	private String customerName;

	private String phoneNumber;

	private String streetName;

	private double billAmount;

	private int distance;
	
	public CustomerDetails(String customerName,String phoneNumber,String streetName,double billAmount,int distance)
	{
		this.customerName=customerName;
		this.phoneNumber=phoneNumber;
		this.streetName=streetName;
		this.billAmount=billAmount;
		this.distance=distance;
	}
	

	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getStreetName() {
		return streetName;
	}


	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}


	public double getBillAmount() {
		return billAmount;
	}


	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}


	public int getDistance() {
		return distance;
	}


	public void setDistance(int distance) {
		this.distance = distance;
	}


	public double calculateBonusPoints() {
		if(this.billAmount >=250)
		{
			double bonus = billAmount/10;
			return bonus;
		}
		return 0;
	}

	public double deliveryCharge() {
		double deliverycharge =0;
		if(this.distance >=25)
		{
			deliverycharge = 8;
		}
		if(this.distance >=15 && this.distance<25)
		{
			deliverycharge = 5;
		}
		if(this.distance <15)
		{
			deliverycharge = 2;
		}
		double delivery = this.distance * deliverycharge;
		return delivery;
	}
	
}
