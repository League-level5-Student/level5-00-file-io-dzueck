package _03_To_Do_List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JPanel;

public class buttonsHere implements ActionListener{
	JButton addButton;
	JButton viewButton;
	JButton removeButton;
	JButton saveButton;
	JButton loadButton;
	FileWriter writer;
	BufferedReader reader;
	Scanner scanner;
	String path = "src/_03_To_Do_List/listOfBullshit.txt";
	ArrayList<String> list = new ArrayList<>();
	File file;
	
	
	buttonsHere(JPanel panel){
		 addButton = new JButton("add");
		 viewButton = new JButton("view");
		 removeButton = new JButton("remove");
		 saveButton = new JButton("save");
		 loadButton = new JButton("load");
		addButton.addActionListener(this);
		viewButton.addActionListener(this);
		removeButton.addActionListener(this);
		saveButton.addActionListener(this);
		loadButton.addActionListener(this);
		panel.add(addButton);
		panel.add(viewButton);
		panel.add(saveButton);
		panel.add(removeButton);
		panel.add(loadButton);
		scanner = new Scanner(System.in);
		file = new File(path);
		if(file.exists()) {
			try {
				BufferedReader br = new BufferedReader(new FileReader(path));
				
				String line = br.readLine();
				while(line != null){
					list.add(line);
					line = br.readLine();
				}
				
				br.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == addButton) {
			System.out.println("What shitty task do you want to add that you will never get to.");
			String newShit = scanner.nextLine();
			list.add(newShit);
		}
		else if(e.getSource() == viewButton) {
			for(String s: list) {
				System.out.println(s);
			}
		}
		else if(e.getSource() == saveButton) {
			file.delete();
			file = new File(path);
			try {
				FileWriter fw = new FileWriter(path);
				for(String s: list) {
					fw.write(s + "\n");
				}
				fw.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if(e.getSource() == removeButton) {
			System.out.println("What task did you fianly give up on.");
			String s = scanner.nextLine();
			if(list.contains(s)) {
				list.remove(list.indexOf(s));
			}
			else {
				System.out.println("ARE YOU RETARDED?!?!?!?!?!?!?!!??!!??!?!?");
				
			}
		}
		else if(e.getSource() == loadButton) {
			try {
				list = new ArrayList<>();
				BufferedReader br = new BufferedReader(new FileReader(path));
				
				String line = br.readLine();
				while(line != null){
					list.add(line);
					line = br.readLine();
				}
				br.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
