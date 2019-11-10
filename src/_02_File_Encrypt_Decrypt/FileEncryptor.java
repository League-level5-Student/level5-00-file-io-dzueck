package _02_File_Encrypt_Decrypt;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;

public class FileEncryptor {
	static FileWriter fw;
	
	private static Cipher ecipher;
    private static Cipher dcipher;
 
    private static SecretKey key;

	// Create a program that takes a message from the user.
	// Use the methods in the String and Character classes to save
	// an encrypted form of the message to a file
	public static void main(String[] args) {
		
		System.out.println("Give me you stupid line to put in the stupid file. I will not be your slave much longer.");
		Scanner thing = new Scanner(System.in);
		byte[] line = thing.nextLine().getBytes();
		try {
			fw = new FileWriter("src/_02_File_Encrypt_Decrypt/YourShittyMessage.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fw.write(Arrays.toString(line));
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
}
