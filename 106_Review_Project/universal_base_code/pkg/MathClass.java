/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;

class MathClass {
    public double abs(double num) {
        if (num < 0) {
            return -num;
        } else {
            return num;
        }
    }

    public double max(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public double min(double a, double b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public double pow(double base, int exp) {
        double result = 1;
        int absExp = (exp < 0) ? -exp : exp;
        for (int i = 0; i < absExp; i++) {
            result *= base;
        }
        if (exp < 0) {
            return 1 / result;
        } else {
            return result;
        }
    }

    public double sqrt(double num) {
        double guess = num / 2.0;
        double precision = 1e-9;
        while (abs(guess * guess - num) > precision) {
            guess = (guess + num / guess) / 2.0;
        }
        return guess;
    }

    public double random(double min, double max) {
        return min + Math.random() * (max - min);
    }
}