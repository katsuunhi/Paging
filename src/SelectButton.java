import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SelectButton extends JPanel implements ActionListener{
	private JRadioButton FIFO;
	private JRadioButton LRU;
	private JRadioButton OPT;
	private JButton okButton;
	private String selected;
	public JRadioButton getLRU()
	{
		return LRU;
	}
	public JRadioButton getFIFO()
	{
		return FIFO;
	}
	public JRadioButton getOPT()
	{
		return OPT;
	}
	public JButton getokButton()
	{
		return okButton;
	}
	public String getSelected()
	{
		return selected;
	}
	SelectButton()
	{
		selected = "OPT";
		okButton = new JButton("OK");
		FIFO = new JRadioButton("FIFO");
		LRU = new JRadioButton("LRU");
		OPT = new JRadioButton("OPT", true);
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		add(FIFO);
		add(LRU);
		add(OPT);
		ButtonGroup paymentGroup = new ButtonGroup();
		paymentGroup.add(FIFO);
		paymentGroup.add(LRU);
		paymentGroup.add(OPT);
		FIFO.addActionListener(this);
		LRU.addActionListener(this);
		OPT.addActionListener(this);
		okButton.addActionListener(this);
//		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(okButton);
	}
	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();
		if(source == okButton)
		{
			if(FIFO.isSelected())
				selected = "FIFO";
			else if(LRU.isSelected())
				selected = "LRU";
			else if(OPT.isSelected())
				selected = "OPT";
		}
	}

}
