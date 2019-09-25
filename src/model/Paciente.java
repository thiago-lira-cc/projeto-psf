package model;

public class Paciente {
    //Variáveis, características do paciente
    private String nome;
    private int sus;
    private String endereco;
    private String fone;
    private String datanasc;
    private String anotacoes;
    private String situacao;
    private String tipo;

    public Paciente(){}
    //Construtor
    @SuppressWarnings("empty-statement")
    public Paciente(String nome, int sus, String endereco, String fone, String datanasc, String anotacoes, String situacao) {;
        this.nome = nome;
        this.sus = sus;
        this.endereco = endereco;
        this.fone = endereco;
        this.datanasc = datanasc;
        this.anotacoes = anotacoes;
        this.situacao = situacao;
        this.tipo = tipo;
    }
    //Getter's e Setter's
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSus() {
        return sus;
    }

    public void setSus(int sus) {
        this.sus = sus;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }

    public String getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
    }   

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}