package carpayment;

public class CarPayment 
{
	private int totalPrice;
	private int downPayment;
	private int loanLength;
	private double interestRate;
	
	public CarPayment(int totalPrice, int downPayment, int loanLength, double interestRate) 
	{
		super();
		this.totalPrice = totalPrice;
		this.downPayment = downPayment;
		this.loanLength = loanLength;
		this.interestRate = interestRate;
	}
	
	public double getPayment()
	{
		double rate = (interestRate / 100) / 12;
		
		double principal = (totalPrice - downPayment) * rate;
		
		double i = Math.pow((rate + 1), loanLength);
		
		double x = 1 - (1 / i);
		
		return principal / x;
	}
	
	public double getTotalInterest()
	{
		return (getPayment()*loanLength) - (totalPrice - downPayment);
	}
	
	
	
}
