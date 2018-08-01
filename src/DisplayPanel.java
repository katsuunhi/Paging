import java.awt.Color;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class DisplayPanel extends JPanel{
	private JLabel name;
	private JTextArea display;
	DisplayPanel()
	{
		name = new JLabel(" ");
		add(name);
		display = new JTextArea(3, 20);
		display.setEditable(false);
		display.setBorder(new LineBorder(Color.BLACK));
		add(display);
	}
}
