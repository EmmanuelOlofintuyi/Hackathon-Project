package game;

public class Player {
	String username;
	int id;
	int points;
	
	public Player(String username, int id) {
		this.username = username;
		this.id = id;
		points = 0;
	}
	
	public String getUsername() {
		return username;
	}

	public int getId() {
		return id;
	}

	public int getPoints() {
		return points;
	}

	

}
