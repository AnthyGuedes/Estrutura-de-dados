package pkg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Grafo {
    private Map<String, List<Conexao>> grafoMapa = new HashMap<>();

    public static class Conexao {
        String nomeDestino;
        int distancia;

        Conexao(String nomeDestino, int distancia) {
            this.nomeDestino = nomeDestino;
            this.distancia = distancia;
        }
    }

    public void carregarGrafo(String caminhoArquivo) throws IOException {
        try (BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] partes = linha.split("@");
                String origem = partes[0];
                String destino = partes[1];
                int distancia = Integer.parseInt(partes[2]);

                grafoMapa.computeIfAbsent(origem, k -> new LinkedList<>()).add(new Conexao(destino, distancia));
                grafoMapa.computeIfAbsent(destino, k -> new LinkedList<>()).add(new Conexao(origem, distancia)); // Se o grafo for não direcionado
            }
        }
    }

    public List<Conexao> obterConexoes(String vertice) {
        return grafoMapa.get(vertice);
    }
}
