package com.tianyuan.stream;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "word","tian","yuan");
        words.stream().map(w -> w.toUpperCase()).collect(Collectors.toList()).forEach(s -> System.out.println(s));
        new Pair<>("")
    }

}
