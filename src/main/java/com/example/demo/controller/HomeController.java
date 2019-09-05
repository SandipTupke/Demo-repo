package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.home.HomePage;

@RestController
public class HomeController
{
  @RequestMapping("/getpages")
  public HomePage getpags()
  {
	  HomePage hm=new HomePage();
	  hm.setHid(10);
	  hm.setPagename("first page");
	  
	return hm;
	  
  }
}
