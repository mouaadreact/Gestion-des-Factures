package DBO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LigneFactureDOA {

public Connection mysql;
//----------------------------------------------
public LigneFactureDOA() {
	this.mysql=MysqlConnexion.getConnection();
}
//-------------------------------------------


public int Insert(double prix,int qt,int IdFacture,int IdArticle) {
	// TODO Auto-generated method stub
	int ls=0;
	PreparedStatement ps=null;
	
	try {
		String query="insert into lignefactures(articleId,factureId,prix,qte) values (?,?,?,?)";
		ps=mysql.prepareStatement(query);
		
		
		ps.setInt(1,IdArticle);
		ps.setInt(2, IdFacture);
		ps.setDouble(3,prix);
		ps.setInt(4,qt);
		
		
		ls=ps.executeUpdate();
		
	}catch(SQLException e) {
		System.out.println("Problem In insert lignefactures ! ");
	}
	return ls;
}
//--------------------------------------------------------

public ResultSet getAll() {
	// TODO Auto-generated method stub
	ResultSet rs=null;
	PreparedStatement ps;
	
	try {
		
		String query="select * from lignefactures ";
		ps=mysql.prepareStatement(query);
		rs=ps.executeQuery();
	    return rs;
	}catch(SQLException e) {
		System.out.println("Problem of dispaly All Elements of lignefactures ! ");
	}
	return null;
}

//---------------------------------------------
public ResultSet getId(int id) {
	// TODO Auto-generated method stub
	ResultSet rs=null;
	PreparedStatement ps;
	
	try {
		
		String query="select * from lignefactures where id=? ";
		ps=mysql.prepareStatement(query);
		ps.setInt(1,id);
		rs=ps.executeQuery();
	    return rs;
	}catch(SQLException e) {
		System.out.println("Problem of dispaly your One Element of lignefactures ! ");
	}
	return null;
}

//------------------------------------------------

public void update(int id,int idFacture,int idArticle,double prix , int qte) {
	// TODO Auto-generated method stub
	
PreparedStatement ps;
	
	try {
		
		String query="update lignefactures set articleId =?,factureId=?,prix=?,qte=?  where id=?";
		ps=mysql.prepareStatement(query);
		
		ps.setInt(1,idArticle);
		ps.setInt(2,idFacture);
		ps.setDouble(3,prix);
		ps.setInt(4,qte);
		ps.setInt(5,id);
		
		ps.executeUpdate();
	    
	}catch(SQLException e) {
		System.out.println("Problem of Updatelignefactures ! ");
	}
	
}
//--------------------------------------------------

public void delete(int id) {
	// TODO Auto-generated method stub
	
PreparedStatement ps;
	
	try {
		
		String query="delete from lignefactures where id=? ";
		ps=mysql.prepareStatement(query);
		ps.setInt(1,id);
		ps.executeUpdate();
		
	}catch(SQLException e) {
		System.out.println("Problem of delete lignefactures ! ");
	}
}


}

