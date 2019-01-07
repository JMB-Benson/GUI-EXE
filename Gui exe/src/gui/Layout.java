package gui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;



public class Layout {
	JFrame myFrame;
	JPanel contentPane;
	FlowLayout fLayout;
	GridLayout gLayout;
	BorderLayout bLayout;
	BoxLayout xLayout;
	JPanel myPanel;

	public static void main(String[] args) {
		new Layout();

	}

	public Layout() {
		myFrame = new JFrame();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myPanel = (JPanel)myFrame.getContentPane();
		myFrame.setSize(200,200);
		myPanel.setLayout(new BoxLayout(myPanel,BoxLayout.Y_AXIS));
		
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new FlowLayout());
		topPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		
		JLabel myLabel = new JLabel("What is your favorite fruit?");
		topPanel.add(myLabel);
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new GridLayout(2,2,2,2));
		bottomPanel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		
		bottomPanel.add(new JButton("Apple"));
		bottomPanel.add(new JButton("Orange"));
		bottomPanel.add(new JButton("Pear"));
		bottomPanel.add(new JButton("Banana"));
		myPanel.add(topPanel);
		myPanel.add(bottomPanel);
		
		
		
		
		
		myFrame.setVisible(true);
		
		
	}

}
