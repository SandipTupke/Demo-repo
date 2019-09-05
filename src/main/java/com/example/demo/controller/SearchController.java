package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController 
{
  
	@RequestMapping("/search")
	public String searchpages() {

		return "this is a search page";

	}

}