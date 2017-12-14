package pl.lodz.uni.math;

import java.util.List;
import java.util.ArrayList;

public class Qube {
	private
	int x,y,z;
	List <Package> [][] floor;
	
	ArrayList <Package> listPackage = new ArrayList<Package>();
	
	public
	
		


	Qube (int _x,int _y, int _z){
		this.x=_x;
		this.y=_y;
		this.z=_z;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public int getZ(){
		return z;
	}
	
	public void createSlots(){ //stworzyc listy(stosy) dla kazdego pola w tablicy
		floor = new List[x][y];
		for (int i=0;i<x;i++)
		{
			for(int j=0;j<y;j++)
			{
				floor[i][j]= (new ArrayList <Package>());
			}
		}
		
	}

	public void fillQube(int capacity) { //tworzymy paczki z odpowiednimi numerami i priority
		int priority1=1,priority2=2,priority3=3;
		
		for (int i=0;i<capacity;i++)
		{
			
			if (capacity <= 3) {
				listPackage.add(new Package(i,priority1,"Pilki"));
			}
			listPackage.add(new Package(i,priority2,"Pilki"));
		}

	}
	
	public void addPackages(Package p,int x, int y)
	{
		int prior=0,maxprior=0,licznik=x-1;
		boolean isAdded = false;
		for (int i=0;i<x;i++)
		{
			for(int j=0;j<y;j++)
			{
				if(floor[i][j].isEmpty() == true && p.priority == 1)
				{
					floor[i][j].add(p);
					isAdded =true;
					break;
				}
				else if (floor[i][j].isEmpty() == false)
				{
					for(int listItems=0;listItems<floor[i][j].size();listItems++)
					{
						prior = floor[i][j].get(listItems).priority;
						if (prior > maxprior)
						{
							maxprior = prior;
						}
					}
					if (p.priority > maxprior)
					{
						floor[i][j].add(p);
						isAdded =true;
						break;
					}
				}
				

			}
			if(isAdded == true)
			{
				break;
			}
			
			if (licznik == i)
			{
				for(int h=0;h<x;h++)
				{
				for (int k=0;k<y;k++)
				{
					if(floor[h][k].isEmpty() == true)
					{
						floor[h][k].add(p);
						break;
					}
				}
				}
			}
			
			
		}
	}
	
	public void showPackages ()
	{
		int iterator=0;
		for (int i=0;i<x;i++)
		{
			for(int j=0;j<y;j++)
			{
				System.out.println("Miejsce "+ i +" "+ j +":");
				for(int listItems=0;listItems<floor[i][j].size();listItems++)
				{
					System.out.println(floor[i][j].get(listItems)+ " ");
					iterator ++;
				}
				System.out.println("Ilosc paczek w liscie" + iterator);
				iterator=0;
			}
			
			System.out.println("\n");
			
			
		}
	}
	
}

