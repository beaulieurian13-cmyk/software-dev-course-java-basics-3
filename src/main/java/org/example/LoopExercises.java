package org.example;

public class LoopExercises {
    public int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;

        }
        return sum;
       }

    public int sumUntilEven(int n) {
        int sum = 0;
        int counter = 1;


        while (counter <= n && counter % 2 != 0) {
            sum = sum + counter;
            counter++;

        }
        return sum;

    }
}
