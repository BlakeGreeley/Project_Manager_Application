package com.codingdojo.projectmanager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.codingdojo.projectmanager.services.UserService;

@Controller
public class MainController {
	@Autowired
	private UserService userService;
}
