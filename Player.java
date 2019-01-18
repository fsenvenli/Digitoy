import java.util.ArrayList;
import java.util.Random;

public class Player {

	private String[] players = new String[] { "Player 1", "Player 2", "Player 3", "Player 4" };

	private Random rand = new Random();

	// Deciding randomly starting player
	public String getRandPlayer() {

		int index = rand.nextInt(players.length);
		System.out.println(players[index] + " will start the game");

		Hand(players[index], index);
		return players[index];
	}

	// Creating Hands for starting player.
	public ArrayList<Tile> Hand(String startingPlayer, int index) {

		Tile[] tileSet = new Tile[15];
		ArrayList<Tile> playerHands = new ArrayList<>();
		int times = 0;

		System.out.println("--Tiles will be shuffled--");
		CompleteTileSet shuffledTileSet = CompleteTileSet.shuffleTiles();
		System.out.println("--Shuffle successfully completed--");

		String[] newPlayerArray = new String[players.length - 1];

		// Removing starting player from array
		for (int i = 0, j = 0; i < players.length; i++) {

			if (i == index) {
				continue;
			}
			newPlayerArray[j++] = players[i];
		}

		// Starting Players Hand
		for (int i = 0; i < 15; i++) {
			tileSet[i] = shuffledTileSet.getTile(i);
			playerHands.add(tileSet[i]);
		}

		// Other Players' Hands
		for (int i = 0; i < 14; i++) {
			times = 0;
			do {
				tileSet[i] = shuffledTileSet.getTile(i);
				playerHands.add(tileSet[i]);
				times++;
			} while (times < 3);
		}
		
		return playerHands;
	}

}
