package com.dio;

public abstract class funcionario {
    //atributos
    private String nome;
    private String cpf;

    protected final double SALARIO_MINIMO = 1000.0;

    public funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public abstract double calculaSalario();
}
