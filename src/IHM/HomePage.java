package IHM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

public class HomePage {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage window = new HomePage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HomePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 547, 551);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Welcome To Home Page Admin !");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		
		JButton btnShowFactures = new JButton("Gerer Factures");
		btnShowFactures.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BtnShowFactureActionPerformed(e);
			}
		});
		btnShowFactures.setFont(new Font("Tahoma", Font.BOLD, 15));
		
	//---------------------------------------------------------------------
		JButton btnShowUtilisateurs = new JButton("Gerer utilisateurs");
		btnShowUtilisateurs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BtnShowUserActionPerformed(e);
			}
		});
		btnShowUtilisateurs.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton btnNewButton = new JButton("Return Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BtnReturnLoginActionPerformed(e);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(168)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnShowFactures, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnShowUtilisateurs, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(200, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(123, Short.MAX_VALUE)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 330, GroupLayout.PREFERRED_SIZE)
					.addGap(80))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(87)
					.addComponent(lblNewLabel)
					.addGap(69)
					.addComponent(btnShowFactures)
					.addGap(28)
					.addComponent(btnShowUtilisateurs)
					.addGap(85)
					.addComponent(btnNewButton)
					.addContainerGap(149, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
//------------------------------------------------------------------------
	public void BtnShowFactureActionPerformed(ActionEvent e){
	    this.frame.dispose();
		FacturePage p = new FacturePage();
		p.frame.setVisible(true);
	}
//---------------------------------------------------------------------------
	public void BtnShowUserActionPerformed(ActionEvent e) {
		this.frame.dispose();
		UserPage u = new UserPage();
		 u.setVisible(true);
	}
//---------------------------------------------------------------------------
	public void BtnReturnLoginActionPerformed(ActionEvent e) {
		this.frame.dispose();
		Login u = new Login();
		 u.frame.setVisible(true);
	}
}
