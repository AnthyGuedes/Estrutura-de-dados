package pkg;

import java.util.Objects;
import java.util.Scanner;

public class Atleta implements Comparable<Atleta> {
    Scanner tc = new Scanner(System.in);
    String fone; // primaria
    String nome;
    String apelido;
    String dataNascimento;
    int pontuacaoAcumulada;

    public Atleta() {
        System.out.println("Digite o fone(primaria) do atleta");
        this.fone = tc.nextLine();
        System.out.println("Digite o nome do atleta");
        this.nome = tc.nextLine();
        System.out.println("Digite o apelido do atleta");
        this.apelido = tc.nextLine();
        System.out.println("Digite a data de nascimento do atleta");
        this.dataNascimento = tc.nextLine();
        System.out.println("Digite a pontuacao atleta");
        this.pontuacaoAcumulada = tc.nextInt();
    }
	  public String getFone() {
	        return fone;
	    }

	    public void setFone(String fone) {
	        this.fone = fone;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getApelido() {
	        return apelido;
	    }

	    public void setApelido(String apelido) {
	        this.apelido = apelido;
	    }

	    public String getDataNascimento() {
	        return dataNascimento;
	    }

	    public void setDataNascimento(String dataNascimento) {
	        this.dataNascimento = dataNascimento;
	    }

	    public int getPontuacaoAcumulada() {
	        return pontuacaoAcumulada;
	    }

	    public void setPontuacaoAcumulada(int pontuacaoAcumulada) {
	        this.pontuacaoAcumulada = pontuacaoAcumulada;
	    }
	    
	    // Método toString
	    @Override
	    public String toString() {
	        return "Atleta{" +
	                "fone='" + fone + '\'' +
	                ", nome='" + nome + '\'' +
	                ", apelido='" + apelido + '\'' +
	                ", dataNascimento='" + dataNascimento + '\'' +
	                ", pontuacaoAcumulada=" + pontuacaoAcumulada +
	                '}';
	    }

	    // Método equals
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Atleta atleta = (Atleta) o;
	        return fone.equals(atleta.fone);
	    }

	    // Método hashCode
	    @Override
	    public int hashCode() {
	        return Objects.hash(fone);
	    }

	    // Método compareTo para ordenação em TreeSet
	    @Override
	    public int compareTo(Atleta outro) {
	        return this.nome.compareTo(outro.nome);
	    }
	}