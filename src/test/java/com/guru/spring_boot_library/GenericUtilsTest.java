package com.guru.spring_boot_library;

import com.guru.spring_boot_library.util.GenericUtils;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenericUtilsTest {

    @Test
    void testFilterList() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = GenericUtils.filterList(numbers, n -> n % 2 == 0);

        assertEquals(Arrays.asList(2, 4, 6), evenNumbers);
    }
}