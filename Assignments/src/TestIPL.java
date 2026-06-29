import ipl_assignment.IPLBoard;
import ipl_assignment.IPLBoardService;
import ipl_assignment.Player;
import ipl_assignment.TeamNotExistException;

public class TestIPL {

	public static void main(String[] args) {

		IPLBoardService ipl = new IPLBoard();
		
		try {
		
			ipl.addPlayerToTeam(new Player("Rohit Sharma","Captain",150000), "MI");
			ipl.addPlayerToTeam(new Player("Hardik Pandya","All Rounder",20000),"MI");
			ipl.addPlayerToTeam(new Player("Ishan Kishan","Batsman",120000), "MI");
			
			ipl.addPlayerToTeam(new Player("Mahendra Singh Dhoni","Captain",150000), "CSK");
			ipl.addPlayerToTeam(new Player("Varun Tipkari","All Rounder",20000),"CSK");
			ipl.addPlayerToTeam(new Player("Ruturaj Gaikwad","Batsman",120000), "CSK");
						
			ipl.getPlayers("CSK").forEach(System.out::println);
			
			ipl.getPlayers("RCB").forEach(System.out::println);
			
		} catch(TeamNotExistException t) {
			t.printStackTrace();
		}
				
		
	}

}
