package org.zerock.domain;

public class BendingMachine {
	
	private static int count;
	
	public int getNext() {
		
		return ++this.count;
	}
	
	public static void main(String[] args) {
		
		BendingMachine machine1 = new BendingMachine();
		BendingMachine machine2 = new BendingMachine();
		
		System.out.println(machine1.getNext());
		System.out.println(machine2.getNext());
		
	}

}
