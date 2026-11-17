package org;

import java.util.List;
import java.util.stream.Stream;

public class LazyPipeline_Main {
    public static void main(String[] args) {
        System.out.println("Pipeline created");
        Stream<String> pipeline = List.of("java", "sql", "spring", "git").stream()
                .peek(item -> System.out.println("source: " + item))
                .filter(item -> item.length() > 3)
                .peek(item -> System.out.println("passed: " + item))
                .map(String::toUpperCase);
        System.out.println("No source line appeared yet");
        System.out.println("Result: " + pipeline.limit(2).toList());
    }
}
