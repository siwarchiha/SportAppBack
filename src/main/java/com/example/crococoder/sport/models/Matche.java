package com.example.crococoder.sport.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="matches")
public class Matche {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="MATCH_ID")
	private Long id;
	private String teamOne;
	private String teamTwo;
	private int ScoreOne;
	private int ScoreTwo;
	
	public Matche(Long id, String teamOne, String teamTwo, int scoreOne, int scoreTwo) {
		super();
		this.id = id;
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
		this.ScoreOne = scoreOne;
		this.ScoreTwo = scoreTwo;
	}

	public Matche() {
		super();
	}

	public String getTeamOne() {
		return teamOne;
	}

	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}

	public String getTeamTwo() {
		return teamTwo;
	}

	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}

	public int getScoreOne() {
		return ScoreOne;
	}

	public void setScoreOne(int scoreOne) {
		ScoreOne = scoreOne;
	}

	public int getScoreTwo() {
		return ScoreTwo;
	}

	public void setScoreTwo(int scoreTwo) {
		ScoreTwo = scoreTwo;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Matche [id=" + id + ", teamOne=" + teamOne + ", teamTwo=" + teamTwo + ", ScoreOne=" + ScoreOne
				+ ", ScoreTwo=" + ScoreTwo + "]";
	}
}
	
	
	
	
       

