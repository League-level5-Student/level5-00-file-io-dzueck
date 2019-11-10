package _01_File_Recorder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileRecorder {
	static FileWriter fw;
	public static void main(String[] args) {
		System.out.println("Give me you stupid line to put in the stupid file. I will not be your slave much longer.");
		Scanner thing = new Scanner(System.in);
		String line = thing.nextLine();
		try {
			fw = new FileWriter("src/_01_File_Recorder/YourShittyMessage.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fw.write(line);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// Create a program that takes a message from the user and saves it to a file.
}
