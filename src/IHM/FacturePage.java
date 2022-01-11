package IHM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.Window;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import DBO.Article;
import DBO.ArticleDOA;
import DBO.FactureDOA;
import DBO.Partenaire;
import DBO.PartenaireDOA;
import Models.MonModele;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.lang.model.element.TypeParameterElement;
import javax.swing.DefaultComboBoxModel;

public class FacturePage {

	JFrame frame;
	private JTextField textdate;
	private JTextField textIdPartenaire;
	private JTable TFacture;
	private JComboBox TypeFacture ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FacturePage window = new FacturePage();
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
		TFacture.setModel(new MonModele(new FactureDOA().getAll()));
	}
	 public FacturePage() {
	
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
		
		JLabel lblNewLabel = new JLabel("dateFacture");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblNewLabel_1 = new JLabel("IdPartenaire");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblNewLabel_3 = new JLabel("TypeFacture");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		textdate = new JTextField();
		textdate.setColumns(10);
		
		textIdPartenaire = new JTextField();
		textIdPartenaire.setColumns(10);
		
		
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
		
		
	TypeFacture = new JComboBox();
	TypeFacture.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
	TypeFacture.setModel(new DefaultComboBoxModel(new String[] {"vente", "achat"}));
	//----------------------------------------------------------------------------------	
		JButton btnNewButton = new JButton("Show Partenaire");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BtnShowActionPerformed(e); 
				 
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JButton btnReturnHome = new JButton("Return Home");
		btnReturnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BtnReturnHomeActionPerformed(e); 
			}
		});
		btnReturnHome.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btnShowLigneFacture = new JButton("Show LigneFacture");
		btnShowLigneFacture.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BtnShowLigneFactureActionPerformed(e);
			}
		});
		btnShowLigneFacture.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblNewLabel_2 = new JLabel("GESTION FACTURES");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
	
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(33)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textdate, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
							.addGap(44)
							.addComponent(lblNewLabel_1)
							.addGap(18)
							.addComponent(textIdPartenaire, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
							.addGap(28)
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
							.addGap(38)
							.addComponent(TypeFacture, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(274)
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 307, GroupLayout.PREFERRED_SIZE)))
					.addGap(92)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnUpdate, GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
						.addComponent(btnDelete, GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
						.addComponent(btnAdd, GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
						.addComponent(btnReturnHome, GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
					.addGap(40))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(32)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 930, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
						.addComponent(btnShowLigneFacture, GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(32)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnReturnHome)
						.addComponent(lblNewLabel_2))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(47)
							.addComponent(btnAdd)
							.addGap(18)
							.addComponent(btnDelete)
							.addGap(18)
							.addComponent(btnUpdate)
							.addGap(136)
							.addComponent(btnShowLigneFacture)
							.addGap(32)
							.addComponent(btnNewButton)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(53)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(TypeFacture, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
											.addComponent(lblNewLabel_3)
											.addComponent(textIdPartenaire, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblNewLabel_1))))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(47)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(textdate, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel))))
							.addPreferredGap(ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 334, GroupLayout.PREFERRED_SIZE)
							.addGap(75))))
		);
		
		TFacture = new JTable();
		TFacture.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "DateFacture", "PartenaireId", "TypeFacture"
			}
		));
		scrollPane.setViewportView(TFacture);
		frame.getContentPane().setLayout(groupLayout);
	
	}
	
	//--------------------------------------------------------------------------------	
		public void BtnAddActionPerformed(ActionEvent e) {
			
			FactureDOA F=new FactureDOA();
			
			
			String date=textdate.getText();
			String TypeFact=(String)TypeFacture.getSelectedItem();
			
			
			if(!(date.equals("")||textIdPartenaire.getText().equals(""))){
				Integer idPart=Integer.valueOf(textIdPartenaire.getText());
				F.Insert(date,idPart,TypeFact);
				Load();
				textdate.setText("");
				textIdPartenaire.setText("");	
			}
			
		}
	//------------------------------------------------------------------------------------
		public void BtnDeleteActionPerformed(ActionEvent e) {
			int indice = TFacture.getSelectedRow(); 
			if(indice!=-1) {
			
				int id =Integer.valueOf((String) TFacture.getValueAt(indice,0));
				FactureDOA F=new FactureDOA();
		        F.delete(id);
		        Load();
			}
		}
		
		//---------------------------------------------------------------------------------
		
		public void BtnUpdateActionPerformed(ActionEvent e) {
			int indice = TFacture.getSelectedRow(); 
			if(indice!=-1) {
				
				
				FactureDOA F=new FactureDOA();
				
				int id =Integer.valueOf((String)TFacture.getValueAt(indice,0));
			    
				String date=textdate.getText().equals("") ? String.valueOf(TFacture.getValueAt(indice,1)) : textdate.getText();
				
				String TypeFct=String.valueOf(TypeFacture.getSelectedItem()) ;
				
				String valueId=textIdPartenaire.equals("") ? String.valueOf(TFacture.getValueAt(indice,2)):textIdPartenaire.getText();
				Integer idPart=Integer.valueOf(valueId);
				
		
			
		        F.update(date,idPart,TypeFct,id);
		        Load();
		        
		        textdate.setText("");
				textIdPartenaire.setText("");
				}
		        
			
		}
		
//------------------------------------------------------------------------
		public void BtnShowActionPerformed(ActionEvent e) {
			this.frame.dispose();
		PartenairePage p = new PartenairePage();
			p.frame.setVisible(true);
		}
//--------------------------------------------------------------------
		public void BtnShowLigneFactureActionPerformed(ActionEvent e) {
			this.frame.dispose();
			LigneFacturePage p = new LigneFacturePage();
			p.frame.setVisible(true);
		}
//----------------------------------------------------------------------
		public void BtnReturnHomeActionPerformed(ActionEvent e) {
			 this.frame.dispose();
		      HomePage h=new HomePage();
		       h.frame.setVisible(true);
		}
//--------------------------------------------------------------------------------
	
}
