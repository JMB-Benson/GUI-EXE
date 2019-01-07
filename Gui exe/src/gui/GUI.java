package gui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class GUI implements ActionListener {

	public static void main(String[] args) {
		
		new GUI();
	}

	public GUI() {
		JFrame frame = new JFrame();
		FlowLayout layout = new FlowLayout();
		
		
		
		frame.setLayout(layout);
		frame.setTitle("simple window");
		frame.setSize(400,200);
		frame.setLocation(200,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		JLabel label = new JLabel("This is my label!");
		frame.add(label);
		
		JButton button = new JButton("Click me");
		button.addActionListener(this);
		frame.add(button);
		
		
		
		
		JButton button2 = new JButton("Click me");
		frame.add(button2);
		
		JButton button3 = new JButton("Click me");
		frame.add(button3);
		
		JButton button4 = new JButton("Click me");
		frame.add(button4);
		
		JButton button5 = new JButton("Click me");
		frame.add(button5);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent event) {
		JOptionPane.showMessageDialog(null, "Hey that tickles!");
	}

}
