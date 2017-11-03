package intro_to_file_io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class ToDoListTracker implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton AddTask = new JButton();
	JButton RemoveTask = new JButton();
	JButton Save = new JButton();
	JButton Load = new JButton();
	ArrayList<String> toDoList = new ArrayList<String>();
	public ToDoListTracker () {
		
		frame.add(panel);
		panel.add(AddTask);
		panel.add(Load);
		panel.add(Save);
		panel.add(RemoveTask);
		panel.setSize(20, 10);
		Save.setText("Save");
		AddTask.setText("AddTask");
		Load.setText("Load");
		RemoveTask.setText("RemoveTask");
		Save.addActionListener(this);
		Load.addActionListener(this);
		RemoveTask.addActionListener(this);
		AddTask.addActionListener(this);
		frame.setVisible(true);
		
	}
	
public static void main(String[] args) {
ToDoListTracker tracker = new ToDoListTracker();



}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource().equals(AddTask)) {
		String toDo = JOptionPane.showInputDialog("What would you like to add to your to-do list?");
		System.out.println("hi");
		toDoList.add("" + toDo);
	}
	
	if (e.getSource().equals(RemoveTask)) {
		String indexq = JOptionPane.showInputDialog("What number objective do you want to delete?");
		int index1 = Integer.parseInt(indexq);
		toDoList.remove(index1);
	}
	if (e.getSource().equals(Save)) {
		try {
			FileWriter fw = new FileWriter("src/intro_to_file_io/test2.txt");
			for (int i = 0; i < toDoList.size(); i++) {
				
				fw.write("\n" + toDoList.get(i));
			}
				
			fw.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
	}
}
}







