

/**
 *
 * @author anibal
 */
public class Ex1 {
    public static void main (String [] args){
         
        Retangulo resultado = new Retangulo(4, 6);
        
        Retangulo resultado2 = new Retangulo();
        resultado2.setAltura(40);
        resultado2.setBase(10);
        
        
        resultado.calcularArea();
        resultado2.calcularArea();
        
        
    }
    
}
