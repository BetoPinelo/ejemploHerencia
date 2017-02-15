/**
 *
 * @author ISC Humberto Pinelo Rivera
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
