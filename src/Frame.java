import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Frame extends JFrame 
{
	public Frame()
	{
		setBounds(150,150,800,400);
		
		//Menu Stuff
		JMenuBar menuBar = new JMenuBar();
		
			JMenu account = new JMenu("Account");
				
				JMenuItem add = new JMenuItem("Add Account");
					account.add(add);
				JMenuItem remove = new JMenuItem("Remove Account");
					account.add(remove);
			menuBar.add(account);		
			
			JMenu transactions = new JMenu("Transactions");
				
				JMenuItem depositOrWithdraw = new JMenuItem("Deposit or Withdraw");
					transactions.add(depositOrWithdraw);
				JMenuItem transfer = new JMenuItem("Transfer");
					transactions.add(transfer);
			menuBar.add(transactions);
			
			JMenu home = new JMenu("Home");
				menuBar.add(home);	
			
		JPanel hostPanel = new JPanel();
		CardLayout cardLayout = new CardLayout();
		hostPanel.setLayout(cardLayout);
		
		
		setJMenuBar(menuBar);
		setVisible(true);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) 
	{
		Frame frame = new Frame();
	}

}
