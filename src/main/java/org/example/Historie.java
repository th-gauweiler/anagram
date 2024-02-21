package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Historie {

    Map<Anagram, List<String>> history = new HashMap<>();

    public void add(Anagram anagram) {
        if (!history.containsKey(anagram)) {
            List<String> newList = new ArrayList<>();
            history.put(anagram, newList);
        }
        List<String> currentList = history.get(anagram);
        currentList.add(anagram.getSeed());
    }

    public List<String> listFor(String seed) {
        Anagram anagram = new Anagram(seed);
        if (!history.containsKey(anagram)) {
            return new ArrayList<>();
        }
        return history.get(anagram)
                .stream()
                .filter((element)->!element.equals(seed))
                .collect(Collectors.toList());
    }
}
