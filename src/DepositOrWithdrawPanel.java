import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DepositOrWithdrawPanel extends JPanel
{
	public DepositOrWithdrawPanel()
	{
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		
		gbc.gridwidth = 1;
		JLabel label = new JLabel("Amount: ");
		add(label, gbc);
		
		gbc.gridx = 1;
		JTextField textField = new JTextField();
		textField.setPreferredSize(new Dimension(100,25));
		add(textField, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		JComboBox choice = new JComboBox(new String[] {"Deposit","Withdraw"});
		choice.setPreferredSize(new Dimension(150,25));
		add(choice, gbc);
		
		setVisible(true);
	}
}
