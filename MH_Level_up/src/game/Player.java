package game;

public class Player {
	//username or screen name would be for other people to look up or search for name
	String username;
	//id is how the system will identify a person
	int id;
	//while in the "game" the player gains points when do mental health
	int points;
	
	//friend points
		int fp;
		//therapy points
		int tp;
		//activity points
		int ap;
		
		int steps;

		int playerPoints;
		int playerFp;
		int playerTp;
		int playerAp;

	
	public Player(String username, int id) {
		this.username = username;
		this.id = id;
		playerPoints = points;
		playerFp = fp;
		playerTp =tp;
		playerAp =ap;
	}
	
	public Player(int id) {
		this.id = id;
		points = 0;
	}
	
	public int compareTo(Player p) {
		return this.playerPoints - p.playerPoints;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Player) {
			Player p =  (Player) o;
			if(this.playerPoints == p.playerPoints) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	//adding friend points to fp of player and total points
	public void addFp(Player p2) {
		fp += 50;
		points += fp;
	}
	
	public void addTp(){
		//want to replace 0 with a scanner so 
		tp += 0;
		points += tp; 
	}
	
	public void addAp() {
		ap += (steps *.05);
		points += ap;
	}
	
	public String getUsername() {
		return username;
	}

	public int getId() {
		return id;
	}

	public int getPlayerPoints() {
		return points;
	}

	public int getPlayerFp() {
		return fp;
	}


	public int getPlayerTp() {
		return tp;
	}



	public int getPlayerAp() {
		return ap;
	}

	

}
