/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author Cesar villalba Cortes
 */
public class BinaryGap {
    public int getSolution(int n){
        String cad= "";
        int residuo,contCeros=0,max=0;
       boolean band=false;
        while(n!=0){
            residuo=n%2;
            cad+=residuo;
            if(residuo==1){
                band=true;
                max=(contCeros>max)?contCeros:max;
                contCeros=0;
            }
            if(residuo==0 && band){
                ++contCeros;
            }
            n=n/2;
        }
        return max;
    }
}
