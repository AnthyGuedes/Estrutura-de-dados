package pkg;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Grafo grafo = new Grafo();
        try {
            grafo.carregarGrafo("C:\\Users\\guede\\OneDrive\\Área de Trabalho\\JAVA\\ws-eclipse\\mapaCentral.txt");

            System.out.println("Conexões a Santa Maria:");
            for (Grafo.Conexao conexao : grafo.obterConexoes("Santa Maria")) {
                System.out.println("Destino: " + conexao.nomeDestino + ", Distância: " + conexao.distancia);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
