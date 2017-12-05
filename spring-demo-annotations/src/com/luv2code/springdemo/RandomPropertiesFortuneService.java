package com.luv2code.springdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomPropertiesFortuneService implements FortuneService {
	
	// Retrieve fortune from properties file
@Value("${foo.fortune1}")
private String fortune1;

@Value("${foo.fortune2}")
private String fortune2;

@Value("${foo.fortune3}")
private String fortune3;

@Value("${foo.fortune4}")
private String fortune4;

@Value("${foo.email}")
private String email;


private List<String> data = new ArrayList<String>();

// the post constructor is needed whe I import value from the properties file, because:
// Spring injects the property values AFTER your constructor has been called. 
// So when you attempt to display values in your constructor, Spring hasn't injected the values yet.
	@PostConstruct
	public void showMyValues() {
		// create an array of Strings
		 data.add(fortune1);
		 data.add(fortune2);
		 data.add(fortune3);
		 data.add(fortune4);
	}



// create a random number generator
private Random myRandom = new Random();

@Override
public String getFortune() {
	// pick a random string from the array
			int index = myRandom.nextInt(data.size());
			String theFortune = data.get(index);
			return theFortune;
	}

}
