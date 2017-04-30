package lab7;

public class ProductTest {

	ProductTest() {}
	
	
	public static void main(String[] args) {
	}
	
	public void testProduct(Product P) {
		System.out.println(P.getName());
	}
	public void testDataStorage(DataStorage D) {
		System.out.println("Free Capacity : " + D.getFreeCapacity());
		D.format();
	}
	public void testNetworked(Networked N) {
		if(N.isConnected() == false) {
			System.out.println("Connection state : Not connnected");
		} else {System.out.println("Connection state : Connnected");}
		
		System.out.println("Max Speed : " + N.maxSpeed() + "\n");
	}
	public void testCooker(Cooker C) {
		System.out.println(C.prepareFood());
	}
}
