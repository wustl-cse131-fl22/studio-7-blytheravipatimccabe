package studio7;

public class Die {
	
	private int n;

	//creating private variables yay

	public Die(int initn) { //constructor initializes variables
		n = initn;
	}
	
	public int rollDie() {
		return (int) (Math.random()*n+1);
	}
	
	public static void main(String[] args) {
		Die d1 = new Die(6);	
		System.out.println(d1.rollDie());
	}

}	