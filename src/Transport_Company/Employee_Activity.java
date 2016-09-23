package Transport_Company;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Employee_Activity extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Employee_Activity dialog = new Employee_Activity(null);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Employee_Activity(String branchid) {
		setTitle("Employee Activity");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblWhatDoYou = new JLabel("What do You Want to do?");
			lblWhatDoYou.setFont(new Font("Verdana", Font.BOLD, 16));
			lblWhatDoYou.setBounds(90, 11, 245, 14);
			contentPanel.add(lblWhatDoYou);
		}
		{
			JButton btnEnterConsignmentDetails = new JButton("Enter Consignment Details");
			btnEnterConsignmentDetails.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						Details_Consignment dialog = new Details_Consignment(branchid);
						dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
						dialog.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			btnEnterConsignmentDetails.setBounds(101, 60, 202, 23);
			contentPanel.add(btnEnterConsignmentDetails);
		}
		{
			JButton btnShowBill = new JButton("Show Bill");
			btnShowBill.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						Query_Consignment dialog = new Query_Consignment(true);
						dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
						dialog.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			btnShowBill.setBounds(101, 122, 202, 23);
			contentPanel.add(btnShowBill);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton cancelButton = new JButton("Close");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
