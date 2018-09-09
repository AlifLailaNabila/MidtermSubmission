package design;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args)throws Exception {
		EmployeeInfo ei1 = new EmployeeInfo(11);
		EmployeeInfo ei2 = new EmployeeInfo("Alif", 5);
		ei1.yearlyTour();
		Benefits be1 = new Benefits(8);
		be1.yearlyTour();
		be1.yearlyTour("Shama");


		ei1.setPerformance(5);
		System.out.println(ei1.getPerformance());
		//System.out.println(ei1.);


		EmployeeInfo.calculateEmployeeBonus(10000, 2);
		EmployeeInfo.calculateEmployeePension(200000);

		//EmployeeInfo.DateConversion.convertDate("April");


	}


}
