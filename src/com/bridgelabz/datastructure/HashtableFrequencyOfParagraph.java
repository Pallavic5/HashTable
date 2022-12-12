package com.bridgelabz.datastructure;
/*
 * Problem statement UC - 2
 * Ability to find frequency of words in a large paragraph phrase “Paranoids are not paranoid because they are 
 * paranoid but because they keep putting themselves deliberately into paranoid avoidable situations”
 */
import java.util.HashMap;
import java.util.Set;

public class HashtableFrequencyOfParagraph {
	public static void userInputSentence(String userString) {
		HashMap<String, Integer> frequency = new HashMap<String, Integer>();
		String[] words = userString.split(" ");
		//Iteration
		for (String word : words) {
			if (frequency.containsKey(word)) {
				frequency.put(word, frequency.get(word) + 1);
			} else {
				frequency.put(word, 1);
			}
		}
		/*
		 * set is used to count the duplicate elements,because set saves only unique elements.
		 */
		Set<String> stringFrequency = frequency.keySet();
		System.out.println("Frequency of words in sentence 'Paranoids are not paranoid because"
				+ " they are paranoid but because they keep putting themselves deliberately into"
				+ " paranoid avoidable situations' is");
		for (String word : stringFrequency) {
			if (frequency.get(word) > 1)
				System.out.println(word + " = " + frequency.get(word) + " times.");
		}
	}
		//main method
	public static void main(String[] args) {
		System.out.println("Welcome to the HashTable program");
		userInputSentence("Paranoids are not paranoid because they are paranoid but because "
				+ "they keep putting themselves deliberately into paranoid avoidable situations");

	}

}
