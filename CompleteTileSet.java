import java.util.Random;

public class CompleteTileSet
{

	Random randTile = new Random();

	
	static CompleteTileSet FULL_SET;
	Tile[] tileSet;
	final int setSize = 106;

	final int red = 0;
	final int blue = 1;
	final int yellow = 2;
	final int black = 3;
	final int fake_joker = 4;

	//Constructor to create 106 tiles of pile
	public CompleteTileSet()
	{
		tileSet = new Tile[setSize];
		int times = 0;
		int tileNum = 0;

		for(int colour=red; colour<black+1; colour++)
		{
			for(int value=1; value<14; value++)
			{
				times = 0;
				do{
					tileSet[tileNum] = new Tile(value, colour, tileNum);
					tileNum++;
					times++;
				}while(times<2);
			}
		}
		
		for(int i=1; i<3; i++)
		{
			tileSet[tileNum] = new Tile(i, fake_joker, tileNum);
			tileNum++;
		}
		FULL_SET = this;
		
	}

	//Shuffle the pile.
	static CompleteTileSet shuffleTiles()
	{	
	 Random rand = new Random();
	  for (int i = 0; i < 105; i++)
	  {
		int index = rand.nextInt(105) + 1;
	    int tempValue = FULL_SET.getTile(index).getValue(); 
	    FULL_SET.getTile(i).setTileValue(tempValue);
	  }
	  return FULL_SET;
	}
	
	//Selecting a tile from pile.
	public Tile getTile(int number) { 
		return FULL_SET.tileSet[number]; 
		}
	
	
	//Deciding joker tile.
	public Tile decideJokerTile() {
		int index = randTile.nextInt(106);
		int value = FULL_SET.getTile(index).getValue() + 1;
		System.out.println("Indicator Tile is: " + " " + FULL_SET.getTile(index).getColour() + " " + FULL_SET.getTile(index).getValue());
		System.out.println("Joker Tile is: " + " " + FULL_SET.getTile(index).getColour() + " " + value);
		return FULL_SET.getTile(index);	
	}

}