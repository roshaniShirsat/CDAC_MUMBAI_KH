package com.cdac.main;

import java.util.Scanner;
enum Option{
	EXIT,VIEW_MENU,ADD_DISH,REMOVE_DISH,MODIFY_DISH
}

public class Test {
	static Scanner sc = new Scanner(System.in);
	
	private static void acceptDish(Dish d) {
		System.out.println("Dish Name : ");
		sc.nextLine();
		d.setDishName(sc.nextLine());
		System.out.println("Dish Price : ");
		d.setDishPrice(sc.nextFloat());
	}
	
	public static Option menuList() {
		System.out.println("0. EXIT");
		System.out.println("1. View Menu");
		System.out.println("2. Add Dish");
		System.out.println("3. Remove Dish");
		System.out.println("4. Modify Dish");
		System.out.println("Enter choice : ");
		return Option.values()[sc.nextInt()];
	}

	public static void main(String[] args) {
		Restaurant r = new Restaurant(5);
		Option option;
		while((option=Test.menuList())!=Option.EXIT) {
			
			switch(option) {
			case VIEW_MENU:
				r.viewMenu();
				break;
			case ADD_DISH:
				Dish d = new Dish();
				Test.acceptDish(d);
				r.addDish(d);
				break;
			case REMOVE_DISH:
				System.out.println("Enter index to remove dish : ");
				r.removeDish(sc.nextInt());
				break;
			case MODIFY_DISH:
				System.out.println("Enter index to modify dish : ");
				int dishIndex=sc.nextInt();
				System.out.println("Enter price : ");
				float newPrice=sc.nextFloat();
				r.modifyDish(dishIndex, newPrice);
				break;
			default:
				System.out.println("Enter valid choice!!");
				break;
			
			}
		}
	}

}
