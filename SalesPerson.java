package salesEmployee;

@SuppressWarnings("serial")
public class SalesPerson extends SalesEmployee {

public SalesPerson() {

super();

}

//As per the given condition, Giving commission of 10% to the SalesPerson
public SalesPerson(String firstName, String lastName, String ppsNumber) {

super(firstName,lastName,ppsNumber);

this.commission=.10;

}
//Calculating Commission and displaying the output
public void calculateCommission() {

System.out.println("Total sales: €" + sales);

System.out.println("Total commission earned: €" + (sales*commission));

	}
}//End of class
