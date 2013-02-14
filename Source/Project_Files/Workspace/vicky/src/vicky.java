import java.util.*;
public class vicky {
double vat, total;

	
	public static void main(String[] args) {
	System.out.println("Please enter the price of the haircut/treatment: ");
	Scanner sc = new Scanner(System.in);
    double price = sc.nextDouble();
    System.out.println("The VAT payable on this treatment was " + (price * 0.20));
    System.out.println("The money remaining is " + (price * 0.80));
	}

}
