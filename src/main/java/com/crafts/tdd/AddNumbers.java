package com.crafts.tdd;

import static org.apache.commons.lang.StringUtils.isNumeric;

public class AddNumbers {

  private AddNumbers() {}

  public static Integer add(String input) {
    if (input.isEmpty()) {
      return 0;
    }
    String[] numbers = input.split("[,\n]");
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
    if (!isNumeric(number)) {
      throw new IllegalArgumentException("Invalid number");
    }
    var parsedNumber = Integer.parseInt(number);
    if (parsedNumber < 0) {
      throw new IllegalArgumentException("negatives not allowed");
    }
    return parsedNumber;
  }
}
