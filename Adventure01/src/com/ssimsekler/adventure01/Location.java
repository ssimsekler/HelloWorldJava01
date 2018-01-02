package com.ssimsekler.adventure01;

import java.util.Map;
import java.util.HashMap;

public class Location {

	private final int locationID;
	private final String description;
	private final Map<String, Integer> exits;
	
	public Location(int locationID, String description) {

		this.locationID = locationID;
		this.description = description;
		this.exits = new HashMap<>();
	}

	public void addExit(String direction, int location) {
		exits.put(direction, location);
	}
	
	public int getLocationID() {
		return locationID;
	}

	public String getDescription() {
		return description;
	}

	public Map<String, Integer> getExits() {
		return new HashMap<String, Integer>(exits);
	}
	
	
	
	
	
}
