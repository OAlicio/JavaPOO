
package contabanco;

/**
 *
 * @author Mavi da Vintch
 */
public class ContaBanco {

    public static void main(String[] args) {
    
        Conta p1 = new Conta();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        p1.depositar(100);
        
        Conta p2 = new Conta();
        p2.setNumConta(2222);
        p2.setDono("Cleúsia");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(100);
        
        //p1.sacar(150);
        //p1.fecharConta();
        
        p1.status();
        p2.status();
    }
    
}
