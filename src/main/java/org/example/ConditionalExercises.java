package org.example;

public class ConditionalExercises {
    public boolean lessThanFive(int x) {
        if (x < 5) {
            return true;
        } else {
            return false;
        }
        // return x < 5; simpler way to do it
    }

    public String getAgeGroup(int age) {
        if (age < 13) {
            return "child";
        } else if (age < 20) {
            return "teen";
        } else {
            return "adult";
        }
    }

    public boolean isValidPassword(String password) {
        int passwordLength = password.length();

        if (passwordLength >= 8) {
            return true;
        } else {
            return false;
        }
        //return passwordLength >= 8; simpler way to do it
    }
}
