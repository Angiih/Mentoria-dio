package com.dio;

import com.dio.br.Funcionario;

public class consultor extends Funcionario {
    //atributos
    private double valorHora;
    private double horasTrabalhadas;

    public consultor(String nome, String cpf, double valorHora; double horasTrabalhadas){
     super(nome, cpf);
     this.valorHora = valorHora;
     this.horasTrabalhadas = horasTrabalhadas;

    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calculaSlario(){
        return valorHora * horasTrabalhadas;


    }
}
