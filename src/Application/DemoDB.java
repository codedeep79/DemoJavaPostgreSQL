package Application;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Constant.Database;

public class DemoDB {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			
			System.out.println("Connecting to a selected database...");
			
			Connection conn 
				= DriverManager.getConnection
					(Database.DB_URL, Database.USER, Database.PASSWORD);
			
			System.out.println("Connected database successfully...");
			
			PreparedStatement sql = conn.prepareStatement("SELECT * FROM users.users");
			ResultSet result = sql.executeQuery();
			
			System.out.println("\nList Of Manage: ");
			while(result.next()){
				System.out.println(result.getString(2));
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
		      try
		      {
			 if(conn != null)
			    conn.close();
		      }
		      catch(SQLException se)
		      {
			 se.printStackTrace();
		      }
		}
	}

}
