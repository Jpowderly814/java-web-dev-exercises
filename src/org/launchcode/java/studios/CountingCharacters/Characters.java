package org.launchcode.java.studios.CountingCharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Characters {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a quote, sentence or phrase:");
        String quote = input.nextLine();
        quote = quote.toLowerCase();

        char[] charactersInString = quote.toCharArray();
        HashMap <Character, Integer> characterCount = new HashMap<>();

        for (char i: charactersInString){
            if (characterCount.containsKey(i)) {
                characterCount.put(i, characterCount.get(i)+1);
            }else{
                characterCount.put(i,1);
            }
        }
        for (Map.Entry<Character, Integer> display: characterCount.entrySet()){
            System.out.println(display.getKey() + ":" + display.getValue());
        }
    }
}
