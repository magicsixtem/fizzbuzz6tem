package kata;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
    public static FizzBuzz FIZZ = new FizzBuzz(3, "Fizz");
    public static FizzBuzz BUZZ = new FizzBuzz(5, "Buzz");
    public static FizzBuzz QUACK = new FizzBuzz(7, "Quack");

    private static List<FizzBuzz> ALL = new ArrayList<>();

    static {
        ALL.add(FIZZ);
        ALL.add(BUZZ);
        ALL.add(QUACK);
    }

    private final int moduloNumber;
    private final String resultString;

    private FizzBuzz(int moduloNumber, String resultString) {

        this.moduloNumber = moduloNumber;
        this.resultString = resultString;
    }

    public static String play(int number) {
        final String result = ALL.stream()
                .reduce("", (acc, fizzBuzz) -> fizzBuzz.getResult(number, acc), (identity, acc) -> acc);
        if (!result.equals("")) {
            return result;
        }
        return String.valueOf(number);
    }

    private String getResult(int number, String result) {
        if (isMultiple(number)) {
            result += this.resultString;
        }
        return result;
    }

    private boolean isMultiple(int number) {
        return number % this.moduloNumber == 0;
    }


    public static String playTo(int end) {
        return IntStream.range(1, end + 1).mapToObj(FizzBuzz::play).collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        System.out.println(FizzBuzz.playTo(100));
    }
}
