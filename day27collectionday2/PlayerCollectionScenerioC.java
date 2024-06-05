package day27collectionday2;

import java.util.ArrayList;
import java.util.List;

public class PlayerCollectionScenerioC {
public static void main(String[] args) {
	Address address1=new Address(15,"Viman Nagar",411034);
	Address address2=new Address(16,"Kalyani Nagar",411035);
	Address address3=new Address(17,"Karve Nagar",411036);
	
	Player player1=new Player();
	player1.setPno(18);
	player1.setPname("Virat");
	player1.setInnings(100);
	player1.setRuns(1000);
	player1.setLocation(address1);
	
	Player player2=new Player();
	player2.setPno(45);
	player2.setPname("Rohit");
	player2.setInnings(200);
	player2.setRuns(2000);
	player2.setLocation(address2);
	
	Player player3=new Player();
	player3.setPno(1);
	player3.setPname("Rahul");
	player3.setInnings(50);
	player3.setRuns(500);
	player3.setLocation(address3);
	
	List<Player> team=new ArrayList();
	team.add(player1);
	team.add(player2);
	team.add(player3);
	
	for(int i=0;i<team.size();i++)
	{
		System.out.println(team.get(i).getLocation().getPincode());
	}
	
//	for(Player p:team)
//	{
//		System.out.println(p.getLocation().getPincode());
//	}
}
}
