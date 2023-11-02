package studio7;

public class Die {

	private int n; 
	
	public Die(int n) {
		this.n = n; 
	}
	
	public int output() {
		return (int)((Math.random()*n)+1); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die dice = new Die(4); 
		System.out.println("Roll the dice!"); 
		System.out.println(dice.output()); 
	}

}
