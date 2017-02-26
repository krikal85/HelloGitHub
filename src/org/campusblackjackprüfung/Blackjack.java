package org.campusblackjackprüfung;

import java.util.HashMap;
import java.util.Map;

public class Blackjack {
	
	private Map<Player,Integer>players = new HashMap<>();
	
	public boolean add(Player player){
		if(players.containsKey(player)){
			return false;
		}
		else
			players.put(player, 0);
			System.out.println(players);
			return true;
		
	}
	
	public boolean	addCard(Player	player,	Integer	cardValue){
		Integer value = players.get(player);
		if(players.containsKey(player)){
			value = value +cardValue;
			players.put(player, value);
			System.out.println(players);
			return true;
		}
		else
			return false;
	}
	
	public Integer getValue(Player	player){
		Integer value = 0;
		if(players.containsKey(player)){
			value = players.get(player);
			
		}
		return value;
	}
	
	@Override
	
	public String toString(){
		return ""+ players + " ";
		
	}
	
}
