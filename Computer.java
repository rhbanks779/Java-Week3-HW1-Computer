package OOP;

public class Computer {

	public static void main(String[] args) {
		Computer1 c1 = new Computer1();
		Computer1 c2 = new Computer1();
		Computer1 c3 = new Computer1();
		
		c1.setCname("Dell");
		c1.setCyear(2012);
		c1.setCost(2199.99);
		
		c2.setCname("Mac");
		c2.setCyear(2020);
		c2.setCost(2500.99);
		
		c3.setCname("Intel");
		c3.setCyear(2019);
		c3.setCost(1900.00);
		
		System.out.println("Steve's " + c1.getCname() + " computer is a " + c1.getCyear()+ " and cost $"+ c1.getCost());
		System.out.println("Dave's " + c2.getCname() + " computer is a " + c2.getCyear()+ " and cost $"+ c2.getCost());
		System.out.println("Amy's " + c3.getCname() + " computer is a " + c3.getCyear()+ " and cost $"+ c3.getCost());
		System.out.println();
		Computer1.newComputer();

	}

}
