package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class DataReader {

	public static void main(String[] args) throws IOException {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class.
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		//String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
		//String textFile = System.getProperty("/Users/alifnabila/IdeaProjects/MidtermJuly2018/src/data/self-driving-car.txt");


		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("/Users/alifnabila/IdeaProjects/MidtermJuly2018/src/data/self-driving-car.txt");
		} catch (Exception ex) {
			System.out.println("File is not located in given path");
		}
		try{
			if(fr != null){
				br= new BufferedReader(fr);
				String st="";
				while((st=br.readLine())!= null) {
					System.out.println(st);
				}
			}
		} catch (Exception ex){
			ex.printStackTrace();
		} finally {
			if(fr != null){
				try {
					fr.close();
					//fr = null;
				}catch (Exception ex){
					ex.printStackTrace();
				}
			}
			if (br !=null){
				try{
					br.close();
					//br= null;
				}catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
	}
}




		/*FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("/Users/alifnabila/IdeaProjects/MidtermJuly2018/src/data/self-driving-car.txt");
		} catch (Exception ex) {
			System.out.println("File is not located in given path");
		}


		try {
			if (fr != null) {
				br = new BufferedReader(fr);
				String st = "";
				while ((st = br.readLine()) != null) {
					System.out.println(st);
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}



		/*BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(textFile));
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}

		String text ;
		while ((text = br.readLine())!=null){
			System.out.println(text);
		}

		Stack<String> car = new Stack<String>();
		String[] splitWords = textFile.split(" ");

		for (String word : splitWords) {
			Integer count = car.indexOf(splitWords);
			if (count == null) {
				count = 0;
			}
			car.add(word);
		}
		car.push(textFile);
		System.out.println(car);

	}

}
*/


