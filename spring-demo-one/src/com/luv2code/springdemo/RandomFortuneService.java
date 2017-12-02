package com.luv2code.springdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		List<String> fortunes = new ArrayList<String>();
		fortunes.add("fortune 1");
		fortunes.add("fortune 2");
		fortunes.add("fortune 3");
		Random random = new Random();
		String aFortune = fortunes.get(random.nextInt(3));
		return aFortune;
	}

}
