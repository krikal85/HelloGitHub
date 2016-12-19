package org.campus02.blackjack;

import java.util.HashMap;
import java.util.Map;

public class Blackjack {

	private Map<Player, Integer> players = new HashMap<>();
	
	
	public boolean	add(Player	player){
		if(players.containsKey(player)){
			return true;
		}
		else{
			players.put(player, 0);
			return false;
		}
	}
	
	public boolean	addCard(Player	player,	Integer	cardValue){
		
		Integer value = players.get(player);
		
		if(players.containsKey(player)){
			value += cardValue;
			return true;
		}
		else{
			players.put(player, cardValue);
			return false;
		}
		
	}
	
	public Integer	getValue(Player	player){
		if(players.containsKey(player)){
		Integer value = players.get(player); 
		return value;
		}
		else{
			return null;
		}
	}

	@Override
	public String toString() {
		return "Blackjack [players=" + players + "]";
	}
	
	
}
