package com.example.crococoder.sport.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teams")
public class Team {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="TeamId")
	private long id;
	private String name;
	private String staduim;
	private String foundation;
	private String owner;
	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", staduim=" + staduim + ", foundation=" + foundation + ", owner="
				+ owner + "]";
	}

	public Team(long id, String name, String staduim, String foundation, String owner) {
		super();
		this.id = id;
		this.name = name;
		this.staduim = staduim;
		this.foundation = foundation;
		this.owner = owner;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStaduim() {
		return staduim;
	}
	public void setStaduim(String staduim) {
		this.staduim = staduim;
	}
	public String getFoundation() {
		return foundation;
	}
	public void setFoundation(String foundation) {
		this.foundation = foundation;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Team() {
		super();
	}

}
