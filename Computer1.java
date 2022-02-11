package OOP;

public class Computer1 {
	static int count=0;
	private String cname;
	private static int cyear;
	private static double cost;
	
	public Computer1() {
		count++;
	}
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCyear() {
		return cyear;
	}
	public void setCyear(int cyear) {
		this.cyear = cyear;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}

	public static void newComputer() {
	if(cyear >= cost) {
		count--;
		System.out.println( count + " computer(s) are up to date!");
		}else {
			System.out.println("Everyone is up to date!");
	}
}
}

