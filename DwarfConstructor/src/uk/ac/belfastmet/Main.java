package uk.ac.belfastmet;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
		
//		Dwarf dwarf = new Dwarf();
		
		dwarfs.add(new Dwarf("Sleepy", "Disney"));
		dwarfs.add(new Dwarf("Sneezy", "Disney"));
		dwarfs.add(new Dwarf("Dopey", "Disney"));
		dwarfs.add(new Dwarf("Bashful", "Disney"));
		dwarfs.add(new Dwarf("Doc", "Disney"));
		dwarfs.add(new Dwarf("Grumpy", "Disney"));
		dwarfs.add(new Dwarf("Happy", "Disney"));
		dwarfs.add(new Dwarf("Thorin", "Tolkien"));
		dwarfs.add(new Dwarf("Balin", "Tolkien"));
		dwarfs.add(new Dwarf("Dwalin", "Tolkien"));
		dwarfs.add(new Dwarf("Fili", "Tolkien"));
		dwarfs.add(new Dwarf("Kili", "Tolkien"));
		dwarfs.add(new Dwarf("Dori", "Tolkien"));
		dwarfs.add(new Dwarf("Nori", "Tolkien"));
		dwarfs.add(new Dwarf("Oin", "Tolkien"));
		dwarfs.add(new Dwarf("Ori", "Tolkien"));
		dwarfs.add(new Dwarf("Gloin", "Tolkien"));
		dwarfs.add(new Dwarf("Bifur", "Tolkien"));
		dwarfs.add(new Dwarf("Bofur", "Tolkien"));
		dwarfs.add(new Dwarf("Bombur", "Tolkien"));
		
//		System.out.println("The Dwarfs are: ");
//		for(Dwarf dwarf: dwarfs) {
//			System.out.println("Name: " +dwarf.getName() + ", Author: " + dwarf.getAuthor());
//		}
		
		System.out.println("The Disney Dwarfs are:");
		for(Dwarf dwarf: dwarfs) {
		if (dwarf.getAuthor() == "Disney") {
			System.out.println(dwarf.getName());
			}
		}
		
		System.out.println("\nThe Tolkien Dwarfs are:");
		for (Dwarf dwarf: dwarfs) {
			if (dwarf.getAuthor() == "Tolkien") {
				System.out.println(dwarf.getName());
			}
		}
		
	}

}
