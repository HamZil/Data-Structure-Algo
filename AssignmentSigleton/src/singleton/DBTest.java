package singleton;

import java.sql.Connection;

public class DBTest {

	private static movieModel movie;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		movie = new movieModel("DownUpSide","1996",1);
	
		DBCrud.InsertMovieTable(movie);
		DBCrud.deleteMovie(4);
		DBCrud.ShowAllmembers("movies");
	

	}

}
