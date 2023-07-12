package br.rtomokane.entity;

import br.rtomokane.annotation.PrimeiraAnotacao;

@PrimeiraAnotacao(value = "Ricardo", bairros = "Teste", numeroCasa = 10)
public class ClasseComAnotacao {

    @PrimeiraAnotacao(value = "Tomo", bairros = {"Teste", "Teste1"}, numeroCasa = 20, valores = 100d)
    private String nome;

    @PrimeiraAnotacao(value = "Ricardo", bairros = "Teste", numeroCasa = 10)
    public ClasseComAnotacao(){

    }
}
