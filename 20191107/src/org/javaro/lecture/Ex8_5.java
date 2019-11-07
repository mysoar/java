package org.javaro.lecture;

public class Ex8_5 {
	public static void main(String[] args) {
		Pine pine = new Pine("3.5", "소나무");
		System.out.println("높이(m): " + pine.getHeight());
		System.out.println("품종:" + pine.getSpecies());
	}
}
class Tree {
	String height;
	public Tree(String height) {
		this.height = height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getHeight() {
		return this.height;
	}
}
	class Pine extends Tree {
		String species;
public Pine(String height, String species) {
			super(height);
			this.species = species;
		}
		public void setSpecies(String species) {
			this.species = species;
		}
		public String getSpecies() {
			return this.species;
		}
	}
