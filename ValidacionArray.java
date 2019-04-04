/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author cesar villalba cortes
 */
public class ValidacionArray {
    public boolean validaArray(int[] array) throws ArrayIndexOutOfBoundsException,NullPointerException{
        int repetido=0;
        int pivote=array[0];
        for (int i = 1; i < array.length && repetido<2;i++){
           if(pivote>=array[i]){
               ++repetido;
           }else{
               pivote=array[i];
           }
        }
        return repetido<2;
    }
}
