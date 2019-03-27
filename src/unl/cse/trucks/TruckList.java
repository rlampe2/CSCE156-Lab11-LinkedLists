package unl.cse.trucks;

public class TruckList {
	
	//TODO: add the head of your list here
	private TruckListNode head;
	private int size = 0;

	
	
	/**
	 * This function returns the size of the list, the number of
	 * elements currently stored in it.
	 * @return
	 */
	public int getSize() { 
    	return this.size;
	}

	/**
	 * This function clears out the contents of the list, making it an
	 * empty list.
	 */
    public void clear() {
    	//Call remove for clear
    	//Head is an edge case
    	int temp = size;
    	for(int i = 0; i < temp; i++) {
    		remove(0);
    	}

    }

    /**
     * This method adds the given {@link Truck} instance to the beginning
     * of the list.
     * @param t
     */
    public void addToStart(Truck t) {
    	TruckListNode newNode = new TruckListNode(t);
    	newNode.setNext(head);
    	head = newNode;
    	size++;
    }

    /**
     * This method adds the given {@link Truck} instance to the end of
     * the list.
     * @param t
     */
    public void addToEnd(Truck t) {
    	TruckListNode newNode = new TruckListNode(t);
    	/*//Get to end of the list
    	TruckListNode loopingNode = head;
    	while(loopingNode.getNext() != null) {
    		loopingNode = loopingNode.getNext();
    	}
    	loopingNode.setNext(newNode);
    	size++;*/
    	
    	//Fancy it up:
    	if(size == 0) {
    		head = newNode;
    	}else {
    		
    	TruckListNode endNode = getTruckListNode(size -1);
    	endNode.setNext(newNode);
    	}
    	size++;

    }

    /**
     * This method removes the {@link Truck} from the given 
     * <code>position</code>, indices start at 0.  Implicitly, the 
     * remaining elements' indices are reduced.
     * @param position
     */
    public void remove(int position) {
    	//Make the node before point to the node after:
    //	TruckListNode previousNode = getTruckListNode(position -1);
    //	previousNode.setNext(getTruckListNode(position + 1));
    	
    	if(position < 0 || position > size -1) {
    		throw new IndexOutOfBoundsException ("Postion out of Bounds");
    	}
    	
    	//edge cases:
    	if(position == 0) {
    		if(size == 1) {
    			head = null;
    		}else {
    		head = getTruckListNode(1);
    		}
    	}else if(position == size -1) {
    		getTruckListNode(position - 1).setNext(null);
    	}
    	else {
    	
    	getTruckListNode(position - 1).setNext(getTruckListNode(position + 1));
    	}
    	
    	size --;
    }
    
    /**
     * This is a private helper method that returns a {@link TruckListNode}
     * corresponding to the given position.  Implementing this method
     * is optional but may help you with other methods.
     * @param position
     * @return
     */
    private TruckListNode getTruckListNode(int position) {
    	//Assuming that position means index.
    	if(position < 0 || position > size -1) {
    		throw new IndexOutOfBoundsException ("Postion out of Bounds");
    	}
    	
    	
    	TruckListNode loopingNode = head;
    	for(int i = 0; i < position; i++) {
    		loopingNode = loopingNode.getNext();
    	}
    	
    	return loopingNode;
    	
        }

    /**
     * Returns the {@link Truck} element stored at the given 
     * <code>position</code>.
     * @param position
     * @return
     */
    public Truck getTruck(int position) {
    	return getTruckListNode(position).getTruck();
    }

    /**
     * Prints this list to the standard output.
     */
    public void print() {
    	System.out.println("The list of trucks: [");
    	
    	for(int i = 0; i < size; i++) {
    		
    		
    		System.out.println(getTruck(i));
    	}
    	
    	System.out.println("] End of list. ");
    }

    
}

