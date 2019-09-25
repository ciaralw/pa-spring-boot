package uk.ac.belfastmet.dwarfs.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author WAR14101792
 *
 */

@Entity
@Table(name = "disney_dwarfs")
public class Dwarf {

	//instance variables - properties
	private long id;
	private String name;
	private int age;
	private String topColour;
	private String height;
	private boolean hasBeard;
	
	//Constructors	
	public Dwarf() {
		super();
	}

	/**
	 * 
	 * @param id - long id - auto incremented id
	 * @param name - String name
	 * @param age - int age
	 * @param topColour - String topColour
	 * @param height - String height
	 * @param hasBeard - boolean hasBeard
	 */
	public Dwarf(long id, String name, int age, String topColour, String height, boolean hasBeard) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.topColour = topColour;
		this.height = height;
		this.hasBeard = hasBeard;
	}

	//Getters and setters
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "age")
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Column(name = "top_colour")
	public String getTopColour() {
		return topColour;
	}

	public void setTopColour(String topColour) {
		this.topColour = topColour;
	}

	@Column(name = "height")
	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	@Column(name = "has_beard")
	public boolean getHasBeard() {
		return hasBeard;
	}

	public void setHasBeard(boolean hasBeard) {
		this.hasBeard = hasBeard;
	}
	
	public String toString() {
		return name + " " + age + " " + topColour + " " + height + " " + hasBeard;
	}
	
}
