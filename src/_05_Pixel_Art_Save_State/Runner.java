package _05_Pixel_Art_Save_State;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import _04_Serialization.SaveData;

public class Runner {
	static String path = "src/_05_Pixel_Art_Save_State/state.dat";
	static File file;
	static PixelArtMaker yes;
	public static void main(String[] args) {
		win();
	}
	
	public static void win() {
		
		/*try (FileInputStream fis = new FileInputStream(new File(path)); ObjectInputStream ois = new ObjectInputStream(fis)) {
			yes = (PixelArtMaker) ois.readObject();
			yes.start();
		} catch (IOException e) {
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {*/
			// This can occur if the object we read from the file is not
			// an instance of any recognized class
			yes = new PixelArtMaker();
			yes.start();
		//}
		
	}
}
