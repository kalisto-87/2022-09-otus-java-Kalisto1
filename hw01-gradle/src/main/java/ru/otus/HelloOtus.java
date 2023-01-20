package ru.otus;

import com.google.common.collect.Maps;
import com.google.common.collect.Range;

import java.util.NavigableMap;
import java.util.TreeMap;

public class HelloOtus {
    public static void main(String... args) {
        NavigableMap<String, String> map = new TreeMap<String, String>();
        map.put("ivanov", "11-11-11");
        map.put("petrov", "22-22-22");
        map.put("panov", "33-33-31");
        map.put("sidorov", "33-33-33");
        map.put("zhukov", "44-44-44");

        var subMap = Maps.subMap(map, Range.closed("panov", "sidorov"));
        System.out.println(subMap.toString());
    }
}
