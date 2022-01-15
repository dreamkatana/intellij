package br.com.edusys;

import br.com.edusys.model.Gato;

public class firstrun {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("Problema 1", 300);
        System.out.println(livro1);
        System.out.println("etette");
    }

}

class Livro {
    private String nomel;
    private Integer numPaginas;

    public Livro(String nomel, Integer numPaginas) {
        this.nomel = nomel;
        this.numPaginas = numPaginas;
    }

    public String getNomel() {
        return nomel;
    }

    public void setNomel(String nomel) {
        this.nomel = nomel;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Livro{" +
                "nomel='" + nomel + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}