package unl.cse.trucks;

public class ListTester {

    public static void main (String[] args){

    	//TODO: Test cases should be made here
    	TruckList tl = new TruckList();
    	Truck t = new Truck.Builder().licensePlate("GRN EGG").build();
    	tl.addToEnd(t);
    	
    	for(int i = 0; i < 10; i++) {
    	tl.addToEnd(Truck.createRandomTruck());
    	}
    	
    	System.out.println("The list intially:");
    	tl.print();
    	
    	//Add trucks to start of list:
    	tl.addToStart(Truck.createRandomTruck());
    	tl.addToStart(Truck.createRandomTruck());
    	tl.addToStart(Truck.createRandomTruck());
    	
    	
    	
    	System.out.println("\n\n\n 2.a");
    	tl.print();
    	
    	//Add trucks to end of list:
    	tl.addToEnd(Truck.createRandomTruck());
    	tl.addToEnd(Truck.createRandomTruck());
    	tl.addToEnd(Truck.createRandomTruck());
    	
    	
    	
    	System.out.println("\n\n\n2.b");
    	tl.print();
    	
    	//Add trucks to alternative sides of the list:
    	tl.addToStart(Truck.createRandomTruck());
    	tl.addToEnd(Truck.createRandomTruck());
    	tl.addToStart(Truck.createRandomTruck());
    	tl.addToEnd(Truck.createRandomTruck());
    	tl.addToStart(Truck.createRandomTruck());
    	tl.addToEnd(Truck.createRandomTruck());
    	
    	System.out.println("\n\n\n2.c");
    	tl.print();
    	
    	//Clear out the list for part 3:
    	System.out.println("\n\n\nClearing the List for Part 3.a..");
    	
//    	tl.addToStart(Truck.createRandomTruck());
//    	tl.print();
    	tl.clear();
    	
    	
    	//Add trucks then remove the first:
    	tl.addToStart(Truck.createRandomTruck());
    	tl.addToStart(Truck.createRandomTruck());
    	tl.addToStart(Truck.createRandomTruck());
    	tl.print();
    	
    	tl.remove(0);
    	tl.print();

    	//Part 3b
    	tl.clear();
    	System.out.println("\n\n\nClearing the List for Part 3.b...");
    	tl.addToStart(Truck.createRandomTruck());
    	tl.addToStart(Truck.createRandomTruck());
    	tl.addToStart(Truck.createRandomTruck());
    	tl.print();

    	tl.remove(2);
    	tl.print();

    	//Clear out the list for part 3:
    	System.out.println("\n\n\nClearing the List for Part 3.c..");
    	tl.clear();
    	tl.addToStart(Truck.createRandomTruck());
    	tl.addToStart(Truck.createRandomTruck());
    	tl.addToStart(Truck.createRandomTruck());
    	tl.addToStart(Truck.createRandomTruck());
    	tl.addToStart(Truck.createRandomTruck());
    	tl.print();
    	tl.remove(2);
    	tl.print();
    	tl.remove(3);
    	tl.print();
    	tl.remove(0);
    	tl.print();
    	tl.remove(1);
    	tl.print();
    	tl.remove(0);
    	
    	//Corner cases:
    	System.out.println("\n\n\nThese are the corner cases that Robyn found:");
    	//clear empty list:
    	System.out.println("Clearing an empty list...");
    	tl.clear();
    	tl.clear();
    	
    	//Adding to end of empty list
    	System.out.println("Adding to end of empty list...");
    	tl.addToEnd(Truck.createRandomTruck());
    	tl.print();
    	
    	//Removing final node:
    	System.out.println("Removing last node...");
    	tl.addToEnd(Truck.createRandomTruck());
    	tl.print();
    	tl.remove(1);
    	tl.print();


    	//Notes:
    	/*Helpful to put each test in the function: 
    	 * so each idea can be isolated and tested individually (often done in a testing framework).
    	 */
    	

	}
}
