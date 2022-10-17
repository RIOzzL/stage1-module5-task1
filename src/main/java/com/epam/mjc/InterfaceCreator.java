package com.epam.mjc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class InterfaceCreator {

    public Predicate<List<String>> isValuesStartWithUpperCase() {
        Predicate<List<String>> predicate = x -> {
            for (String s : x) {
                if (Character.isDigit(s.charAt(0))) {
                    return false;
                }
                if (!s.startsWith(s.substring(0, 1).toUpperCase())) {
                    return false;
                }
            }
            return true;
        };
        return predicate;
        // throw new UnsupportedOperationException("You should implement this method.");
    }

    public Consumer<List<Integer>> addEvenValuesAtTheEnd() {
        return x -> {
            List<Integer> list2 = new ArrayList<>();
            int size = x.size();
            for (Integer integer : x) {
                if (integer % 2 == 0) {
                    list2.add(integer);
                }
            }
            x.addAll(list2);
        };
        //throw new UnsupportedOperationException("You should implement this method.");
    }

    public Supplier<List<String>> filterCollection(List<String> values) {
        Supplier<List<String>> supplier = () -> {
            List<String> collect = values.stream()
                    .filter(n -> n.startsWith(n.substring(0, 1).toUpperCase()))
                    .filter(n -> n.endsWith("."))
                    .filter(n -> n.split(" ").length > 3)
                    .collect(Collectors.toList());
            return collect;
        };
        return supplier;
        // throw new UnsupportedOperationException("You should implement this method.");
    }

    public Function<List<String>, Map<String, Integer>> stringSize() {
        Function<List<String>, Map<String, Integer>> function = new Function<List<String>, Map<String, Integer>>() {
            @Override
            public Map<String, Integer> apply(List<String> strings) {
                Map<String, Integer> map = new HashMap<>();
                for (String string : strings) {
                    map.put(string, string.length());
                }
                return map;
            }
        };
        return function;
        //throw new UnsupportedOperationException("You should implement this method.");
    }

    public BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList() {
        BiFunction<List<Integer>, List<Integer>, List<Integer>> biFunction = new BiFunction<List<Integer>, List<Integer>, List<Integer>>() {
            @Override
            public List<Integer> apply(List<Integer> integers, List<Integer> integers2) {
                List<Integer> list3 = new ArrayList<>();
                list3.addAll(integers);
                list3.addAll(integers2);
                return list3;
            }
        };
        return biFunction;
        //throw new UnsupportedOperationException("You should implement this method.");
    }
}
