package DBO;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PartenaireDOA {
	

public Connection mysql;
//----------------------------------------------
 public PartenaireDOA() {
	// TODO Auto-generated constructor stub
	 this.mysql=MysqlConnexion.getConnection();
}
//-------------------------------------------


public int Insert(Partenaire p) {
	// TODO Auto-generated method stub
	int ls=0;
	PreparedStatement ps=null;
	
	try {
		String query="insert into partenaires(adresse,contact,typePartenaire,Nom) values (?,?,?,?)";
		ps=mysql.prepareStatement(query);
		
		
		ps.setString(1,p.getAdressePartenaire());
		ps.setString(2,p.getContactPartenaire());
		ps.setString(3,p.getTypePartenaire());
		ps.setString(4,p.getNomPartenaire());
		
		ls=ps.executeUpdate();
		
	}catch(SQLException e) {
		System.out.println("Problem In insert partenaires ! ");
	}
	return ls;
}
//--------------------------------------------------------

public ResultSet getAll() {
	// TODO Auto-generated method stub
	ResultSet rs=null;
	PreparedStatement ps;
	
	try {
		
		String query="select * from partenaires ";
		ps=mysql.prepareStatement(query);
		rs=ps.executeQuery();
	    return rs;
	}catch(SQLException e) {
		System.out.println("Problem of dispaly All Elements of partenaires ! ");
	}
	return null;
}

//---------------------------------------------
public ResultSet getId(int id) {
	// TODO Auto-generated method stub
	ResultSet rs=null;
	PreparedStatement ps;
	
	try {
		
		String query="select * from partenaires where id=? ";
		ps=mysql.prepareStatement(query);
		ps.setInt(1,id);
		rs=ps.executeQuery();
	    return rs;
	}catch(SQLException e) {
		System.out.println("Problem of dispaly your One Element of partenaires ! ");
	}
	return null;
}

//------------------------------------------------

public void update(Partenaire p,int id) {
	// TODO Auto-generated method stub
	
PreparedStatement ps;
	
	try {
		
		String query="update partenaires set adresse=?,contact=?,typePartenaire=?,Nom=? where id=?";
		ps=mysql.prepareStatement(query);
		
		ps.setString(1,p.getAdressePartenaire());
		ps.setString(2,p.getContactPartenaire());
		ps.setString(3,p.getTypePartenaire());
		ps.setString(4,p.getNomPartenaire());
		ps.setInt(5,id);
		
		ps.executeUpdate();
	    
	}catch(SQLException e) {
		System.out.println("Problem of Update partenaires ! ");
	}
	
}
//--------------------------------------------------

public void delete(int id) {
	// TODO Auto-generated method stub
	
PreparedStatement ps;
	
	try {
		
		String query="delete from partenaires where id=? ";
		ps=mysql.prepareStatement(query);
		ps.setInt(1,id);
		ps.executeUpdate();
		
	}catch(SQLException e) {
		System.out.println("Problem of delete partenaires ! ");
	}
}




}
