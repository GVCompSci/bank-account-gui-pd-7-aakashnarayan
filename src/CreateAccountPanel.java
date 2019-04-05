import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreateAccountPanel extends JPanel
{
	public CreateAccountPanel()
	{
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		
		JLabel name = new JLabel("Full Name: ");
		add(name, gbc);
		
		gbc.gridx = 1; 
		gbc.gridwidth =  2;
		JTextField nameTextField = new JTextField();
		nameTextField.setPreferredSize(new Dimension (122,25));
		add(nameTextField, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		JLabel type = new JLabel("Account Type: ");
		add(type, gbc);
		
		gbc.gridx = 2; 
		gbc.gridwidth = 1;
		JComboBox accountType = new JComboBox(new String[] {"Checking", "Savings"});
		accountType.setPreferredSize(new Dimension (100,25));
		add(accountType, gbc);
		
		setVisible(true);
	}
}
