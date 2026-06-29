package ipl_teams;

public class Team {
	
	private String name;
	private Player[] players;
	private Player captain;
	
	public Team(String name) {
		this.name = name;
		players = new Player[5];
	}
	
	public void setPlayers(Player...pl) {
		players = pl;
	}
	
	public void myPlayers() {
		System.out.println("Team "+name);
		for(Player p: players) {
			System.out.println(p);
		}
	}
}
