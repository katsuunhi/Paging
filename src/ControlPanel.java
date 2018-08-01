import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class ControlPanel extends JPanel{
	private int data[] = {7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2, 1, 2, 0, 1, 7, 0, 1};
	private JButton button[];
	ControlPanel()
	{
		button = new JButton[6];
		button[0] = new JButton("  ");
		for(int i = 1; i < 4; i ++)
			button[i] = new JButton("ÎïÀí¿é" + i);
		button[4] = new JButton("È±Ò³·ñ");
		button[5] = new JButton("Ìæ»»Ò³");
		for(int i = 0; i < 6; i ++)
			add(button[i]);
	}

}
