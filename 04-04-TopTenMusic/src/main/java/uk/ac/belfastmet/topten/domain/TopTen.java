package uk.ac.belfastmet.topten.domain;

public class TopTen {

	//instance variables - properties
	private String position;
	private String artist;
	private String title;
	private String image;
		
	//Constructors
	public TopTen() {
		super();
	}
	
	public TopTen(String position, String artist, String title, String image) {
		super();
		this.position = position;
		this.artist = artist;
		this.title = title;
		this.image = image;
	}
	
	//Getters and setters
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}	
	
		
	public String toString() {
		return artist + " " + title;
	}
}
