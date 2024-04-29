package com.model;

public class Participants {
    private int id;
    private String name;
    private int adoption_event_id;
	public Participants(int id, String name, int adoption_event_id) {
		super();
		this.id = id;
		this.name = name;
		this.adoption_event_id = adoption_event_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAdoption_event_id() {
		return adoption_event_id;
	}
	public void setAdoption_event_id(int adoption_event_id) {
		this.adoption_event_id = adoption_event_id;
	}
	@Override
	public String toString() {
		return "Participants [id=" + id + ", name=" + name + ", adoption_event_id=" + adoption_event_id + "]";
	}
    
    
}
