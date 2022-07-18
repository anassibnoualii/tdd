package com.crafts.tdd;

public class AddNumbers {

  private AddNumbers() {}

  public static Integer add(String input) {
    if (input.isEmpty()) {
      return 0;
    }
    String[] numbers = input.split(",");
    return getSum(numbers);
  }

  private static int getSum(String[] numbers) {
    int sum = 0;
    for (String currentNumber : numbers) {
      sum += stringToInt(currentNumber);
    }
    return sum;
  }

  private static int stringToInt(String number) {
    return Integer.parseInt(number);
  }
}
