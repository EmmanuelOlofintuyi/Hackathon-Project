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

	public Player(String username, int id) {
		this.username = username;
		this.id = id;
		points = 0;
		fp = 0;
		tp = 0;
		ap = 0;
		steps = 0;
	}
	
	public Player(int id) {
		username = " ";
		this.id = id;
		points = 0;
		fp = 0;
		tp = 0;
		ap = 0;
		steps = 0;
	}
	
	public Player(String username, int id, int points) {
		this.username = username;
		this.id = id;
		this.points = points;
		fp = 0;
		tp = 0;
		ap = 0;
		steps = 0;
	}
	
	public Player(int id, int points) {
		username = " ";
		this.id = id;
		this.points = points;
		fp = 0;
		tp = 0;
		ap = 0;
		steps = 0;
	}
	
	

	public int compareTo(Player p) {
		return this.points - p.points;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Player) {
			Player p =  (Player) o;
			if(this.id == p.id) {
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
		fp += 4000;
		points += fp;
	}
	
	public void addTp(int t){
		//want to replace 0 with a scanner so 
		tp += t;
		points += tp; 
	}
	
	public void addAp() {
		ap += (steps/2);
		points += ap;
	}
	
	public void addSteps(int s) {
		steps += s;
	}
	
	public String getUsername() {
		return username;
	}

	public int getId() {
		return id;
	}

	public int getSteps() {
		return steps;
	}

	public String toString() {
		return String.format("username= %s, id = %d\nPoints=%d\nFp=%d\nTp=%d\nAp=%d\n", username, id, points, fp , tp, ap);
	}
}
