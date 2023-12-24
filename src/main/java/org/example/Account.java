package org.example;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        int withoutSpaceLength = name.replaceAll(" ", "").length();
        int spaceCount = name.length() - withoutSpaceLength;
        if (name.length() >= 3 && name.length() <= 19 &&
                !name.startsWith(" ") && !name.endsWith(" ") &&
                spaceCount == 1) {
            return true;
        }
        else {
            return false;
        }
    }
}