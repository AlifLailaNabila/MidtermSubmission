package datastructure;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) throws Exception {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */
		ArrayList<String> Student = new ArrayList<>();
		//add element to Arraylist
		Student.add("Alif");
		Student.add("Rasel");
		Student.add("Reaz");


		//Print Array List
		System.out.println("Printing elements from ArrayList: " + Student);

		//Using get method to peek the first element
		System.out.println("Peek first element: " + Student.get(0));

		//remove element from ArrayList
		System.out.println("Remove element at index 1: " + Student.remove(1));

		//Retrieving elements from ArrayList
		System.out.println("Re-retrieving elements from ArrayList: " + Student);

		//Using 'forEach' loop
		System.out.println("Use of for each loop: ");
		for (String st : Student) {
			System.out.println(st);
		}

		//using iterator
		System.out.println("Use of iterator using while loop: ");
		Iterator it = Student.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		//Sorting ArrayList
		Collections.sort(Student);
		System.out.println(Student);
		//List list = new ArrayList();
		//list = Student;

		//Connect to MySql Database
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();


		//Insert data in the database
		connectToSqlDB.insertDataFromArrayListToSqlTable(Student, "Array_List", "Details");
		//connectToSqlDB.insertDataFromArrayListToSqlTable(Student, "Array_List", "Details");
		//connectToSqlDB.insertDataFromStringToSqlTable(String.valueOf(Student), "Array_List", "Details");


		//Read data from database

		List<String> student = connectToSqlDB.readDataBase("Array_List", "Details");
		//printValue(name);
		for (String st : Student) {
			System.out.println(st);


		}

		//public static void printValue(List<String> array) {
		//for (String st : array) {
		//System.out.println(st);
		//}
	}
}


	




