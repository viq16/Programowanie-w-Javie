package opitz.project.storage;


public class Storage {
	private static Storage instance = null;
	public static final int x = 3;
	public static final int y = 4;
	public static final int z = 5;
	
	public static Storage getInstance(){
		if(instance == null)
			instance = new Storage(0, 0, 0);
		return instance;
	}
	
	public static void createPackages(){
		final int a;
		final int b;
		final int c;
		
		a=x/3;
		b=y/3;
		c=z/3;
		
	}
	private Storage(int x, int y, int z){
		Package thirdDimensionArray = new Package(x,y,z);
	}
}
