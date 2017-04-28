package main;

public class Card {
	private String colour;
	private String value;
	
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
	 return getColour() + " " + getValue();
	 } 
}
