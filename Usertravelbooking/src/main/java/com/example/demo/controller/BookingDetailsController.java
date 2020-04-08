package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.BookingDetails;
import com.example.demo.serviceInterface.BookingDetailsInterface;
import com.example.demo.serviceInterface.UserInterface;

@Controller
public class BookingDetailsController {
	@Autowired
	private BookingDetailsInterface bookingDetailsImpl;
	@Autowired
	private UserInterface userServices;

	@RequestMapping(value = "/bookTickets")
	public String viewBookingDetailsPage(Model model) {
		BookingDetails bookingDetails = new BookingDetails();
		List<Integer> userIdList = userServices.getAllUserIdList();
		model.addAttribute("userIdList", userIdList);
		model.addAttribute("bookingDetails", bookingDetails);
		return "bookTickets";
	}

	@RequestMapping(value = "/saveBookingDetails", method = RequestMethod.POST)
	public String savingBookingDetails(@ModelAttribute("bookingDetails") BookingDetails bookingDetails,
			@RequestParam(name = "userId") int userId) {
		
		bookingDetailsImpl.addBookingDetails(bookingDetails, userId);
		return "redirect:/";
	}
	
	@RequestMapping(value = "/getBookingDetails")
	public String getBookingDetails(Model model) {
		List<Integer> userIdList = userServices.getAllUserIdList();
		model.addAttribute("userIdList", userIdList);
		BookingDetails bookingDetails = new BookingDetails();
		model.addAttribute("bookingDetails", bookingDetails);
		return "getBookingDetails";
	}

	@RequestMapping(value = "/getDetailsByUserID", method = RequestMethod.GET)
	public String getDetailsByUserID(@RequestParam(name = "source", required = false) String source,
			@RequestParam(name = "userId", required = false) Integer userId, Model model) {
		System.out.println(userId);
		List<BookingDetails> bookingDetails2 = bookingDetailsImpl.getDetailsByUserID(source, userId);
		System.out.println(bookingDetails2.toString());
		model.addAttribute("bookingDetails2", bookingDetails2);
		return "getBookingDetailsPage";
	}

	@RequestMapping(value = "/edit/{bookingId}")
	public ModelAndView showEditPage(@PathVariable(name = "bookingId") int bookingId) {
		
		ModelAndView mav = new ModelAndView("showEditPage");
		BookingDetails bookingDetails = bookingDetailsImpl.getBookingDetailsById(bookingId);
		mav.addObject("bookingDetails", bookingDetails);
		return mav;
	}

	@RequestMapping(value = "/editBookingDetails", method = RequestMethod.POST)
	public String editingBookingDetails(@ModelAttribute("bookingDetails") BookingDetails bookingDetails,
			@RequestParam(name = "bookingId") int bookingId) {
		bookingDetailsImpl.editByBookingId(bookingDetails, bookingId);
		return "index";
	}
}
