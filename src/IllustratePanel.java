import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class IllustratePanel extends JPanel{
	private JTextField freeButton, busyButton, freeLabel, busyLabel, pagedTextField, pagedLabel;
//	private JLabel freeLabel, busyLabel;
	IllustratePanel()
	{
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		freeButton = new JTextField(4);
		busyButton = new JTextField(4);
		pagedTextField = new JTextField(4);
		pagedLabel = new JTextField("paged");
		freeLabel = new JTextField("busy");
		busyLabel = new JTextField("replaced");
		pagedTextField.setBackground(Color.YELLOW);
		freeButton.setBackground(Color.GREEN);
		busyButton.setBackground(Color.RED);
/*		setLayout(new GridLayout(2,2));*/
		setBorder(new LineBorder(Color.BLACK));
		add(freeButton);
		add(freeLabel);
		add(busyButton);
		add(busyLabel);
		add(pagedTextField);
		add(pagedLabel);
		
	}

}
