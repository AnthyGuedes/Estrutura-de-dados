package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OpTest {
    @Test
    void doisMaisDoisIgualQuatro() {
        Op operacao = new Op();
        operacao.setN1(2);
        operacao.setN2(2);

        var op = new Op();
        assertEquals(4, Op.soma());
    }

    @Test
    void DoiseMeioMaisDoiseMeioIgualCinco() {
        Op operacao = new Op();
        operacao.setN1(2.5F);
        operacao.setN2(2.5F);

        var op = new Op();
        assertEquals(5, Op.soma());
    }

    @Test
    void doisMaisCincoNegaticoIgualTresNegativo() {
        Op operacao = new Op();
        operacao.setN1(2);
        operacao.setN2(-5);

        var op = new Op();
        assertEquals(-3, Op.soma());
    }

    @Test
    void dezMaisDoiseMeioIgualDozeeMeio() {
        Op operacao = new Op();
        operacao.setN1(10);
        operacao.setN2(2.5F);

        var op = new Op();
        assertEquals(12.5, Op.soma());
    }


}