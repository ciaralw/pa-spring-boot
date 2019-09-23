package uk.ac.belfastmet.topten.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.topten.domain.TopTen;

@Service
public class TopTenService {

	private ArrayList<TopTen> topTenSingles;
	
	public ArrayList<TopTen> getTopTenSingles(){
		this.topTenSingles = new ArrayList<TopTen>();
		
		this.topTenSingles.add(new TopTen("1", "Ed Sheeran", "Take Me Back to London", "take.jpg"));
		this.topTenSingles.add(new TopTen("2", "Aitch", "Taste (Make It Shake)", "taste.jpg"));
		this.topTenSingles.add(new TopTen("3", "Kygo & Whitney Houston", "Higher Love", "higher.jpg"));
		this.topTenSingles.add(new TopTen("4", "AJ Tracey", "Ladbroke Grove", "ladbroke.jpg"));
		this.topTenSingles.add(new TopTen("5", "Post Malone", "Circles", "circles.jpg"));
		this.topTenSingles.add(new TopTen("6", "Joel Corry", "Sorry", "sorry.jpg"));
		this.topTenSingles.add(new TopTen("7", "Dominic Fike", "3 Nights", "3.jpg"));
		this.topTenSingles.add(new TopTen("8", "Lil Tecca", "Ransom", "ransom.jpg"));
		this.topTenSingles.add(new TopTen("9", "Young T & Bugsey", "Strike A Pose", "strike.jpg"));
		this.topTenSingles.add(new TopTen("10", "Post Malone", "Goodbyes", "goodbyes.jpg"));
				
		return this.topTenSingles;
	}
	
private ArrayList<TopTen> topTenAlbums;
	
	public ArrayList<TopTen> getTopTenAlbums(){
		this.topTenAlbums = new ArrayList<TopTen>();
		
		this.topTenAlbums.add(new TopTen("1", "Post Malone", "Hollywood's Bleeding", "hollywood.jpg"));
		this.topTenAlbums.add(new TopTen("2", "Ed Sheeran", "No. 6 Collaborations Project", "6.jpg"));
		this.topTenAlbums.add(new TopTen("3", "Aitch", "AitcH2O", "h2o.jpg"));
		this.topTenAlbums.add(new TopTen("4", "Taylor Swift", "Lover", "lover.jpg"));
		this.topTenAlbums.add(new TopTen("5", "Lewis Capaldi", "Divinely Uninspired To A Hellish Extent", "hell.jpg"));
		this.topTenAlbums.add(new TopTen("6", "Status Quo", "Backbone", "back.jpg"));
		this.topTenAlbums.add(new TopTen("7", "Lana Del Ray", "Norman F**king Rockwell", "norman.jpg"));
		this.topTenAlbums.add(new TopTen("8", "Melanie Martinez", "K-12", "k.jpg"));
		this.topTenAlbums.add(new TopTen("9", "Jax Jones", "Snacks", "snacks.jpg"));
		this.topTenAlbums.add(new TopTen("10", "Billie Eilish", "WHEN WE ALL FALL ASLEEP, WHERE DO WE GO?", "when.jpg"));
		
				
		return this.topTenAlbums;
	}
	
	
}
