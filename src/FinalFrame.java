import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;

public class FinalFrame extends JFrame implements ActionListener{
	private int sleepTime;
	private GridBagConstraints c;
	private CalculatorFrame chart = new CalculatorFrame();
	private SelectButton selectPanel = new SelectButton();
	private JRadioButton autoButton = new JRadioButton("Auto", true);
	private JRadioButton nextButton = new JRadioButton("Click");
	private IllustratePanel illustratePanel = new IllustratePanel();
	private JButton exitButton;//, nextButton, autoButton;
	private JButton next = new JButton("next");
	public CenterText centerText;
	public CenterText getCenterText()
	{
		return centerText;
	}
	public SelectButton getSelectButton()
	{
		return selectPanel;
	}
	public  CalculatorFrame getChart()
	{
		return chart;
		
	}
	public FinalFrame()
	{
		sleepTime = 0;
		exitButton = new JButton("exit");
/*		nextButton = new JButton("next");
		autoButton = new JButton("auto/click");*/
		ButtonGroup group = new ButtonGroup();
		group.add(nextButton);
		group.add(autoButton);
		JPanel panel = new JPanel();
		panel.add(exitButton);
		panel.add(nextButton);
		panel.add(autoButton);
		panel.add(next);
		exitButton.addActionListener(this);
		nextButton.addActionListener(this);
		autoButton.addActionListener(this);
		next.addActionListener(this);
		chart = new CalculatorFrame();
		illustratePanel = new IllustratePanel();
		centerText = new CenterText();
		selectPanel = new SelectButton();
		setLayout(new BorderLayout());
		add(selectPanel, BorderLayout.NORTH);
		add(illustratePanel,BorderLayout.EAST);
		add(chart, BorderLayout.SOUTH);
		add(panel, BorderLayout.WEST);
		add(centerText, BorderLayout.CENTER);
		setTitle("Calculator");
		/*setLayout(new GridBagLayout());
		c = new GridBagConstraints();
		selectPanel.setLayout(new GridLayout(1,4));
		illustratePanel.setLayout(new GridLayout(2, 2));
		chart.setLayout(new GridLayout(5,21));
		add(selectPanel, c);
		add(illustratePanel, c);
		add(chart, c);
		c.fill = GridBagConstraints.WEST;*/
		setSize(1000, 400);
		setResizable(false);
		setVisible(true);
	}
	
	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e)
	{
		String string = e.getActionCommand();
		Object source = e.getSource();
		if(source == autoButton)
			Page.isAuto = true;
		if(source == nextButton)
			Page.isAuto = false;
		if(string == "exit")
		{
			
			System.exit(0);
		}
		if(string == "next")
		{
			
			Page.time = -1;
		}
		if(string == "auto/click")
		{
				Page.isAuto = !Page.isAuto;
		}
	}
	/*public static void main(String []arge)
	{
		
		FinalFrame frame = new FinalFrame();
		frame.getChart().getPanel().getButtons(2, 3).setBackground(Color.GREEN);
		
	}*/
	
}
