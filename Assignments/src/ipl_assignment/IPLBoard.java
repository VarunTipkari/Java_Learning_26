package ipl_assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IPLBoard implements IPLBoardService {

	Map<Team,List<Player>> team_map = new HashMap<Team,List<Player>>();
	Team[] teams = {new Team("CSK","Chennai Super Kings"),new Team("MI","Mumbai Indians")};
	
	public IPLBoard() {
		for(Team t: teams) {
			team_map.put(t, new ArrayList<Player>());
		}
	}
	
	@Override
	public boolean addPlayerToTeam(Player p, String team_id) throws TeamNotExistException {
		
		for(Team t : teams) {
			if(t.getId() == team_id) {
				team_map.get(t).add(p);
				return true;
			}
		}
		
		throw new TeamNotExistException("Team with id : "+team_id+" not exist in the board!");
	}

	@Override
	public List<Player> getPlayers(String team_id) throws TeamNotExistException {

		for(Team t : teams) {
			if(t.getId() == team_id) {
				return team_map.get(t);
			}
		}
		
		throw new TeamNotExistException("Team with id : "+team_id+" not exist in the board!");
		
	}


}
