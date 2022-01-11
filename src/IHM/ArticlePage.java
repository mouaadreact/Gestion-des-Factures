package IHM;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.ScrollPaneConstants;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;


import DBO.ArticleDOA;
import Models.MonModele;
import DBO.Article;

public class ArticlePage{

	JFrame frame;
	private JTextField TextLibelle;
	private JTable Tarticles;
	private JTextField textNewLibelle;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArticlePage window = new ArticlePage();
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
		Tarticles.setModel(new MonModele(new ArticleDOA().getAll()));
	}
	public ArticlePage() {
		initialize();
		Load();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1183, 588);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Add Article");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		//-----------------------------------------------------------
		JButton AddButton = new JButton("ADD\r\n");
		AddButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		//----------------------------------------------------------------
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 BtnAddActionPerformed(e);
			}
		});
		//----------------------------------------------
		TextLibelle = new JTextField();
		TextLibelle.setColumns(10);
		
		JScrollPane Scroll = new JScrollPane();
		
		JButton DeleteButton = new JButton("DELETE");
		DeleteButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		DeleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BtnDeleteActionPerformed(e); 
			}
		});
		//--------------------------------------------------------
		textNewLibelle = new JTextField();
		textNewLibelle.setColumns(10);
		
		JButton UpdateButton = new JButton("UPDATE");
		UpdateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BtnUpdateActionPerformed(e); 
			}
		});
		UpdateButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btnNewButton = new JButton("Return LigneFacture");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BtnReturnLigneFactureActionPerformed(e);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblNewLabel_1 = new JLabel("GESTION ARTICLE ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(39)
							.addComponent(Scroll, GroupLayout.PREFERRED_SIZE, 823, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(326)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
							.addGap(54)
							.addComponent(TextLibelle, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
							.addGap(86)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(AddButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(DeleteButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(423)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(109)
							.addComponent(btnNewButton)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(52)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(UpdateButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(textNewLibelle, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
							.addGap(73))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(94)
									.addComponent(AddButton))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(24)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_1))))
							.addGap(36)
							.addComponent(DeleteButton))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(TextLibelle, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel))
							.addGap(42)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(71)
							.addComponent(textNewLibelle, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(UpdateButton))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(40)
							.addComponent(Scroll, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)))
					.addGap(128))
		);
		
		Tarticles = new JTable();
		Tarticles.setFont(new Font("Tahoma", Font.BOLD, 13));
		Tarticles.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"id", "Libelle"
			}
		));
		Scroll.setViewportView(Tarticles);
		frame.getContentPane().setLayout(groupLayout);
	}
//--------------------------------------------------------------------------------	
	public void BtnAddActionPerformed(ActionEvent e) {
		
		ArticleDOA A=new ArticleDOA();
		String libelle=TextLibelle.getText();
		if(!libelle.equals("")) {
			Article a=new Article(libelle);
			A.Insert(a);
			Load();
			TextLibelle.setText("");
		}
		
		
	}
//------------------------------------------------------------------------------------
	public void BtnDeleteActionPerformed(ActionEvent e) {
		int indice = Tarticles.getSelectedRow(); 
		if(indice!=-1) {
		
			int id =Integer.valueOf((String)Tarticles.getValueAt(indice,0));
		//	System.out.println(id);
			String Libelle=String.valueOf(Tarticles.getValueAt(indice,1));
			ArticleDOA A=new ArticleDOA();
	        A.delete(id);
	        Load();
		}
	}
	
	//---------------------------------------------------------------------------------
	
	public void BtnUpdateActionPerformed(ActionEvent e) {
		int indice = Tarticles.getSelectedRow(); 
		if(indice!=-1) {
		
			int id =Integer.valueOf((String)Tarticles.getValueAt(indice,0));
			String Libelle=textNewLibelle.getText();
			if(!Libelle.equals("")) {
			ArticleDOA A=new ArticleDOA();
			Article a=new Article(Libelle);
	        A.update(a,id);
	        Load();
	        textNewLibelle.setText("");
			}
		}
	}
//-----------------------------------------------------------------------
	
public void BtnReturnLigneFactureActionPerformed(ActionEvent e) {
	 this.frame.dispose();
     LigneFacturePage h=new LigneFacturePage();
      h.frame.setVisible(true);
}
}
