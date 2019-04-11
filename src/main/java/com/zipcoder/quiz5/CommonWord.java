package com.zipcoder.quiz5;

import java.util.*;

public class CommonWord {

    /**
     * Read the text and count each word in the text. Return the word and its
     * count in descending order to see what's the common word used in the text.
     * Store the word and its count in an Entry object.
     * @param text
     * @return a list of word and its count in descending order stored in the object entry
     */
    public List<Entry> getCommonWord(String text) {
        Map<String, Integer> map = new HashMap<>();
        String[] parsed = text.split(" ");
        for (String word: parsed) {
            if (map.containsKey(word.toLowerCase())) {
                map.put(word.toLowerCase(), map.get(word.toLowerCase()) + 1);
            }
            else {
                map.put(word.toLowerCase(), 1);
            }
        }
        List<Entry> entries = new ArrayList<>();
        while (!map.isEmpty()) {
            String[] keys = map.keySet().toArray(new String[0]);
            String mostCommon = keys[0];
            for (String key: keys) {
                if (map.get(key) > map.get(mostCommon)) mostCommon = key;
            }
            entries.add(new Entry(mostCommon, map.get(mostCommon)));
            map.remove(mostCommon);
        }
        return entries;
    }
}
