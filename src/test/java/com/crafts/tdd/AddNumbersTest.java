package com.crafts.tdd;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class AddNumbersTest {

  @Test
  public void should_return_zero_for_empty_string() {
    Assertions.assertThat(AddNumbers.add("")).isZero();
  }

  @Test
  public void should_return_one() {
    Assertions.assertThat(AddNumbers.add("1")).isEqualTo(1);
  }

  @Test
  public void should_return_three() {
    Assertions.assertThat(AddNumbers.add("1,2")).isEqualTo(3);
  }

  @Test
  public void should_return_ten() {
    Assertions.assertThat(AddNumbers.add("1,2,3,4")).isEqualTo(10);
  }

  @Test
  public void should_support_new_line_then_return_six() {
    Assertions.assertThat(AddNumbers.add("1\n2,3")).isEqualTo(6);
  }
}
