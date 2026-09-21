package com.vcube.sbthapp01.repo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.vcube.sbthapp01.repo.CarRepo;

@Controller
public class CarController {

	@Autowired
	CarRepo carrepo;

	@GetMapping("/cars")
	public String listOfCar(Model model) {

		model.addAttribute("cars", carrepo.findAll());

		return "car";

	}
}
