package com.example.demo.serviceInterface.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.BookingDetails;
import com.example.demo.entity.User;
import com.example.demo.repository.BookingDetailsRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.serviceInterface.BookingDetailsInterface;

@Service

public class BookingDetailsImpli implements BookingDetailsInterface {
	@Autowired
	private BookingDetailsRepository bookingDetailsRepository;
	@Autowired
	private UserRepository userRepository;

	@Override
	public void addBookingDetails(BookingDetails bookingDetails, int userId) {
		User user = userRepository.findById(userId).get();
		bookingDetails.setUser(user);
		bookingDetailsRepository.save(bookingDetails);
	}

	@Override
	public List<BookingDetails> getDetailsByUserID(String source, Integer userId) {
		List<BookingDetails> booking = bookingDetailsRepository.findAll();
		List<BookingDetails> bookingDetails1 = new ArrayList<BookingDetails>();
		for (BookingDetails bd : booking) {
			if ((bd.getSource().equalsIgnoreCase(source)) && (bd.getUser().getUserId() == userId))
				bookingDetails1.add(bd);
		}
		return bookingDetails1;

	}

	@Override
	public BookingDetails getBookingDetailsById(int BookingId) {
		return bookingDetailsRepository.findById(BookingId).get();

	}

	@Override
	public void editByBookingId(BookingDetails bookingDetails, int bookingId) {
		BookingDetails bd = bookingDetailsRepository.findById(bookingId).orElse(bookingDetails);
		bd.setSource(bookingDetails.getSource());
		bd.setDestination(bookingDetails.getDestination());
		bd.setJourneyDate(bookingDetails.getJourneyDate());
		bd.setJourneyDistance(bookingDetails.getJourneyDistance());
		bd.setFoodPreferences(bookingDetails.getFoodPreferences());
		bd.setTravelingWith(bookingDetails.getTravelingWith());
		bookingDetailsRepository.save(bd);

	}

}
