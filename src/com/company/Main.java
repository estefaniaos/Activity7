package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n = 42;
        int[] nPrimes = new int[n];
        int[] nFibonacci = new int[n];

        Fibonacci x = new Fibonacci();
        x.Fibonacci();

        nPrimes = x.getPrimes(n);
        nFibonacci = x.getFibonacci(n);

        System.out.println("Numeros primos hasta " + n);
        for (int i = 0; i < nPrimes.length; i++) {
            System.out.print(nPrimes[i] + ", ");
        }

        System.out.println();

        System.out.println("Cadena de Fibonacci hasta " + n);
        for (int i = 0; i < nFibonacci.length; i++) {
            System.out.print(nFibonacci[i] + ", ");
        }

    }
}
