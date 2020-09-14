package com.codegym.service;

import com.codegym.model.Dictionary;
import java.util.*;

public class dictionaryService {
    private static final Map<Integer, Dictionary> dictionaries = new HashMap<>();

    static {
        dictionaries.put(1, new Dictionary("hello", "xin chào"));
        dictionaries.put(2, new Dictionary("dog", "chó"));
        dictionaries.put(3, new Dictionary("cat", "mèo"));
        dictionaries.put(4, new Dictionary("bird", "chim"));
        dictionaries.put(5, new Dictionary("googbye", "tạm biệt"));
        dictionaries.put(6, new Dictionary("mouse", "chuột"));
            }

            public List<Dictionary> findAll(){
        return  new ArrayList<>(dictionaries.values());
            }
}
