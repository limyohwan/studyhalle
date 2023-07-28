package com.yohwan.study.generictest;

import java.util.ArrayList;
import java.util.List;

public class WildcardExample {
    // Unbounded Wildcards: 어떤 유형의 List든 처리 가능
    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    // Upper Bounded Wildcards: Number의 하위 클래스들만 처리 가능
    public static double sumOfList(List<? extends Number> list) {
        double sum = 0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }

    // Lower Bounded Wildcards: Integer 또는 Integer의 상위 클래스들만 처리 가능
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        List<Double> doubleList = List.of(1.5, 2.5, 3.5);
        List<Object> objectList = List.of("Hello");

        printList(intList); // 1 2 3 4 5
        printList(doubleList); // 1.5 2.5 3.5
        printList(objectList); // Hello

        System.out.println(sumOfList(intList)); // 15.0
        System.out.println(sumOfList(doubleList)); // 7.5

        List<Number> numList = new ArrayList<>();
        for(int i = 1; i <=5; i++) {
            numList.add(i);
        }
        addNumbers(numList); // Integer 리스트에 1부터 5까지의 값을 추가
        System.out.println("Modified integer list: " + numList); // Output: Modified integer list: [1, 2, 3, 4, 5, 1, 2, 3, 4, 5]
    }
}
