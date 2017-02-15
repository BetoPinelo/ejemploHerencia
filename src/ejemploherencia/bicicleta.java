/**
 *
 * @author ISC Humberto Pinelo Rivera
 */
package ejemploherencia;

public class bicicleta extends vehiculo{

    @Override
    public void registrarVehiculo() {
        System.out.print("Digite el color de la bicileta: ");
        color = Lector.next();
        System.out.print("Digite el precio de la bicileta: ");
        precio = Lector.nextInt();
    }
    
}
