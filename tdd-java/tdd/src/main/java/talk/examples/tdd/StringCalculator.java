package talk.examples.tdd;

/**
 *  Simple example of TDD
 *
 * Create a simple String calculator with a method int Add(string numbers):
 *   The method can take 0, 1 or 2 numbers, and will return their sum
 *      (for an empty string it will return 0) for example “” or “1” or “1,2”
 *
 *   Start with the simplest test case of an empty string and move to 1 and two numbers.
 *   Remember to solve things as simply as possible so that you force yourself
 *      to write tests you did not think about.
 *   Remember to refactor after each passing test.
 */
public class StringCalculator
{
    public StringCalculator() {}

    public int add(String input) {
        if (input == "")
            return 0;

        int result = 0;

        String[] numbers = input.split(",");

        for (int i = 0; i < numbers.length; i++)
            result += Integer.parseInt(numbers[i]);

        return result;
    }
}
