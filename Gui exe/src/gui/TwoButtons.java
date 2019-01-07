package gui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TwoButtons implements ActionListener  {
	JButton redButton;
	JButton greenButton;
	JFrame myFrame;
	public static void main(String[] args)  {
	
		new TwoButtons();

	}

	public TwoButtons() {
		
		//create new Jframe
				JFrame myFrame = new JFrame();
				
				//set Frame
				myFrame.setTitle("Choose Your Color");
				myFrame.setSize(550, 150);
				myFrame.setLocation(200, 300);
				
				
				myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				
				//FlowLayout myLayout = new FlowLayout();
				//GridLayout myLayout = new GridLayout(3,2);
				//JPanel myPanel = (JPanel)myFrame.getContentPane();
				//BoxLayout myLayout = new BoxLayout(myPanel,BoxLayout.Y_AXIS);
				BorderLayout myLayout = new BorderLayout();
				myFrame.setLayout(myLayout);
				
				
				redButton = new JButton("Red");
				greenButton = new JButton("Green");
				redButton.addActionListener(this);
				greenButton.addActionListener(this);


				
				
				
				myFrame.add(redButton,BorderLayout.LINE_START);
				//myFrame.add(new JLabel(""));
				//myFrame.add(new JLabel(""));
				//myFrame.add(new JLabel(""));
				//myFrame.add(new JLabel(""));
				myFrame.add(greenButton,BorderLayout.LINE_END);
				
				myFrame.setVisible(true);
	}
	

	
	public void actionPerformed(ActionEvent event) {
		Object control = event.getSource();
 		
 		if (control == redButton) {
 			JOptionPane.showMessageDialog(null, "I like Red!");
 		}
 		else if (control == greenButton) {
 			JOptionPane.showMessageDialog(null, "I like Green!");
 		}
		
	}
	

}
