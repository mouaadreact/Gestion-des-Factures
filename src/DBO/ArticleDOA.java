package DBO;

import java.sql.*;
public class ArticleDOA implements CrudDAO{
	
	public Connection mysql;
	//----------------------------------------------
	public ArticleDOA() {
		this.mysql=MysqlConnexion.getConnection();
	}
	//-------------------------------------------
	
	@Override
	public int Insert(Article A) {
		// TODO Auto-generated method stub
		int ls=0;
		PreparedStatement ps=null;
		
		try {
			String query="insert into articles(libelle) values (?)";
			ps=mysql.prepareStatement(query);
			ps.setString(1,A.getLibelle());
			ls=ps.executeUpdate();
			
		}catch(SQLException e) {
			System.out.println("Problem In insert Article ! ");
		}
		return ls;
	}
	//--------------------------------------------------------
	@Override
	public ResultSet getAll() {
		// TODO Auto-generated method stub
		ResultSet rs=null;
		PreparedStatement ps;
		
		try {
			
			String query="select * from articles ";
			ps=mysql.prepareStatement(query);
			rs=ps.executeQuery();
		    return rs;
		}catch(SQLException e) {
			System.out.println("Problem of dispaly All Elements of Articles ! ");
		}
		return null;
	}
	
	//---------------------------------------------
	@Override
	public ResultSet getId(int id) {
		// TODO Auto-generated method stub
		ResultSet rs=null;
		PreparedStatement ps;
		
		try {
			
			String query="select * from articles where id=? ";
			ps=mysql.prepareStatement(query);
			ps.setInt(1,id);
			rs=ps.executeQuery();
		    return rs;
		}catch(SQLException e) {
			System.out.println("Problem of dispaly your One Element of Articles ! ");
		}
		return null;
	}
	
	//------------------------------------------------
	@Override
	public void update(Article A,int id) {
		// TODO Auto-generated method stub
		
	PreparedStatement ps;
		
		try {
			
			String query="update articles set libelle =? where id=?";
			ps=mysql.prepareStatement(query);
			ps.setString(1,A.getLibelle());
			ps.setInt(2,id);
			ps.executeUpdate();
		    
		}catch(SQLException e) {
			System.out.println("Problem of Update Articles  ! ");
		}
		
	}
	//--------------------------------------------------
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	PreparedStatement ps;
		
		try {
			
			String query="delete from articles where id=? ";
			ps=mysql.prepareStatement(query);
			ps.setInt(1,id);
			ps.executeUpdate();
			
		}catch(SQLException e) {
			System.out.println("Problem of delete Articles ! ");
		}
	}
	
	
	

}
