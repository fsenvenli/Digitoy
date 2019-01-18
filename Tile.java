
public class Tile
{

	final int red = 0;
	final int blue = 1;
	final int yellow = 2;
	final int black = 3;
	final int joker = 4;

	int tileNumber;
	int faceValue;
	int tileColour;

	//constructor.
	public Tile (int value, int colour, int number) { 
		this.tileNumber = number; 
		this.faceValue = value; 
		this.tileColour = colour; 
	}
	
	//Setting Tile value.
	public Tile setTileValue(int value) {
		this.faceValue = value;
		return this;
	}
	 
	//Getting Tile colour.
	public String getColour() { 
		if(tileColour==red) 
			return "Red"; 
		else if(tileColour==blue) 
			return "Blue"; 
		else if(tileColour==yellow) 
			return "Yellow"; 
		else if(tileColour==black) 
			return "Black"; 
		else if(tileColour==joker) 
			return "Joker"; 
		else System.out.println("TileColour: " + tileColour); return ""; 
		} 
	
	 int getValue() { 
		 return faceValue; }
}