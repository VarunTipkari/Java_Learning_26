package ipl_teams;

public class Player {

	private String name;
	//private int base_price;
	private int bid;
	private Team myTeam;
	
	
	public Player(String name,Team team,int bid) {
		this.name = name;
		this.myTeam = team;
		this.bid = bid;
	}
	
	@Override
	public String toString() {
		return name + " bid : " + bid;
	}
	
	
}
