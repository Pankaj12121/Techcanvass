package com.demo.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Regex : ^[0-9]{5}(?:-[0-9]{4})?$

^           # Assert position at the beginning of the string.
[0-9]{5}    # Match a digit, exactly five times.
(?:         # Group but don't capture:
  -         #   Match a literal "-".
  [0-9]{4}  #   Match a digit, exactly four times.
)           # End the non-capturing group.
  ?         #   Make the group optional.
$           # Assert position at the end of the string.*/
public class RegEx {
	public static void main(String[] args) {

		List<String> zips = new ArrayList<String>();

		//Valid ZIP codes
		zips.add("12345"); 
		zips.add("12345-6789"); 

		//Invalid ZIP codes
		zips.add("123456"); 
		zips.add("1234"); 
		zips.add("12345-678");

		zips.add("12345-67890");

		String regex = "^[0-9]{5}(?:-[0-9]{4})?$";

		Pattern pattern = Pattern.compile(regex);

		for (String zip : zips)
		{
			Matcher matcher = pattern.matcher(zip);
			System.out.println(matcher.matches());
		}

	}
}