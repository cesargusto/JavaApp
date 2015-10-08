package javaapplication1;

/**
 *
 * @author cesar
 */
public class Carro {
    
    Pessoa piloto;
    
    Carro(){
        this.piloto = new Pessoa("Reinaldo");
    }
    
    Carro(Pessoa pes){
        this.piloto = pes;
    }
}
