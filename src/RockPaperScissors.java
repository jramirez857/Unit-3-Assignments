import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//A GUI based Rock-Paper-Scissors Game. Starter code by Marcus

public class RockPaperScissors extends JFrame implements ActionListener {

	String humanChoice;
	String computerChoice;
	int humanWins;
	int computerWins;

	static JLabel humanText = new JLabel("The Human Chose ");
	static JLabel computerText = new JLabel("The Computer Chose");
	static JLabel winnerText = new JLabel("The winner is");
	static JLabel scoreText = new JLabel("The score is");

	public String getComputerChoice() {
		// Complete this method so that it randomly returns either "Rock", "Paper", or
		// "Scissors"
		return "";
	}

	public void playRound() {
		// This method gets called after the player clicks a button to make a choice and
		// after the computer has made
		// a random choice. Both choices will be found in the appropriate attribute of
		// this class.
		//
		// Complete this method by determining whether the human or the computer wins,
		// displaying the human's and the computer's choices, displaying the winner,
		// updating the winner's score, and displaying the new score
		//
		// How to update the text in the game:
		// This game has four objects of the class JLabel. They are called humanText,
		// computerText,
		// winnerText, and scoreText. When you want to update one of these labels, call
		// the label's "setText(String)"
		// method, passing in the string that you want the label to display.
	}

	private static void createAndShowGUI() {

		RockPaperScissors window = new RockPaperScissors();

		// Set this window's location and size:
		window.setBounds(300, 300, 500, 200);

		// setup the buttons
		JPanel buttons = new JPanel();
		buttons.setLayout(new FlowLayout());
		JButton rock = new JButton("Rock");
		JButton paper = new JButton("Paper");
		JButton scissors = new JButton("Scissors");
		rock.addActionListener(window);
		paper.addActionListener(window);
		scissors.addActionListener(window);
		buttons.add(rock);
		buttons.add(paper);
		buttons.add(scissors);

		// setup the text labels
		JPanel text = new JPanel();
		text.setLayout(new BoxLayout(text, BoxLayout.Y_AXIS));

		text.add(humanText);
		text.add(computerText);
		text.add(winnerText);
		text.add(scoreText);

		// Add panels for buttons and text labels to window:
		Container c = window.getContentPane();
		c.add(buttons, BorderLayout.PAGE_START);
		c.add(text, BorderLayout.CENTER);

		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		// code that reacts to a button press
		JButton choice = (JButton) e.getSource();
		humanChoice = choice.getText();
		computerChoice = getComputerChoice();
		playRound();
	}

	public static void main(String[] args) {
		// creates a new thread in which to run the GUI and runs the GUI
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});

	}
}
