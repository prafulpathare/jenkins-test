package com.cigatee.test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cigatee.test.model.User;

@RestController
@RequestMapping("/user")
public class UserController {

	@PostMapping(value = "", produces = "application/json")
	public ResponseEntity<?> addUser(@RequestBody User user) {
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@GetMapping(value = "/error", produces = "application/json")
	public ResponseEntity<?> sendError() {
		return new ResponseEntity<>(HttpStatus.FORBIDDEN);
	}

	@GetMapping(value = "", produces = "application/json")
	public ResponseEntity<?> getUser() {
		return new ResponseEntity<>(
			new User(
					"Praful Pathare",
					"patharepraful@gmail.com",
				"sijdsiodjsiodjsiodjsijdsidj",
				"8976826373"
			),
		HttpStatus.FOUND);
	}

}
