package org.example;

public class Op {
    private static float n1;
    private static float n2;
    private static double result;

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public float getN1() {
        return n1;
    }

    public float getN2() {
        return n2;
    }

    public static double soma() {
        result = n1 + n2;
        System.out.println("soma: " + result);
        return result;
    }

    public static double sub() {
        result = n1 - n2;
        System.out.println("subtração: " + result);
        return result;
    }

    public static double div() {
        result = n1 / n2;
        if (n2 > n1) {
            System.out.println("Não foi possivel realizar a operação");
        } else {
            System.out.println("divisão: " + result);
            return result;
        }
        return 0;
    }

    public static double mult() {
        result = n1 * n2;
        System.out.println("multiplicação: " + result);
        return result;
    }

    public static double pot(){
        double result = Math.pow(n1,n2);
        System.out.println("potência: " + result);
        return result;
    }

    public static double sqrt(){
        double result = Math.sqrt(n1);
        System.out.println("raiz: " + result);
        return result;
    }
}
