package lesson28_handlingexceptions1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class HandlingExceptionsPractice {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("text1.txt");
		
		FileReader fr = new FileReader(file);

	}

}
