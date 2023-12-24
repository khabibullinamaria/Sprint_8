package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(Parameterized.class)
public class AccountTests {

    private String name;
    private boolean expectedResult;

    public AccountTests(String name, boolean expectedResult){
        this.name = name;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] orderData() {
        return new Object[][] {
                { "Тимоти Шаламе", true },
                { "ТимотейШевроле", false },
                { "Тимотей  Шевроле", false },
                { "ТШ", false },
                { "123456789 1234567890", false },
                { " Тимоти Шаламе", false },
                { "Тимоти Шаламе ", false },
        };
    }

    @Test
    public void checkNameToEmbossTests() {
        Account account = new Account(name);

        var result = account.checkNameToEmboss();

        assertEquals(expectedResult, result);
    }
}
