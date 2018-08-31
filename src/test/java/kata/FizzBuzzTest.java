package kata;

import org.junit.Test;


import static kata.FizzBuzz.play;
import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    public void when_play_generic_number_should_return_itself() {
        final int numberInput = 2;
        final String number = play(numberInput);
        assertThat(number).isEqualTo("2");
    }

    @Test
    public void fizz_when_number_is_multiple_of_3() {
        final int multipleOfThree = 6;
        final String fizz = play(multipleOfThree);
        assertThat(fizz).isEqualTo("Fizz");
    }

    @Test
    public void fizz_when_number_is_multiple_of_3bis() {
        final int multipleOfThree = 6;
        final String fizz = play(multipleOfThree);
        assertThat(fizz).isEqualTo("Fizz");
    }

    @Test
    public void buzz_when_number_is_multiple_of_5() {
        final int multipleOfFive = 10;
        final String buzz = play(multipleOfFive);
        assertThat(buzz).isEqualTo("Buzz");
    }

    @Test
    public void fizzbuzz_when_number_is_multiple_of_3_and_5() {
        final int multipleOfThreeAndFive = 15;
        final String fizzbuzz = play(multipleOfThreeAndFive);
        assertThat(fizzbuzz).isEqualTo("FizzBuzz");
    }

    @Test
    public void fizzbuzz_when_number_is_multiple_of_7() {
        final int multipleOfSeven = 14;
        final String quack = play(multipleOfSeven);
        assertThat(quack).isEqualTo("Quack");
    }

    @Test
    public void fizzquack_when_number_is_multiple_of_3_and_7() {
        final int multipleOfThreeAndSeven = 21;
        final String fizzquack = play(multipleOfThreeAndSeven);
        assertThat(fizzquack).isEqualTo("FizzQuack");
    }

    @Test
    public void buzzquack_when_number_is_multiple_of_5_and_7() {
        final int multipleOfFiveAndSeven = 35;
        final String buzzquack = play(multipleOfFiveAndSeven);
        assertThat(buzzquack).isEqualTo("BuzzQuack");
    }
    @Test
    public void fizzbuzz_play_to_3(){

        final int end = 3;

        final String result = FizzBuzz.playTo(end);

        assertThat(result).isEqualTo("1, 2, Fizz");
    }

    @Test
    public void fizzbuzz_play_to_5(){

        final int end = 5;

        final String result = FizzBuzz.playTo(end);

        assertThat(result).isEqualTo("1, 2, Fizz, 4, Buzz");
    }


}
