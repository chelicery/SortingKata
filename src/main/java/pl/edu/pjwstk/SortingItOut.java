package pl.edu.pjwstk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Kata11
 */
public class SortingItOut {


    public List<Integer> sortNumbers(ArrayList<Integer> numbers){
        Collections.sort(numbers);

        return numbers;
    }

    public String sortLetters(String sentence){
        sentence = sentence.replaceAll("[^\\w]", "").toLowerCase();
        char[] splittedSentence = sentence.toCharArray();
        char temp = 0;

        for(int i=0; i < splittedSentence.length -1; i++){
            for(int j = 1; j < splittedSentence.length-i; j++){
                if(splittedSentence[j-1] > splittedSentence[j]){
                    temp = splittedSentence[j-1];
                    splittedSentence[j-1] = splittedSentence[j];
                    splittedSentence[j] = temp;
                }
            }
        }
//        for(char c : splittedSentence){
//            System.out.println(c);
//        }
        return new String(splittedSentence);
    }


}
