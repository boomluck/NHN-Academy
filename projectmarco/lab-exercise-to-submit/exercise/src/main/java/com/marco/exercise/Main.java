package com.marco.exercise;

import java.util.Random;
import org.apache.commons.math3.random.RandomDataGenerator;

public class Main {
    public static void main(String[] args) {
        Random utilRandom = new Random();
        int utilRandomNumber = utilRandom.nextInt(100);
        System.out.println(utilRandomNumber);

        RandomDataGenerator apacheRandom = new RandomDataGenerator();
        int apacheRandomNumber = apacheRandom.nextInt(0, 100);
        System.out.println(apacheRandomNumber);

        // 이 이하로 자동완성돼 버린 내용. vscode 버그인 듯
        String testString = "";
        String nullString = null;
        String nonEmptyString = "Hello";
        System.out.println(isNullOrEmpty(testString)); // true
        System.out.println(isNullOrEmpty(nullString)); // true
        System.out.println(isNullOrEmpty(nonEmptyString)); // false
    }

    // 자동완성된 코드
    public static boolean isNullOrEmpty(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        return false;
    }
}