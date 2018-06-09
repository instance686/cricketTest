package com.cricbuzz.test.sample.cricbuzztest.controller;

import java.io.IOException;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cricbuzz.test.sample.cricbuzztest.service.MatchesService;

@RestController
public class MatchesController {
	
	@Autowired
	MatchesService matchesService;
	
	@GetMapping("/api/test/api")
	public ResponseEntity<String> testApi() {

		return new ResponseEntity<String>(matchesService.testResult(), HttpStatus.CREATED);
	}

}
