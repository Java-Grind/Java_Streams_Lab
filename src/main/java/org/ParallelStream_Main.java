package org;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStream_Main {
    public static void main(String[] args) {
        runExperiment("Sequential stream", IntStream.rangeClosed(1, 1_000_000).boxed());
        runExperiment("Parallel stream", IntStream.rangeClosed(1, 1_000_000).parallel().boxed());
    }

    private static void runExperiment(String name, Stream<Integer> stream) {
        Instant start = Instant.now();
        long count = stream.filter(ParallelStream_Main::isPrime).count();
        System.out.printf("%s: %d primes in %.2f seconds%n", name, count,
                Duration.between(start, Instant.now()).toMillis() / 1_000.0);
    }

    private static boolean isPrime(int number) {
        for (int divisor = 2; divisor * divisor <= number; divisor++) if (number % divisor == 0) return false;
        return number >= 2;
    }
}
