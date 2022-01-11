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
import DBO.FactureDOA;
import DBO.LigneFactureDOA;
import DBO.Partenaire;
import DBO.PartenaireDOA;
import Models.MonModele;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.lang.model.element.TypeParameterElement;
import javax.swing.DefaultComboBoxModel;

public class LigneFacturePage {

	JFrame frame;
	private JTextField textarticleId;
	private JTextField textIdFacture;
	private JTable TFacture;
	private JTextField textPrix;
	private JTextField textQuantite;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LigneFacturePage window = new LigneFacturePage();
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
		TFacture.setModel(new MonModele(new LigneFactureDOA().getAll()));
	}
	 public LigneFacturePage() {
	
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
		
		JLabel lblNewLabel = new JLabel("IdArticle");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblNewLabel_1 = new JLabel("IdFacture");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblNewLabel_3 = new JLabel("Prix");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		textarticleId = new JTextField();
		textarticleId.setColumns(10);
		
		textIdFacture = new JTextField();
		textIdFacture.setColumns(10);
		
		
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
		
		textPrix = new JTextField();
		textPrix.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Qantite");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		textQuantite = new JTextField();
		textQuantite.setColumns(10);
		
		JButton btnNewButton = new JButton("Return Facture");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BtnReturnHomeActionPerformed(e);
				
			}
		});
//-----------------------------------------------------
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JButton btnNewButton_1 = new JButton("Show Article");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BtnShowArticleActionPerformed(e);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblNewLabel_4 = new JLabel("GESTION LIGNE FACTURES");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
	
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textarticleId, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
									.addGap(46)
									.addComponent(lblNewLabel_1)
									.addGap(18)
									.addComponent(textIdFacture, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
									.addGap(31)
									.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textPrix, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
									.addGap(27)
									.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(textQuantite, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 944, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(47)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(btnAdd, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
										.addComponent(btnDelete, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
										.addComponent(btnUpdate, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(322)
							.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 286, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 394, Short.MAX_VALUE)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)))
					.addGap(21))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(lblNewLabel_4))
					.addGap(78)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAdd)
						.addComponent(lblNewLabel)
						.addComponent(textarticleId, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1)
						.addComponent(textIdFacture, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3)
						.addComponent(textPrix, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2)
						.addComponent(textQuantite, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
					.addComponent(btnDelete)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 334, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(22)
							.addComponent(btnUpdate)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnNewButton_1)
							.addGap(54))))
		);
		
		TFacture = new JTable();
		TFacture.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "IdArticle", "IdFacture", "Prix", "Quantite"
			}
		));
		scrollPane.setViewportView(TFacture);
		frame.getContentPane().setLayout(groupLayout);
	
	}
	
	//--------------------------------------------------------------------------------	
		public void BtnAddActionPerformed(ActionEvent e) {
			
			LigneFactureDOA F=new LigneFactureDOA();
		
			
			
			if(!(textarticleId.equals("")||textIdFacture.getText().equals("")||textPrix.equals("")||textQuantite.equals(""))){
				
				
				Integer idArticle=Integer.valueOf(textarticleId.getText());
				Integer idFacture=Integer.valueOf(textIdFacture.getText());
				
				double  prix=Double.valueOf(textPrix.getText());
				Integer Qt=Integer.valueOf(textQuantite.getText());
			
				
				F.Insert(prix,Qt,idFacture,idArticle);
				Load();
				textarticleId.setText("");
				textIdFacture.setText("");	
				textPrix.setText("");
				textQuantite.setText("");
				
				
			}
			
		}
	//------------------------------------------------------------------------------------
		public void BtnDeleteActionPerformed(ActionEvent e) {
			int indice = TFacture.getSelectedRow(); 
			if(indice!=-1) {
			
				int id =Integer.valueOf((String) TFacture.getValueAt(indice,0));
				LigneFactureDOA F=new LigneFactureDOA();
		        F.delete(id);
		        Load();
			}
		}
		
		//---------------------------------------------------------------------------------
		
		public void BtnUpdateActionPerformed(ActionEvent e) {
			int indice = TFacture.getSelectedRow(); 
			if(indice!=-1) {
				
				
				LigneFactureDOA F=new LigneFactureDOA();
				
				int id =Integer.valueOf((String)TFacture.getValueAt(indice,0));
				
				String idA=textarticleId.getText().equals("") ? String.valueOf(TFacture.getValueAt(indice,1)) : textarticleId.getText();
				String idF=textIdFacture.getText().equals("") ? String.valueOf(TFacture.getValueAt(indice,2)) : textIdFacture.getText();
				
				
				String prixV=textPrix.getText().equals("") ? String.valueOf(TFacture.getValueAt(indice,3)) : textPrix.getText();
				String qtV=textQuantite.getText().equals("") ? String.valueOf(TFacture.getValueAt(indice,4)) : textQuantite.getText();
				
		
			
				Integer idArticle=Integer.valueOf(idA);
				Integer idFacture=Integer.valueOf(idF);
				
				double  prix=Double.valueOf(prixV);
				Integer Qt=Integer.valueOf(qtV);
				
				
		        F.update(id,idFacture,idArticle,prix,Qt);
		        Load();
		        
		        textarticleId.setText("");
				textIdFacture.setText("");
				textPrix.setText("");
				textQuantite.setText("");
				
				}	
		}
//--------------------------------------------------------------------------------------------------------------------
		
		public void BtnReturnHomeActionPerformed(ActionEvent e) {
			 this.frame.dispose();
		      FacturePage h=new FacturePage();
		       h.frame.setVisible(true);
		}
//-----------------------------------------------------------------------------------------------------
		public void BtnShowArticleActionPerformed(ActionEvent e) {
			this.frame.dispose();
		      ArticlePage A=new ArticlePage();
		       A.frame.setVisible(true);
		}
}
