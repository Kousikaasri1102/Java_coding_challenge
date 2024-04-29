package com.model;

public class Cat extends Pets{
	private int pet_id;
    private String cat_color;
	public Cat(int pet_id, String cat_color) {
		super(pet_id, cat_color, pet_id, cat_color);
		this.pet_id = pet_id;
		this.cat_color = cat_color;
	}
	public int getPet_id() {
		return pet_id;
	}
	public void setPet_id(int pet_id) {
		this.pet_id = pet_id;
	}
	public String getCat_color() {
		return cat_color;
	}
	public void setCat_color(String cat_color) {
		this.cat_color = cat_color;
	}
	@Override
	public String toString() {
		return "Cat [pet_id=" + pet_id + ", cat_color=" + cat_color + "]";
	}
    
    
}
