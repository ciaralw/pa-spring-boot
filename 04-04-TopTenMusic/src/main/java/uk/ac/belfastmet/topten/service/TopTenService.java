package uk.ac.belfastmet.topten.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.topten.domain.TopTen;

@Service
public class TopTenService {

	private ArrayList<TopTen> topTenSingles;
	
	public ArrayList<TopTen> getTopTenSingles(){
		this.topTenSingles = new ArrayList<TopTen>();
		
		this.topTenSingles.add(new TopTen("Ed Sheeran", "Take Me Back to London", "take.jpg"));
		this.topTenSingles.add(new TopTen("Aitch", "Taste (Make It Shake)", "taste.jpg"));
		this.topTenSingles.add(new TopTen("Kygo & Whitney Houston", "Higher Love", "higher.jpg"));
		this.topTenSingles.add(new TopTen("AJ Tracey", "Ladbroke Grove", "ladbroke.jpg"));
		this.topTenSingles.add(new TopTen("Post Malone", "Circles", "circles.jpg"));
		this.topTenSingles.add(new TopTen("Joel Corry", "Sorry", "sorry.jpg"));
		this.topTenSingles.add(new TopTen("Dominic Fike", "3 Nights", "3.jpg"));
		this.topTenSingles.add(new TopTen("Lil Tecca", "Ransom", "ransom.jpg"));
		this.topTenSingles.add(new TopTen("Young T & Bugsey", "Strike A Pose", "strike.jpg"));
		this.topTenSingles.add(new TopTen("Post Malone", "Goodbyes", "goodbyes.jpg"));
				
		return this.topTenSingles;
	}
	
private ArrayList<TopTen> topTenAlbums;
	
	public ArrayList<TopTen> getTopTenAlbums(){
		this.topTenAlbums = new ArrayList<TopTen>();
		
		this.topTenAlbums.add(new TopTen("Post Malone", "Hollywood's Bleeding", "hollywood.jpg"));
		this.topTenAlbums.add(new TopTen("Ed Sheeran", "No. 6 Collaborations Project", "6.jpg"));
		this.topTenAlbums.add(new TopTen("Aitch", "AitcH2O", "h2o.jpg"));
		this.topTenAlbums.add(new TopTen("Taylor Swift", "Lover", "lover.jpg"));
		this.topTenAlbums.add(new TopTen("Lewis Capaldi", "Divinely Uninspired To A Hellish Extent", "hell.jpg"));
		this.topTenAlbums.add(new TopTen("Status Quo", "Backbone", "back.jpg"));
		this.topTenAlbums.add(new TopTen("Lana Del Ray", "Norman F**king Rockwell", "norman.jpg"));
		this.topTenAlbums.add(new TopTen("Melanie Martinez", "K-12", "k.jpg"));
		this.topTenAlbums.add(new TopTen("Jax Jones", "Snacks", "snacks.jpg"));
		this.topTenAlbums.add(new TopTen("Billie Eilish", "WHEN WE ALL FALL ASLEEP, WHERE DO WE GO?", "when.jpg"));
		
				
		return this.topTenAlbums;
	}
	
	
}
