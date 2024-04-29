package com.model;

public class Dog extends Pets{
      private int pet_id;
      private String dog_breed;
	public Dog(int pet_id, String dog_breed) {
		super(pet_id, dog_breed, pet_id, dog_breed);
		this.pet_id = pet_id;
		this.dog_breed = dog_breed;
	}
	public int getPet_id() {
		return pet_id;
	}
	public void setPet_id(int pet_id) {
		this.pet_id = pet_id;
	}
	public String getDog_breed() {
		return dog_breed;
	}
	public void setDog_breed(String dog_breed) {
		this.dog_breed = dog_breed;
	}
	@Override
	public String toString() {
		return "Dog [pet_id=" + pet_id + ", dog_breed=" + dog_breed + "]";
	}
      
      
}
