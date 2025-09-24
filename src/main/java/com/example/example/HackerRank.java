package com.example.example;

import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@Component
public class HackerRank {


    public void doExercise() {
        //fizzBuzz(15);
        //getThirdmax();
        //reverseString();

    }

    private void reverseString() {
       String input = "Hi Pradeepa";
       StringBuilder reversedString = new StringBuilder(input).reverse();
        System.out.println("reversedString : "+reversedString);
        List<String> res = List.of(input.split(" "));
        System.out.println(res.stream()
                .map(s-> new StringBuilder(s).reverse())
                .collect(Collectors.joining(" ")));
       List<StringBuilder> tokenizedList = new ArrayList<>();
       StringTokenizer st = new StringTokenizer(input);
       while (st.hasMoreTokens()) {
           tokenizedList.add(new StringBuilder( st.nextToken()).reverse());
       }
       // tokenizedList.forEach(System.out::println);
        //Stream.of(tokenizedList).forEach(System.out::print);
       // System.out.println(String.join(" ", tokenizedList));

    }

    private void getThirdmax() {
        List<Integer> inputList = Arrays.asList(1,2,3,4,5,6,7);
        Integer res = inputList.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(2)
                .findFirst()
                .orElse(null);
        System.out.println("res : "+res);
    }

    private void fizzBuzz(int n) {
        System.out.println("Test");
        IntStream.rangeClosed(1,n)
                .mapToObj(i -> {
                    if (i % 3 == 0 && i%5 == 0)
                        return "FizzBuzz";
                    if (i % 3 == 0)
                        return "Fizz";
                    if (i%5 == 0)
                        return "Buzz";
                    return i;
                })
                .forEach(System.out::println);
    }
}
