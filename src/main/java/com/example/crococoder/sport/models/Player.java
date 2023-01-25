package com.example.crococoder.sport.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="players")
public class Player {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="PlayerId")
	private long id;
	
	private String name ;
	private long numberPlayer ;
	private long age ; 
	private String position ;
	
	public Player(long id, String name, long numberPlayer, long age, String position) {
		super();
		this.id = id;
		this.name = name;
		this.numberPlayer = numberPlayer;
		this.age = age;
		this.position = position;
	}


	public Player() {
		super();
	}


	public long getId() {
		return id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNumberPlayer() {
		return numberPlayer;
	}
	public void setNumberPlayer(long numberPlayer) {
		this.numberPlayer = numberPlayer;
	}
	public long getAge() {
		return age;
	}
	public void setAge(long age) {
		this.age = age;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", Name=" + name + ", numberPlayer=" + numberPlayer + ", age=" + age + ", position="
				+ position + "]";
	}
	

}
