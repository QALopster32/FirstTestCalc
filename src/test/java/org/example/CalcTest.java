package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {


    @BeforeAll
    public static void setUp() {
        System.out.println("Before all");
    }

    @BeforeEach
    public void setUpEach() {
        System.out.println("Before each");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After all");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("After each");
    }

    @Test
    @DisplayName("Проверка суммирования 1")
    @Timeout(10)
    @Tag("summ")
    void summ1() {
        Calc calc = new Calc();
        int result = calc.summ(1, 6);
        Assertions.assertEquals(7, result, "Не тот ответ");
    }

    @Test
    @DisplayName("Проверка суммирования 2")
    @Timeout(10)
    @Tag("summ")
    void summ2() {
        Calc calc = new Calc();
        int result = calc.summ(2, 6);
        Assertions.assertEquals(8, result, "Не тот ответ");


    }

    @ParameterizedTest(name = "#{index} - сложение {0} и {1}, ожидаем {2}")
    @CsvSource({"1, 2, 3", "-1, 2, 1", "0, 0, 0"})
    @DisplayName("Проверка суммирования 3, ParametrizedTest")
    @Tag("summ")
    void summ3(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.summ(a, b);
        Assertions.assertEquals(expectedResult, result, "Не тот ответ");

    }

    @Test
    @DisplayName("Проверка разности 1")
    @Timeout(10)
    @Tag("sub")
    void sub1(){
        Calc calc = new Calc();
        int result = calc.subtraction(2, 1);
        Assertions.assertEquals(1, result, "Не тот ответ");
    }

    @ParameterizedTest(name = "#{index} - разность {0} и {1}, ожидаем {2}")
    @CsvSource({"2, 1, 1", "1, 2, -1", "1, -2, 3"})
    @DisplayName("Проверка разности 2, ParametrizedTest")
    @Tag("sub")
    void  sub2(int a, int b, int expextedResult){
        Calc calc = new Calc();
        int result = calc.subtraction(a, b);
        Assertions.assertEquals(expextedResult, result, "Не тот ответ");
    }
}

