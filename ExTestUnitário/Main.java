package org.example;


public class Main {

    private static Op op = new Op();

    public static void main(String[] args) {
        int n1, n2, t;

        System.out.println("Calcular!");

        Op operacao = new Op();
        operacao.setN1(10);
        operacao.setN2(2.5F);

        do {
            Op.soma();

        } while (true);

        // Op.sub();
        // Op.div();
        // Op.mult();

    }
}
