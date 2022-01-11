package DBO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FactureDOA {
	

public Connection mysql;
//----------------------------------------------
public FactureDOA() {
	this.mysql=MysqlConnexion.getConnection();
}
//-------------------------------------------


public int Insert(String dateFacture,int idPartenaire,String typeFacture) {
	// TODO Auto-generated method stub
	int ls=0;
	PreparedStatement ps=null;
	
	try {
		String query="insert into factures(dateFacture,partenaireId,typeFacture) values (?,?,?)";
		ps=mysql.prepareStatement(query);
		
		
		ps.setString(1,dateFacture);
		ps.setInt(2,idPartenaire);
		ps.setString(3,typeFacture);
		
		ls=ps.executeUpdate();
		
	}catch(SQLException e) {
		System.out.println("Problem In insert factures ! ");
	}
	return ls;
}
//--------------------------------------------------------

public ResultSet getAll() {
	// TODO Auto-generated method stub
	ResultSet rs=null;
	PreparedStatement ps;
	
	try {
		
		String query="select * from factures ";
		ps=mysql.prepareStatement(query);
		rs=ps.executeQuery();
	    return rs;
	}catch(SQLException e) {
		System.out.println("Problem of dispaly All Elements of factures ! ");
	}
	return null;
}

//---------------------------------------------
public ResultSet getId(int id) {
	// TODO Auto-generated method stub
	ResultSet rs=null;
	PreparedStatement ps;
	
	try {
		
		String query="select * from factures where id=? ";
		ps=mysql.prepareStatement(query);
		ps.setInt(1,id);
		rs=ps.executeQuery();
	    return rs;
	}catch(SQLException e) {
		System.out.println("Problem of dispaly your One Element of factures ! ");
	}
	return null;
}

//------------------------------------------------

public void update(String dateFacture,int idPartenaire,String typeFacture,int id) {
	// TODO Auto-generated method stub
	
PreparedStatement ps;
	
	try {
		
		String query="update factures set dateFacture =?,partenaireId=?,typeFacture=? where id=?";
		ps=mysql.prepareStatement(query);
		
		ps.setString(1,dateFacture);
		ps.setInt(2,idPartenaire);
		ps.setString(3,typeFacture);
		ps.setInt(4,id);
		
		ps.executeUpdate();
	    
	}catch(SQLException e) {
		System.out.println("Problem of Update factures ! ");
	}
	
}
//--------------------------------------------------

public void delete(int id) {
	// TODO Auto-generated method stub
	
PreparedStatement ps;
	
	try {
		
		String query="delete from factures where id=? ";
		ps=mysql.prepareStatement(query);
		ps.setInt(1,id);
		ps.executeUpdate();
		
	}catch(SQLException e) {
		System.out.println("Problem of delete factures ! ");
	}
}



}
