package salesEmployee;



@SuppressWarnings("serial")
public class SalesAgent extends SalesEmployee {

	public SalesAgent() {

		super();

		}

		//As per the given condition, Giving commission rate of 15% to the SalesAgent 
		public SalesAgent (String firstName, String lastName, String ppsNumber) {

		super(firstName,lastName,ppsNumber);

		this.commission=.15;

		}

		//Calculating Commission and displaying the output
		public void calculateCommission() {

		System.out.println("Total sales: €" + sales);

		System.out.println("Total commission earned: €" + (sales*commission));
		
	}

}//End of Class
