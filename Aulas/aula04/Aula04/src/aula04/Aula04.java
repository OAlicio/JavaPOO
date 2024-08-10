
package aula04;

public class Aula04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Caneta c1 = new Caneta("NIC", "Amarela", 0.4f);// Atraves do construtor
        
        Caneta c1 = new Caneta("BIC", 0.5f, "Azul");
        
        //c1.setModelo("BIC");
        
        //c1.setPonta(0.5f);
        
        //c1.status();
        
        System.out.println("Tenho uma caneta " + c1.getModelo() + ", com uma ponta " + c1.getPonta());
        
    }
    
}
