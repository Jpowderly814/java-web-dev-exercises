package exercises;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        ArrayList<Integer> numbers = new ArrayList<>(
            Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        for(Integer number: numbers){
            if (number%2 ==0){
                total +=number;
            }
        }
        System.out.println(total);

        ArrayList<String> words = new ArrayList<>(
                Arrays.asList("llama", "dog", "tiger", "cow", "chicken"));
        System.out.println("How long of a word?");
        Integer length = input.nextInt();

        for (String word: words){
            if(word.length() == length){
                System.out.println(word);
            }

        }

    }
}
