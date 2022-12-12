package com.bridgelabz.datastructure;
/*Problem Statement - UC-1
 * Ability to find frequency of words in a sentence like “To be or not to be”
 */
import java.util.HashMap;
import java.util.Set;

public class HashTable {
	// create method to calculate the frequency of sentence.
	public static void printSentence(String stringValue) {
		HashMap<String, Integer> frequency = new HashMap<String, Integer>();
		String[] words = stringValue.split(" ");
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
		System.out.println("Frequency Of Each word in Sentence: \n 'To Be Or Not To Be'");
		//iteration
		for (String word : stringFrequency) {
			System.out.println(word + " = " + frequency.get(word) + " times.");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the HashTable program");
		printSentence("To Be Or Not To Be");
	}

}
