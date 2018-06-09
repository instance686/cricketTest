package com.cricbuzz.test.sample.cricbuzztest.service;

import org.springframework.stereotype.Service;

@Service
public class MatchServiceImpl  implements MatchesService{

	@Override
	public String testResult() {
		return "TEST";
	}

}
