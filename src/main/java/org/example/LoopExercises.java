package org.example;

public class LoopExercises {
    public int sum(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }

    public int sumUntilEven(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            if (sum % 2 == 0) {
                break;
            }
            i++;
        }
        return sum;
    }
}



