package DBO;

import java.sql.*;
public class UserDOA {

	
	public Connection mysql;
	//----------------------------------------------
	public UserDOA() {
		this.mysql=MysqlConnexion.getConnection();
	}
	//---------------------------------------------------------

	public int Insert(User u) {
		// TODO Auto-generated method stub
		int ls=0;
		PreparedStatement ps=null;
		
		try {
			String query="insert into users values (?,?)";
			ps=mysql.prepareStatement(query);
			ps.setString(1,u.getLogin());
			ps.setString(2,u.getPasswd());
			ls=ps.executeUpdate();
			
		}catch(SQLException e) {
			System.out.println("Problem In insert users ! ");
		}
		return ls;
	}
	//--------------------------------------------------------
	
	public ResultSet getAll() {
		// TODO Auto-generated method stub
		ResultSet rs=null;
		PreparedStatement ps;
		
		try {
			
			String query="select * from users ";
			ps=mysql.prepareStatement(query);
			rs=ps.executeQuery();
		    return rs;
		}catch(SQLException e) {
			System.out.println("Problem of dispaly All Elements of users  ! ");
		}
		return null;
	}
	
	//---------------------------------------------

	public ResultSet getId(User u) {
		// TODO Auto-generated method stub
		ResultSet rs=null;
		PreparedStatement ps;
		
		try {
			
			String query="select * from users where Login=? ";
			ps=mysql.prepareStatement(query);
			ps.setString(1,u.getLogin());
			rs=ps.executeQuery();
		    return rs;
		}catch(SQLException e) {
			System.out.println("Problem of dispaly your One Element ofusers  ! ");
		}
		return null;
	}
	//---------------------------------------------------
	public int  Find(User u) {
		// TODO Auto-generated method stub
		ResultSet rs=null;
		PreparedStatement ps;
		
		try {
			
			String query="select * from users where Login=? AND Password=? ";
			ps=mysql.prepareStatement(query);
			ps.setString(1,u.getLogin());
			ps.setString(2,u.getPasswd());
			rs=ps.executeQuery();
			rs.next();
		    return rs.getRow();
		}catch(SQLException e) {
			System.out.println("Problem Login Or Password N'existe pas  ! ");
		}
		return -1;
	}
	
	//------------------------------------------------
	
	public void update(String Passwd,String Login) {
		// TODO Auto-generated method stub
		
	PreparedStatement ps;
		
		try {
			
			String query="update users set Password =? where Login=?";
			ps=mysql.prepareStatement(query);
			ps.setString(1,Passwd);
			ps.setString(2,Login);
			ps.executeUpdate();
		    
		}catch(SQLException e) {
			System.out.println("Problem of Update users   ! ");
		}
		
	}
	//--------------------------------------------------

	public void delete(String Login) {
		// TODO Auto-generated method stub
		
	PreparedStatement ps;
		
		try {
			
			String query="delete from users where Login=? ";
			ps=mysql.prepareStatement(query);
			ps.setString(1,Login);
			ps.executeUpdate();
			
		}catch(SQLException e) {
			System.out.println("Problem of delete users  ! ");
		}
	}
	
	

}
