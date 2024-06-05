package day27collectionday2;

import java.util.ArrayList;
import java.util.List;

public class PlayerCollection {
public static void main(String[] args) {
	Player p1=new Player(18,"Virat", 100,1000);
	Player p2=new Player(45,"Rohit", 200,2000);
	Player p3=new Player(1,"Rahul", 50,700);
	Player p4=new Player(73,"Surya", 40,500);
	
	List<Player> team=new ArrayList();
	team.add(p1);
	team.add(p2);
	team.add(p3);
	team.add(p4);
	
	//or
	
	List<Player> team1=new ArrayList();				//totalruns=4200
	team1.add(new Player(18,"Virat", 100,1000));
	team1.add(new Player(45,"Rohit", 200,2000));
	team1.add(new Player(1,"Rahul", 50,700));
	team1.add(new Player(73,"Surya", 40,500));
	team1.add(new Player(99,"Hardik", 70,1500));
	
	//System.out.println(team);
	int totalruns=0;
	for(int i=0;i<team1.size();i++)
	{
	totalruns=totalruns+team1.get(i).getRuns();
	}
	System.out.println(totalruns);
	double averageRuns=totalruns/team1.size();
	System.out.println(averageRuns);
}
}
