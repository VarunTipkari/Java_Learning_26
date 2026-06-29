package ipl_assignment;

import java.util.List;

public interface IPLBoardService {

	boolean addPlayerToTeam(Player p,String team_id) throws TeamNotExistException;
	
	List<Player> getPlayers(String team_id) throws TeamNotExistException;
	
}
