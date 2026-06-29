package ipl_teams;
import java.util.Scanner;

public class TestIPL {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Team csk = new Team("CSK");
		
		Player p1 = new Player("p1",csk,15000);
		Player p2 = new Player("p2",csk,20000);
		Player p3 = new Player("p3",csk,25000);
		Player p4 = new Player("p4",csk,30000);
		
		csk.setPlayers(p1,p2,p3,p4);
		
		Team mi = new Team("MI");
		
		Player p5 = new Player("p5",mi,15000);
		Player p6 = new Player("p6",mi,45000);
		Player p7 = new Player("p7",mi,50000);
		Player p8 = new Player("p8",mi,10000);
		
		mi.setPlayers(p5,p6,p7,p8);
		
		System.out.println("Get players of which team ?");
		
		while(true) {			
			System.out.println("1.CSK\n2.MI\n3.Exit");
			int ch;
			ch = sc.nextInt();
			if(ch == 1) csk.myPlayers();
			else if(ch == 2) mi.myPlayers();
			else if(ch == 3) break;
			else System.out.println("Invalid");
		}
		
		
		
	}

}
