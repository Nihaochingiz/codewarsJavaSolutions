//Task: Count the smiley faces! https://www.codewars.com/kata/583203e6eb35d7980400002a

import java.util.*;


public class countTheSmileyFaces {

    static String validSmilyFaces =  ":) ;) :-) :~) ;-) ;~) :D ;D :-D :~D ;~D ;~) ;-D";


    public static int countSmileys(List<String> arr) {
        int counter = 0;

        for (int i =0; i < arr.size(); i++){

            if (validSmilyFaces.contains(arr.get(i))){
                counter++;
            }
        }
        return counter;

    }
}

