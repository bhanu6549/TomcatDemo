package com.example.demo.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class BookingDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingId;
	@NotNull
	private String source;
	@NotNull
	private String destination;
	@NotNull
	private Date journeyDate;
	@NotNull
	private int journeyDistance;
	@NotNull
	private String foodPreferences;
	@NotNull
	private String travelingWith;
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private User user;

	public BookingDetails(int bookingId, @NotNull String source, @NotNull String destination, @NotNull Date journeyDate,
			@NotNull int journeyDistance, @NotNull String foodPreferences, @NotNull String travelingWith, User user) {
		this.bookingId = bookingId;
		this.source = source;
		this.destination = destination;
		this.journeyDate = journeyDate;
		this.journeyDistance = journeyDistance;
		this.foodPreferences = foodPreferences;
		this.travelingWith = travelingWith;
		this.user = user;
	}

	public BookingDetails() {
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}

	public int getJourneyDistance() {
		return journeyDistance;
	}

	public void setJourneyDistance(int journeyDistance) {
		this.journeyDistance = journeyDistance;
	}

	public String getFoodPreferences() {
		return foodPreferences;
	}

	public void setFoodPreferences(String foodPreferences) {
		this.foodPreferences = foodPreferences;
	}

	public String getTravelingWith() {
		return travelingWith;
	}

	public void setTravelingWith(String travelingWith) {
		this.travelingWith = travelingWith;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "BookingDetails [bookingId=" + bookingId + ", source=" + source + ", destination=" + destination
				+ ", journeyDate=" + journeyDate + ", journeyDistance=" + journeyDistance + ", foodPreferences="
				+ foodPreferences + ", travelingWith=" + travelingWith + ", user=" + user + "]";
	}

}

