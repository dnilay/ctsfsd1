package com.jpassion.hibernate;

import java.time.LocalDate;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_of_the_book",discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("normal_book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String title;
	String artist;
	LocalDate purchaseDate;
	double cost;

	public Book() {
	}

	public Book(String title, String artist, LocalDate purchaseDate, double cost) {
		this.title = title;
		this.artist = artist;
		this.purchaseDate = purchaseDate;
		this.cost = cost;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getArtist() {
		return artist;
	}

	public void setPurchasedate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public LocalDate getPurchasedate() {
		return purchaseDate;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getCost() {
		return cost;
	}
}