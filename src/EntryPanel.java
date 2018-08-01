import javax.swing.*;
import java.awt.*;

public class EntryPanel extends JPanel{

	private int data[] = {7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2, 1, 2, 0, 1, 7, 0, 1};	
	private JButton button[];
	EntryPanel()
	{
		/*button = new JButton[16];
		for(int i = 0; i < 10; i ++)
			button[i] = new JButton("" + i);
		button[10] = new JButton("+");
		button[11] = new JButton("-");
		button[12] = new JButton("*");
		button[13] = new JButton("/");
		button[14] = new JButton(".");
		button[15] = new JButton("=");
		for(int i = 0; i < 16; i++)
			add(button[i]);*/
		
		button = new JButton[120];
		for(int i = 0; i < 20; i ++)
			button[i] = new JButton("" + data[i]);
		for(int i = 20; i < 120; i ++)
			button[i] = new JButton("  ");
		for(int i = 0; i < 120; i++)
			add(button[i]);
	}
	public JButton getButtons(int disk, int num)
	{
		return button[20*(disk + 1) + num];
	}
}
