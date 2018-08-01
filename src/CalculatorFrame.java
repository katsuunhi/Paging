import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;


public class CalculatorFrame extends JPanel{
	private JPanel blankPanel = new JPanel();
	private DisplayPanel displayPanel = new DisplayPanel();
	private ControlPanel controlPanel = new ControlPanel();
	private EntryPanel entryPanel = new EntryPanel();
	public EntryPanel getPanel()
	{
		return entryPanel;
	}
	CalculatorFrame()
	{
		blankPanel = new JPanel();
		displayPanel = new DisplayPanel();
		controlPanel = new ControlPanel();
		entryPanel = new EntryPanel();
		displayPanel.setLayout(new BoxLayout(displayPanel, BoxLayout.Y_AXIS));
//		controlPanel.setLayout(new BorderLayout(controlPanel, BroderLayou));
		controlPanel.setLayout(new GridLayout(6, 1));
		controlPanel.setBorder(new LineBorder(Color.BLACK));
		entryPanel.setLayout(new GridLayout(6, 20));
		entryPanel.setBorder(new LineBorder(Color.BLACK));
//		add(displayPanel, BorderLayout.NORTH);
//		add(blankPanel, BorderLayout.CENTER);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(controlPanel/*, BorderLayout.WEST*/);
		add(entryPanel/*, BorderLayout.EAST*/);
			
	}
	
}
