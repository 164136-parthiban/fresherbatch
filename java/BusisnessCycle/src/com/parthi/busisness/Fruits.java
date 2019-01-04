package com.parthi.busisness;

public class Fruits
{

	String name,color;
	int calories,price;
	
	public Fruits(String name, String color, int calories, int price)
	{
		
		this.name = name;
		this.color = color;
		this.calories = calories;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Fruits [Name=" + name + ", color=" + color + ", calories=" + calories + ", price=" + price + "]";
	}
	
	
	
	
}
