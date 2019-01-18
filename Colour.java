public class Colour {

	public String enumColour(int number) {

		switch (number) {

		case 0:
			return "RED";
		case 1:
			return "BLUE";
		case 2:
			return "YELLOW";
		case 3:
			return "BLACK";
		case 4:
			return "FAKE_JOKER";

		default:
			return "FAIL";
		}
	}

}