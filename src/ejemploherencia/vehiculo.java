/**
 *
 * @author ISC Humberto Pinelo Rivera
 */
package ejemploherencia;

import java.util.Scanner;

public abstract class vehiculo {
    
    protected int modelo;
    protected String color;
    protected String marca;
    protected double precio;
    
    Scanner Lector = new Scanner(System.in);
    
    public vehiculo(int modelo, String color, String marca, double precio){
        this.modelo =   modelo;
        this.color  =   color;
        this.marca  =   marca;
        this.precio =   precio;
    }
    
    public vehiculo(){}
    
    public abstract void registrarVehiculo();
}
