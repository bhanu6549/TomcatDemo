package com.example.demo.serviceInterface;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.BookingDetails;
@Service

public interface BookingDetailsInterface {

	void addBookingDetails(BookingDetails bookingDetails, int userId);

	List<BookingDetails> getDetailsByUserID(String source, Integer userId);

	BookingDetails getBookingDetailsById(int bookingId);

	void editByBookingId(BookingDetails bookingDetails, int bookingId);

}
