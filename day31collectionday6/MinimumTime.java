package day31collectionday6;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class MinimumTime {
	
	PriorityQueue<Integer> pq=new PriorityQueue(Collections.reverseOrder());
	static int secondsCounter;
	public MinimumTime(int a,int o,int m)
	{
		pq.add(a);
		pq.add(o);
		pq.add(m);				//4 0 0
	}
	public int calculateMinimumTime() 
	{
	Iterator<Integer> list=	pq.iterator();
	int j1,j2;
	while(!pq.isEmpty())
	{
		j1=0;
		j2=0;
		if(list.hasNext())
			j1=pq.remove();    //j1=4
		
		if(list.hasNext())
			j2=pq.remove();    //j2=0
		
		if(j1>0 && j2>0)
		{
			secondsCounter++;
			j1--;				//j1=6
			j2--;				//j2=4
		}
		
		
		if(j1>0 && j2==0)
		{
			secondsCounter=secondsCounter+j1;
			break;
		}
		
		if(j1==0 && j2>0)
		{
			secondsCounter=secondsCounter+j2;
			break;
		}
		
		if(j1>0)
			pq.add(j1);
		
		if(j2>0)
			pq.add(j2);
		
	}
	return(secondsCounter);
	}

}
