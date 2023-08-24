package _05_popcorn;

import javax.swing.JOptionPane;

public class PopcornRunner {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Which flavor do you want?");
		String b = JOptionPane.showInputDialog("How long do you want to cook it?");
		int time = Integer.parseInt(b);
		Popcorn pop = new Popcorn(a);
		Microwave micro = new Microwave();
		micro.putInMicrowave(pop);
		micro.setTime(time);
		micro.startMicrowave();
	}
	
}
