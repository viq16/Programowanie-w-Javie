package pl.uni.math.java;

public class MyRunner extends MyRunnerB {
	public MyRunner(){
		System.out.println("A1");
	}
	public void test(){
		System.out.println("T1");
	}
	{
		System.out.println("I1");
	}
	static {
		System.out.println("I0");
	}

}
