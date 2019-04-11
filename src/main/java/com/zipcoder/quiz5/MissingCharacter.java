package com.zipcoder.quiz5;

import java.util.ArrayList;
import java.util.List;

public class MissingCharacter {

    /**
     * Given a text, return a list of all the characters that are missing from
     * the text. For example, if the text is `abc`, then the missing chars
     * are `defghijklmnopqrstuvwxyz`.
     * @param text
     * @return a list of all the missing characters from the text
     */


    public List<Character> getMissingChars(String text) {
        List<Character> all = new ArrayList<>();
        char now = 'a';
        while (now <= 'z') {
            all.add(now++);
        }
        for (Character c : text.toCharArray()) {
            all.remove(c);
        }
        return all;
    }
}
