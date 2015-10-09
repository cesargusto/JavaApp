
package javaapplication1;

/**
 *
 * @author cesar
 */
public class JavaApplication1 {


    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Cesar Augusto",30,82.5);
        Pessoa p2 = new Pessoa("Maria Jose");
        System.out.println(p1.imprimePessoa());
        System.out.println(p2.imprimePessoa());
        Carro car = new Carro();
        System.out.println(car.piloto.getNome());
        Carro car2 = new Carro(p2);
        System.out.println("Piloto do Carro 2 : \n"+car2.piloto.imprimePessoa());
        
    }
    
}
