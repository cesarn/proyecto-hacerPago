/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemapago;

/**
 *
 * @author T
 */
public class Pago {
    
    public Pago(){
        System.out.println("a ver si aparezco");
        
    }
    public float hacerPago(int horasTrabajadas, float sueldo){
        float pago=horasTrabajadas*sueldo;
        return pago;
       
    }
    
}
