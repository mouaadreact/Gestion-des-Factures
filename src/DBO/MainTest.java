package DBO;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MainTest {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		
	    LigneFactureDOA A=new LigneFactureDOA();
		Article a=new Article("chipse");
	    LigneFacture L=new LigneFacture(a,12,100);
	    
	    LigneFacture L1=new LigneFacture(a,1,134);
	    
		
		//int i=A.Insert(L,6,1);
		//int j=A.Insert(L,4,1);
		//A.update(3,4,1,120,10); //int id,int idFacture,int idArticle,double prix , int qte
		//A.delete(4);
	/*	ResultSet s=A.getAll();
		while(s.next()) {
			System.out.println(s.getInt(1)+" -- "+s.getInt(2)+" -- "+s.getInt(3)+" -- "+s.getDouble(4)+" -- "+s.getInt(5));
		}*/
	
		
		/*Partenaire p=new Partenaire("Ahmed","rue 12 tanger","Facebook","client"); // String contactPartenaire
		//Partenaire p1=new Partenaire("Yosef","rue 14 tanger","Linkden","fournisseur");
		PartenaireDOA P=new PartenaireDOA() ;
		/*int i=P.Insert(p);
		int j=P.Insert(p1);*/
	/*	P.delete(19);
		
		ResultSet s=P.getAll();
		while(s.next()) {
			System.out.println(s.getInt(1)+" "+s.getString(2)+" "+s.getString(3)+" "+s.getString(4)+" "+s.getString(5));
		}*/
		
		
	
		
		
		
	}

}
