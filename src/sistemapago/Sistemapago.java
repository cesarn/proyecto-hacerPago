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
public class Sistemapago {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pago chamaco1=new Pago();
        Pago chamaco;
        System.out.println(new Pago().hacerPago(10,2));
        System.out.println(chamaco1.hacerPago(10,2000));
    }
        
}
