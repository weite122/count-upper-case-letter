package com.github.hcsp.controlflow;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void test() {
        int n = new Random().nextInt(50) + 50;
        String str =
                IntStream.range(n, n + 20)
                        .mapToObj(i -> String.format("%c", i))
                        .collect(Collectors.joining(""));
        Assertions.assertEquals(
                (int) str.chars().filter(Character::isUpperCase).count(),
                Main.countUpperCaseLetters(str));
    }
}
