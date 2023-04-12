package com.cdac.main;

public class Dish {
	
	private String dishName;
	private float dishPrice;
	
	public Dish() {
	}
	
	Dish(String dishName, float dishPrice){
		this.dishName=dishName;
		this.dishPrice=dishPrice;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public float getDishPrice() {
		return dishPrice;
	}

	public void setDishPrice(float dishPrice) {
		this.dishPrice = dishPrice;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%-25s%.2f", this.dishName,this.dishPrice);
	}

	

}
