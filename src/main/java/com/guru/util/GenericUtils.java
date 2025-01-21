package com.guru.util;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class GenericUtils {
    // Generic method to filter a list based on a condition
    public static <T> List<T> filterList(List<T> inputList, Predicate<T> condition) {
        List<T> result = new ArrayList<>();
        for (T item : inputList) {
            if (condition.test(item)) {
                result.add(item);
            }
        }
        return result;
    }
}
