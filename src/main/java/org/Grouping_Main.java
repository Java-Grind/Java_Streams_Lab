package org;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping_Main {
    record Student(String name, String level, int score) {}

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Ana", "junior", 78), new Student("Max", "junior", 91),
                new Student("Leo", "middle", 86), new Student("Eva", "middle", 95)
        );
        Map<String, Long> countByLevel = students.stream()
                .collect(Collectors.groupingBy(Student::level, Collectors.counting()));
        Map<String, Integer> scoreByLevel = students.stream()
                .collect(Collectors.groupingBy(Student::level, Collectors.summingInt(Student::score)));
        System.out.println("Students: " + countByLevel);
        System.out.println("Total score: " + scoreByLevel);
    }
}
