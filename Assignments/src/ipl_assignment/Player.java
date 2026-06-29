package ipl_assignment;

public class Player {
	
	private String name;
	private String role;
	private double bid_amount;
	
	public Player(String name,String role,double bid_amount) {
		this.name = name;
		this.role = role;
		this.bid_amount = bid_amount;
	}
	
	@Override
	public String toString() {
		return "Player : [Name="+name+", Role="+role+", Bid amount="+bid_amount+"]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public double getBid_amount() {
		return bid_amount;
	}

	public void setBid_amount(double bid_amount) {
		this.bid_amount = bid_amount;
	}
	
	
}
