package IHM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import DBO.Article;
import DBO.ArticleDOA;
import DBO.Partenaire;
import DBO.PartenaireDOA;
import Models.MonModele;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.lang.model.element.TypeParameterElement;
import javax.swing.DefaultComboBoxModel;

public class PartenairePage {

	JFrame frame;
	private JTextField textNom;
	private JTextField textAdresse;
	private JTextField textContact;
	private JTable Tpartenaire;
	private JComboBox TypePartenaire ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PartenairePage window = new PartenairePage();
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

	void Load() {
		Tpartenaire.setModel(new MonModele(new PartenaireDOA().getAll()));
	}
	 public PartenairePage() {
	
		initialize();
		Load();
	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1215, 592);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Nom");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblNewLabel_1 = new JLabel("Adresse");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblNewLabel_2 = new JLabel("Contact\r\n");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblNewLabel_3 = new JLabel("TypePartenaire");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		textNom = new JTextField();
		textNom.setColumns(10);
		
		textAdresse = new JTextField();
		textAdresse.setColumns(10);
		
		textContact = new JTextField();
		textContact.setColumns(10);
		
		
		JButton btnAdd = new JButton("ADD\r\n");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BtnAddActionPerformed(e);
			}
		});
		
	//-----------------------------------------------------------------
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BtnDeleteActionPerformed(e); 
				
			}
		});
	//------------------------------------------------------------------
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btnUpdate = new JButton("UPDATE\r\n");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BtnUpdateActionPerformed(e); 
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 14));
		//-------------------------------------------------------
		JScrollPane scrollPane = new JScrollPane();
		
		
	TypePartenaire = new JComboBox();
	TypePartenaire.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
	TypePartenaire.setModel(new DefaultComboBoxModel(new String[] {"client", "fournisseur"}));
		
		JButton btnReturnFacture = new JButton("Return Facture");
		btnReturnFacture.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BtnReturnFactureActionPerformed(e); 
			}
		});
		btnReturnFacture.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblNewLabel_4 = new JLabel("GESTION PARTENAIRE");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
	
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(32)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 944, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(28)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textNom, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
							.addGap(31)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textAdresse, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textContact, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(TypePartenaire, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE)
							.addGap(439)))
					.addGap(45)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnReturnFacture)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnUpdate, GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnAdd, GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addComponent(btnDelete, GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
							.addContainerGap(30, GroupLayout.PREFERRED_SIZE))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(20)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnReturnFacture)
						.addComponent(lblNewLabel_4))
					.addPreferredGap(ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textNom, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1)
						.addComponent(textAdresse, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2)
						.addComponent(textContact, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3)
						.addComponent(TypePartenaire, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAdd))
					.addGap(27)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 334, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnDelete)
							.addGap(35)
							.addComponent(btnUpdate)))
					.addGap(73))
		);
		
		Tpartenaire = new JTable();
		Tpartenaire.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "Adresse", "Contact", "TypePartenaire", "Nom"
			}
		));
		scrollPane.setViewportView(Tpartenaire);
		frame.getContentPane().setLayout(groupLayout);
	
	}
	
	//--------------------------------------------------------------------------------	
		public void BtnAddActionPerformed(ActionEvent e) {
			
			PartenaireDOA Pd=new PartenaireDOA();
			String Nom=textNom.getText();
			String Adresse=textAdresse.getText();
			String Contact =textContact.getText();
			String TypePart=(String)TypePartenaire.getSelectedItem();
			
			
			if(!(Nom.equals("")||Adresse.equals("")||Contact.equals(""))){
				Partenaire p=new Partenaire(Nom,Adresse,Contact,TypePart);
				Pd.Insert(p);
				Load();
				textNom.setText("");
				textAdresse.setText("");
				textContact.setText("");
			}
			
		}
	//------------------------------------------------------------------------------------
		public void BtnDeleteActionPerformed(ActionEvent e) {
			int indice = Tpartenaire.getSelectedRow(); 
			if(indice!=-1) {
			
				int id =Integer.valueOf((String) Tpartenaire.getValueAt(indice,0));
				PartenaireDOA Pd=new PartenaireDOA();
		        Pd.delete(id);
		        Load();
			}
		}
		
		//---------------------------------------------------------------------------------
		
		public void BtnUpdateActionPerformed(ActionEvent e) {
			int indice = Tpartenaire.getSelectedRow(); 
			if(indice!=-1) {
			
				int id =Integer.valueOf((String)Tpartenaire.getValueAt(indice,0));
				PartenaireDOA Pd=new PartenaireDOA();
				
				String Adresse=textAdresse.getText().equals("") ? String.valueOf(Tpartenaire.getValueAt(indice,1)) : textAdresse.getText();
				String Contact =textContact.getText().equals("") ? String.valueOf(Tpartenaire.getValueAt(indice,2)) : textContact.getText();
				String TypePart=(String)TypePartenaire.getSelectedItem();
				String Nom=textNom.getText().equals("") ? String.valueOf(Tpartenaire.getValueAt(indice,4)) : textNom.getText();
				
		
				
				Partenaire p=new Partenaire(Nom,Adresse,Contact,TypePart);
			
		        Pd.update(p,id);
		        Load();
		        
		        textNom.setText("");
				textAdresse.setText("");
				textContact.setText("");
				}
		        
			
		}
//----------------------------------------------------------------------------
		public void BtnReturnFactureActionPerformed(ActionEvent e) {
			 this.frame.dispose();
		      FacturePage h=new FacturePage();
		       h.frame.setVisible(true);
		}
}
