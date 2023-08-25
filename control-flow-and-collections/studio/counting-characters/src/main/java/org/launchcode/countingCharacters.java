package org.launchcode;

import javax.xml.stream.events.Characters;
import java.util.HashMap;

public class countingCharacters {
    public static void main(String[] args) {
        String text = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        HashMap<Character, Integer> countChar = new HashMap<>();

        char[] charactersInString = text.toCharArray();
       // System.out.println(charactersInString);

        for (char i : charactersInString) {
            //System.out.println(i);

            if (countChar.containsKey(i)) {
                int total = countChar.get(i);
                countChar.put(i, total + 1);
            }else{
                countChar.put(i, 1);
            }
        }

        for(char countKey : countChar.keySet()) {
            int getKey = countChar.get(countKey);
            System.out.println(countKey + ": " + getKey);;
        }


    }
}
