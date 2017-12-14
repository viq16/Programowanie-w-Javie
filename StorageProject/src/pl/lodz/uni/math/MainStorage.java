package pl.lodz.uni.math;

public class MainStorage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int x,y,z,capacity;
		//System.out.print("Podaj x: ");
		capacity=4;
		x=3;
		y=3;
		z=4;
		Qube kostka=new Qube(x,y,z);
		kostka.fillQube(capacity);
		Package p1=new Package(1,1,"Toys");
		Package p2=new Package(2,2,"Toys");
		Package p3=new Package(3,1,"Food");
		
		kostka.createSlots();
		kostka.addPackages(p1,x,y);
		kostka.addPackages(p2,x,y);
		kostka.addPackages(p3,x,y);
		
		kostka.showPackages();
	}

}
