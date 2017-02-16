/**
 *
 * @author ISC Humberto Pinelo Rivera
 * Book: Desarrollo de Sofware con NetBeans 7.1
 * Pages: 46 - 50
 */
package ejemploherencia;

public class EjemploHerencia {

    public static void main(String[] args) {
        // TODO code application logic here
        bicicleta Bicicleta = new bicicleta();
        Bicicleta.registrarVehiculo();
        
        automovil Automovil = new automovil();
        Automovil.registrarVehiculo();
    }
    
}
