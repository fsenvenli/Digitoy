
public class Main {

	public static void main(String[] args) {
		
		Player startingPlayer = new Player();
		CompleteTileSet ctl = new CompleteTileSet();

		
		startingPlayer.getRandPlayer();
		System.out.println("--Joker tile will be determined--");
		ctl.decideJokerTile();

	}

}
