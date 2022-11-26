import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TwoButtonsAndALabel extends JFrame implements ActionListener {

	// this class starts with 3 attributes. Two are JButton objects for the user to
	// click and one is a JLabel object which displays some text.
	// Starter code by Marcus
	static JLabel label = new JLabel("default text");
	static JButton left = new JButton("left button");
	static JButton right = new JButton("right button");

	public static void setup() {
		// initialize your buttons and label here, each JButton and JLabel object has a
		// setText(String) method you can call.
		// Also do anything else that needs to be done before the user clicks anything.
	}

	public void buttonClick(JButton chosen) {
		// this method is called whenever the user clicks a button. The parameter is a
		// JButton object, either
		// "left" or "right"
	}

	private static void createAndShowGUI() {

		TwoButtonsAndALabel window = new TwoButtonsAndALabel();
		// Set this window's location and size:
		window.setBounds(300, 300, 500, 150);

		// setup the buttons
		JPanel buttons = new JPanel();
		buttons.setLayout(new FlowLayout());
		left.addActionListener(window);
		right.addActionListener(window);
		buttons.add(left);
		buttons.add(right);

		// setup the text label
		JPanel text = new JPanel();
		text.add(label);

		// Add panels for buttons and text label to window:
		Container c = window.getContentPane();
		c.setLayout(new BoxLayout(c, BoxLayout.PAGE_AXIS));
		c.add(text);
		c.add(buttons);

		// run your setup method
		setup();

		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);

	}

	public static void main(String[] args) {
		// creates a new thread in which to run the GUI and runs the GUI
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// when a button is clicked, calls your buttonClick method, passing as
		// an argument whichever JButton object was clicked
		buttonClick((JButton) e.getSource());

	}

}
