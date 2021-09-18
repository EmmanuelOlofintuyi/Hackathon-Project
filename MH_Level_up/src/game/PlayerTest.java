package game;

public class PlayerTest {

	public static void main(String args[]) {
		playerTest();
		addFriendPointsPlaeyrTest();
		addTherapyPointsPlaeyrTest();
	}
	
	public static void playerTest() {
		Player jim = new Player("jim", 5555);
		System.out.println("-->testing Player");
		System.out.println(jim.toString());
	}
	
	public static void addFriendPointsPlaeyrTest() {
		Player p1 = new Player(4555, 1300);
		Player p2 = new Player(5555, 300);
		p1.addFp(p2);
		p2.addFp(p1);
		System.out.println("-->testing add friend points to Player");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		}
	
	public static void addTherapyPointsPlaeyrTest() {
		Player p1 = new Player("T1000",5000, 1300);
		p1.addTp(8000);
		System.out.println("-->testing add Therapy points to Player");
		System.out.println(p1.toString());
		}
	
	public static void addActivityPointsPlayerTest() {
		Player p1 = new Player("MentalGuru555",5000, 1300);
		p1.addSteps(500);
		p1.addAp();
		System.out.println("-->testing add Activity points to Player");
		System.out.println(p1.toString());
	}
}
