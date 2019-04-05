import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class WelcomePanel extends JPanel
{
	public WelcomePanel()
	{
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		JLabel label = new JLabel("Welcome");
		add(label, gbc);
		
		setVisible(true);
	}
}
