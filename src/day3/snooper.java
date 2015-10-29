package day3;

import javax.swing.JOptionPane;

public class snooper {
public static void main(String[] args) {

	String name = JOptionPane.showInputDialog("what is your name?");
	JOptionPane.showMessageDialog(null, "hello " + name + "would you like a glass of water? ");	
	String intero = JOptionPane.showInputDialog("who are you working for");
    String address = JOptionPane.showInputDialog("where are they");
    JOptionPane.showMessageDialog(null, "get out of here " + name + " I know you're working for " + intero + " in " + address);
    

	
	
}
}
