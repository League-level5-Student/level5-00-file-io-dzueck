package _03_To_Do_List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileWriter;
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
		if()
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == addButton) {
			System.out.println("What shitty task do you want to add that you will never get to.");
			String newShit = scanner.nextLine();
			FileWriter 
		}
		
	}

}
