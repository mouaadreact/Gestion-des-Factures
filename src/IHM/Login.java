package IHM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import DBO.UserDOA;
import DBO.User;

public class Login {

	JFrame frame;
	private JTextField textLogin;
	private JTextField textPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 589, 549);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textLogin = new JTextField();
		textLogin.setColumns(10);
		
		textPassword = new JTextField();
		textPassword.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("LOGIN PAGE\r\n\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BtnSubmitActionPerformed(e);
			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_1 = new JLabel("Login");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(255, Short.MAX_VALUE)
					.addComponent(btnSubmit)
					.addGap(237))
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap(109, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
									.addGap(47))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
									.addGap(26)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textLogin, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
								.addComponent(textPassword, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))))
					.addGap(210))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(87)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(38)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textLogin, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addGap(39)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textPassword, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2))
					.addGap(41)
					.addComponent(btnSubmit)
					.addContainerGap(178, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
	//-------------------------------------------------------------
	
	public void BtnSubmitActionPerformed(ActionEvent e){
		UserDOA user=new UserDOA();
		User u=new User(textLogin.getText(),textPassword.getText());
		if(textLogin.getText().equals("")||textPassword.getText().equals("")) {
			JOptionPane.showMessageDialog(frame,"Login Or Password is Empty !!  ");
		}else {
			//System.out.println(user.Find(u));
			if(user.Find(u)<=0) {
				JOptionPane.showMessageDialog(frame,"Login Or Password Fault !!  ");
				
			}else {
				//JOptionPane.showMessageDialog(frame,"Login Sucessufly !!  ");
				this.frame.dispose();
				HomePage p=new HomePage();
				p.frame.setVisible(true);
			}
			
		}
		
	}
	
	
}
