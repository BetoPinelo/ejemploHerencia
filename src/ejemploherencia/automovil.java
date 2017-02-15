/**
 *
 * @author ISC Humberto Pinelo Rivera
 */
package ejemploherencia;

public class automovil extends vehiculo {

    @Override
    public void registrarVehiculo() {
        String estilo;
        System.out.print("Digite el modelo del automovil: ");
        modelo = Lector.nextInt();
        System.out.print("Digite el color del automovil: ");
        color = Lector.next();
       System.out.print("Digite el precio del automovil: ");
        precio = Lector.nextInt();
    }
    
}
