package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.*;

public class AssertTest {

    @Test
    public void AssetTest() {
        assertFalse(4 > 3, "Выражение верно, ошибка!");
    }

    @ParameterizedTest
    @NullSource
    public void assertTest(String str) {

        str = "Строка";
        assertNull(str, "str in NOT null");
    }

    @ParameterizedTest
    @NullSource
    public void assertTest1(String str) {

        str = "Строка";
        assertNotNull(str, "str in null");


    }

}
