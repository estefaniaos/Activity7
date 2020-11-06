package com.company;

public class Fibonacci {
    int n;

    public void Fibonacci(){
        this.n = 0;
    }

    public int[] getPrimes(int n){
        this.n = n;
        int cont = 0;
        int[] primes = new int[n];
        int nCont = 0;
        int j = 1;

        while (cont < n) {
            for (int i = 1; i <= j; i++) {
                if(j%i == 0){
                    nCont++;
                }
                //System.out.println(j + "%" + i + " == 0 && " + i + "!=" + j +" && " +i +"!= 1");
            }

            if(nCont == 2){
                primes[cont] = j;
                cont++;
            }

            j++;
            nCont=0;
        }
        return primes;

    }

    public int[] getFibonacci(int n){
        this.n = n;
        int n1 = 0, n2 = 1;
        int suma = 0;
        int[] cadena = new int[n];

        cadena[0] = n1;
        cadena[1] = n2;

        for (int i = 2; i < n; i++) {
            suma = cadena[i-2] + cadena[i-1];
            //System.out.println(suma + " = " + cadena[i-2] + " + " + cadena[i-1]);
            cadena[i] = suma;
        }

        return cadena;
    }
}
