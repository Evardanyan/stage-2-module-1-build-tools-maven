package com.epam.demo;

import com.sun.tools.javac.util.StringUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        return args.stream().allMatch(StringUtils::isPositiveNumber);
    }
}