package com.cdac.main;

public class Restaurant {
	private int index;
	private Dish[] arr;
	
	public Restaurant() {
		this(10);
	}
	

	public Restaurant(int size) {
		this.arr = new Dish[size];
	}


	public void viewMenu() {
		if(this.index!=0) {
		System.out.println("Menu card");
		for(Dish d : this.arr) {
			if(d!=null) {
				System.out.println(d);
			}
		}
		}
		else {
			System.out.println("Sorry. No menu Available!!");
		}
		
		
	}

	public void addDish(Dish d) {
		if(this.index<this.arr.length) {
			this.arr[index]=d;
			this.index++;
			System.out.println("Added new dish!!");
			this.viewMenu();
		}
		else {
			System.out.println("Sorry. Menu card is full!!");
		}
	}

	public void removeDish(int dishIndex) {
		if(this.index!=0) {
			this.arr[dishIndex]=null;
			for(int i = dishIndex;i<this.index;i++) {
				this.arr[i]=this.arr[i+1];
//				this.index--;
			}
			this.index--;
			System.out.println("Removed dish from index "+dishIndex);
			this.viewMenu();
		}
		else {
		System.out.println("Failed to remove dish price!!");
		}
		
	}

	public void modifyDish(int dishIndex,float newPrice) {
		if(this.index!=0) {
			this.arr[dishIndex].setDishPrice(newPrice);
			System.out.println("Modified dish from index "+dishIndex);
			this.viewMenu();
		}
		else {
		System.out.println("Failed to modify dish price!!");
		}
		
	}

}
