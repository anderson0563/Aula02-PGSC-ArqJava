package br.eb.ime.aula02;

public class Fibonacci {
    public int calculo(int n){
        if(n<2) return n;
        return calculo(n-1)+calculo(n-2);
    }
}
