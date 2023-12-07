package org.example.Pessoas;

public class Pessoa {
    private String nome;
    private Integer sexo;
    private Integer idade;

    public Pessoa(String nome, Integer sexo, Integer idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;

        if (sexo > 3){
            throw new RuntimeException("Sexo inválido");
        }


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getSexo() {
        return sexo;
    }

    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {

        String opcao = null;
        if (sexo == 1) {
            opcao = "Masculino";
        } else if (sexo == 2) {
            opcao = "Feminino";
        } else if (sexo == 3) {
            opcao = "Outro";
        }

        return


                "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sexo=" + opcao +
                ", idade=" + idade +
                '}';
    }
}
