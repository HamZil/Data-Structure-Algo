package singleton;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBCrud {
	
	public static boolean InsertMovieTable(movieModel movie) {

		
		boolean flag = false ;
		
		try {
			Connection con = DBConnector.getInstance();
			String query = "insert into movies (name ,  releaseYear , producer_id ) value (?,?,?);";
			
			//PreparedStatement  (dynamic Statment)
			PreparedStatement pStmt = con.prepareStatement(query);
			
			//Seting up parameters
			pStmt.setString(1, movie.getName());
			pStmt.setString(2, movie.getReleaseYear());
			pStmt.setInt(3, movie.getProducer_id());
			
			pStmt.executeUpdate();
			flag = true ;
					
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
		
		return flag ;
		
	}

	public static boolean deleteMovie(int movie_id) {
		// TODO Auto-generated method stub
		boolean flag = false ;
		
		try {
			Connection con = DBConnector.getInstance();
			String query = "delete from movies where movies_id=?;";
			
			//PreparedStatement  (dynamic Statement)
			PreparedStatement pStmt = con.prepareStatement(query);
			
			//Setting up parameters
			pStmt.setInt(1, movie_id);
			
			pStmt.executeUpdate();
			flag = true ;
					
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
		
		return flag ;
	}

	public static void ShowAllmembers(String tablename) {
		// TODO Auto-generated method stub
		
		try {
			Connection con = DBConnector.getInstance();
			String query = "Select * from movies;";
			
			//PreparedStatement  (dynamic Statement)
			Statement pStmt = con.createStatement();
			
			
			ResultSet set = pStmt.executeQuery(query);
			
			while(set.next()) {
				
				int movieid = set.getInt(1);
				String name =  set.getString(2);
				String relase = set.getString(3);
				int producerId = set.getInt(4);
				
				System.out.print("Movie_id  : "+movieid + "  ");
				System.out.print("Movie Name  : "+name + "  ");
				System.out.print("Movie Release year : "+relase + "  ");
				System.out.println("Producer_id  : "+producerId + "  ");
				
			}
						
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
		
	}

	public static void UpdatememberName(String Moviename , int id) {
		// TODO Auto-generated method stub
		

		
		try {
			Connection con = DBConnector.getInstance();
			String query = "UPDATE movies SET name = ? WHERE movies_id = ?;";
			
			//PreparedStatement  (dynamic Statement)
			PreparedStatement pStmt = con.prepareStatement(query);
			
			//Setting up parameters
			pStmt.setString(1, Moviename);
			pStmt.setInt(2, 1);
			
			pStmt.executeUpdate();
			
					
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
		
		
	}

}
