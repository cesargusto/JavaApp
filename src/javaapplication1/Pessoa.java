package javaapplication1;

/**
 *
 * @author cesar
 */
public class Pessoa {

    String nome;
    int idade;
    double peso;
    
    Pessoa(String nome, int idade, double peso){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }
    Pessoa(String nome){
        this.nome = nome;
        this.idade = 45;
        this.peso = 90.5;
    }
    String imprimePessoa(){
        return "Nome : "+nome +"\nIdade : "+idade+"\nPeso : "+peso;
    }
}
