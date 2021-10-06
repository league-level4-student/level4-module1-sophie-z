package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday":
			System.out.println("have fun waking up at 6 am tomorrow :)");
			break;
		case "Monday":
			System.out.println("i know you want coffee don't deny it");
			break;
		case "Tuesday":
			System.out.println("only four days left before you can sleep til 12 pm!");
			break;
		case "Wednesday":
			System.out.println("this is week is really, really, really long, isn't it");
			break;
		case "Thursday":
			System.out.println("it's almost friday!!!!");
			break;
		case "Friday":
			System.out.println("it's friYAY!!!!!!!!");
			break;
		case "Saturday":
			System.out.println("homework is dumb anyway, starbucks here i come");
			break;
		}
	}
}
