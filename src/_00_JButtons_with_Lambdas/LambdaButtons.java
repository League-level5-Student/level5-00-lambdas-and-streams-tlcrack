package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons implements ActionListener {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	Random r = new Random();
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		
		addNumbers.addActionListener((ActionEvent e)->{
			String a = JOptionPane.showInputDialog("What is the first number you would like to add?");
			String b = JOptionPane.showInputDialog("What is the second number you would like to add?");
			int x = Integer.parseInt(a) + Integer.parseInt(b);
			JOptionPane.showMessageDialog(null, x);
		});
		randNumber.addActionListener((e)->{
			JOptionPane.showMessageDialog(null, r.nextInt(100));
		});
		tellAJoke.addActionListener((e)->{
			int i = r.nextInt(5);
			if(i==0) {
				JOptionPane.showMessageDialog(null, "What do you call a cow with no legs?");
				JOptionPane.showMessageDialog(null, "Ground beef!");
			}
			else if(i==1) {
				JOptionPane.showMessageDialog(null, "How did the chicken cross the road?");
				JOptionPane.showMessageDialog(null, "[REDACTED]");
			}
			else if(i==2) {
				JOptionPane.showMessageDialog(null, "Why does a mouse as it spins?");
				JOptionPane.showMessageDialog(null, "A non-sequitor!");
				JOptionPane.showMessageDialog(null, "Ha ha ha ha");
			}
			else if(i==3) {
				JOptionPane.showMessageDialog(null, "How do you safely do an emergency plane landing?");
				JOptionPane.showMessageDialog(null, "(I'm asking for a friend)");
			}
			else if(i==4) {
				JOptionPane.showMessageDialog(null, "Sherlock and Watson went camping in the woods.");
				JOptionPane.showMessageDialog(null, "When they got tired, they found a beautiful spot under the moon and stars,");
				JOptionPane.showMessageDialog(null, "set up their tent, crawled inside,got cozy in their sleeping bags,");
				JOptionPane.showMessageDialog(null, "and went to sleep.");
				JOptionPane.showMessageDialog(null, "Sherlocke woke Watson up in the middle of the night.");
				JOptionPane.showMessageDialog(null, "'Watson, what do you see?'");
				JOptionPane.showMessageDialog(null, "'I see countless stars above us.'");
				JOptionPane.showMessageDialog(null, "'And what do you think that means, Watson?'");
				JOptionPane.showMessageDialog(null, "'Well, if there are some many stars, there must be plenty of planets, so we must not be alone in this universe.'");
				JOptionPane.showMessageDialog(null, "'No, Watson, you idiot, it means someone stole our tent.'");
			}
		});
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
