package t2023;

public class RPS {
	public static void main(String[] args) {
		String player1 = "Ножницы";
		String player2 = "Бумага";
		System.out.println(rps(player1,player2));

	}
	public static String rps (String p1, String p2) {
		if (p1.equals(p2)) {return  "DRAW";}
		int p = (p1 + p2).equalsIgnoreCase("ножницыбумага")||(p1 + p2).equalsIgnoreCase("каменьножницы")|| (p1 + p2).equalsIgnoreCase("бумагакамень")? 1:2;
		return "Player " + p + " won!";
	}

}
