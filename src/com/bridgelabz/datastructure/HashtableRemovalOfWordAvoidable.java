package com.bridgelabz.datastructure;
/*
 * Problem Statement - UC - 3
 * Remove avoidable word from the phrase “Paranoids are not paranoid because they are paranoid but
because they keep putting themselves deliberately into paranoid avoidable situations”
 */
import java.util.HashMap;
import java.util.Set;

public class HashtableRemovalOfWordAvoidable {
	public static void userInputSentence(String userString) {
		HashMap<String, Integer> frequency = new HashMap<String, Integer>();
		String[] words = userString.split(" ");
		for (String word : words) {
			if (frequency.containsKey(word)) {
				frequency.put(word, frequency.get(word) + 1);
			} else {
				frequency.put(word, 1);
			}
		}
		Set<String> stringFrequency = frequency.keySet();
		System.out.println("Frequency of words in sentence 'Paranoids are not paranoid because"
				+ " they are paranoid but because they keep putting themselves deliberately into"
				+ " paranoid avoidable situations' is");
		for (String word : stringFrequency) {
			if (frequency.get(word) > 1)
				System.out.println(word + " = " + frequency.get(word) + " times.");
		}
	}
		//create method for remove avoidable word from the phrase 
	public static void remove(String string, String removeWord) {
		String[] stringArray = string.split(" ");
		String newSentenceAfterRemovingWord = " ";

		for (String words : stringArray) {

			if (!words.equals(removeWord)) {
				newSentenceAfterRemovingWord = newSentenceAfterRemovingWord + words + " ";
			}
		}
		System.out.println(newSentenceAfterRemovingWord);
	}

	public static void main(String[] args) {
		userInputSentence("Paranoids are not paranoid because they are paranoid but because "
				+ "they keep putting themselves deliberately into paranoid avoidable situations");
		String userString = "Paranoids are not paranoid because they are paranoid but because\nthey keep putting themselves deliberately into paranoid avoidable situations";
		String removeWord = "avoidable";
		remove(userString, removeWord);
	}

}
