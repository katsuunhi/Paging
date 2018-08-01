import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class CenterText extends JPanel{
	private JLabel label;
	public void setLabelText(String string)
	{
		label.setText(string);
		
	}
	public CenterText()
	{
		label = new JLabel();
		add(label);
		setLayout(new FlowLayout(FlowLayout.CENTER));
	}
}
