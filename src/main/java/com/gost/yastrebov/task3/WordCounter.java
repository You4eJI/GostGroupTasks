package com.gost.yastrebov.task3;

import java.util.*;

public class WordCounter {

    public Map<String, Integer> countWords(String text) {
        if (text.isEmpty())
            throw new IllegalArgumentException("text must not be empty");
        Map<String, Integer> wordCountMap = new HashMap<>();

        String noLineBreakText = text.replace("-\n", "");
        String[] words = noLineBreakText.split("[()«»,;:.!?\\s\\d]+");

        for (String word : words) {
            word = word.toLowerCase();
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        return sort(wordCountMap);
    }

    private Map<String, Integer> sort(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
        list.sort(((o1, o2) -> o2.getValue().compareTo(o1.getValue())));

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
}
