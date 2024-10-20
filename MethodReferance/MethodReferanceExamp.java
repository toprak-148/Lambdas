package MethodReferance;

import java.util.function.Consumer;

public class MethodReferanceExamp {
    protected static Consumer<String> print1 = (s1) -> System.out.println(s1);
    protected static Consumer<String> print2 = System.out::println;

    public static void main(String[] args) {
        print1.accept("Hey What's up user");
        print2.accept("Hey What's up user");

    }

}
