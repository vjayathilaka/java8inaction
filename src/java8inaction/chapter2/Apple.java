package java8inaction.chapter2;

public class Apple {
	private String colour;
	private int weight;
	
	public Apple(String colour, int weight) {
		super();
		this.colour = colour;
		this.weight = weight;
	}
	
	public String getColour() {
		return colour;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
}
