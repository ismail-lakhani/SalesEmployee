package salesEmployee;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


@SuppressWarnings("serial")
public class SalesTester implements Serializable {

//Author Name: Mohd Ismail Lakhani

	
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		ArrayList<SalesEmployee> salesArray = new ArrayList<>();

		SalesEmployee salesAgent1 = new SalesAgent("Jason","Joseph","54321A");

		SalesEmployee salesAgent2 = new SalesAgent("Leon","Peter","65432B");


		SalesEmployee salesPerson1 = new SalesPerson("Edward", "Charlie","87654D");
	
		SalesEmployee salesPerson2 = new SalesPerson("Paula", "Jose","98765E");

	//Populating ArrayList
	
	
	salesArray.add(salesAgent1);

	salesArray.add(salesAgent2);



	salesArray.add(salesPerson1);

	salesArray.add(salesPerson2);



	//Using ENhanced 'for loop' for iterating through the array and print using toString method. 
	//Asking for total value of sale from the user and calculating commission for both the subclass.

	int i = 1;

	for (SalesEmployee salesEmployee: salesArray) {

		System.out.println(salesEmployee.toString());

		System.out.println("Enter total sales for employee "+i);

		double employeeSales = input.nextDouble();

		salesEmployee.sales=employeeSales;

		salesEmployee.calculateCommission();

		i++;
	
		}
	
	//Being the two serialization processes of part two of the assignment

	//Creating file stream and output stream to save ArrayList object to EmployeeInfo.dat

	try {

	FileOutputStream fileStream = new FileOutputStream("EmployeeInfo.dat");

	ObjectOutputStream os = new ObjectOutputStream(fileStream);

	os.writeObject(salesArray);

	os.close();

	}catch (Exception e) {

	e.printStackTrace();

	}
	
	//Reading from EmployeeInfo.dat and using element.toString() to print to console

	try{

	FileInputStream fileStream = new FileInputStream("EmployeeInfo.dat");

	ObjectInputStream os = new ObjectInputStream(fileStream);

	ArrayList<SalesEmployee> employeeIteration = (ArrayList<SalesEmployee>)os.readObject();

	for (SalesEmployee element:employeeIteration){

	System.out.println(element.toString());

	}

	os.close();

	} catch (Exception e) {

	e.printStackTrace();
	}
	
	//Writing ArrayList to the EmployeeList.txt file

	try {

	FileWriter fileWriter = new FileWriter("EmployeeList.txt");

	BufferedWriter writer = new BufferedWriter(fileWriter);

	writer.write("Employee details \n");

	for(SalesEmployee element:salesArray){

	writer.write("Name: " + element.toString() + " \n ");

	}

	writer.close();

	} catch(IOException e){

	e.printStackTrace();

	}

	/*

	* Reading from the EmployeeList.txt plain text file and printing to console, this in combination with the

	* input stream provides two identical displays to the console for the purposes of this assignment

	*/
	
	
	try{

		File employeeFile = new File("EmployeeList.txt");

		FileReader fileReader = new FileReader(employeeFile);

		BufferedReader reader = new BufferedReader(fileReader);

		String line = null;

		while ((line = reader.readLine()) != null){
			
			System.out.println(line);

		}

		reader.close();

		} catch (IOException e){

		e.printStackTrace();

		}

		input.close();//Close scanner		
	
	}
}//End of Class
