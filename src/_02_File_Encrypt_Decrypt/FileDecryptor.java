package _02_File_Encrypt_Decrypt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileDecryptor {
	// Create a program that opens the file created by FileEncryptor and display
	// the decrypted message to the user in a JOptionPane.
	public static void main(String[] args) {
		String line = "failure";
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("src/_02_File_Encrypt_Decrypt/YourShittyMessage.txt"));
			line = br.readLine();
			line = line.substring(1, line.length() - 1);
			String[] sa = line.split(", ");
			byte[] ca = new byte[sa.length];
			for(int i = 0; i < sa.length; i++) {
				ca[i] = Byte.parseByte(sa[i]);
			}
			line = new String(ca, Charset.defaultCharset());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(line);
		
	}
}
