package singleton;

public class movieModel {
	
	private int movie_id;
	private String name ,  releaseYear ;
	private int producer_id;
	
	
	public movieModel(int movie_id, String name, String releaseYear, int producer_id) {
		super();
		this.movie_id = movie_id;
		this.name = name;
		this.releaseYear = releaseYear;
		this.producer_id = producer_id;
	}


	public movieModel(String name, String releaseYear, int producer_id) {
		super();
		this.name = name;
		this.releaseYear = releaseYear;
		this.producer_id = producer_id;
	}


	public int getMovie_id() {
		return movie_id;
	}


	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getReleaseYear() {
		return releaseYear;
	}


	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}


	public int getProducer_id() {
		return producer_id;
	}


	public void setProducer_id(int producer_id) {
		this.producer_id = producer_id;
	}
	
	
	
	
	

	
	
	
	

}
