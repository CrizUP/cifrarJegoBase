/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmocifrado;

import java.util.Arrays;

public class Cifrado {

    public final static char[] ALFABETO = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
        'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
        'X', 'Y', 'Z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};

    public static char[] cifrar(String frase, int base) {

        System.out.println(ALFABETO.length);
        char[] chars = frase.toUpperCase().toCharArray();
        char[] resultado = new char[frase.length()];

        for (int i = 0; i < chars.length; i++) {
            if ((new String(ALFABETO).contains(Character.toString(chars[i]))) ){
                
                int posLetraNormal = new String(ALFABETO).indexOf(Character.toString(chars[i]));
                int posLetraCifrada;
                if (base >= 0){
                    posLetraCifrada = calcularPosicion(base, posLetraNormal);
                }else{
                    posLetraCifrada = calcularPosicionInvertida(-(base), posLetraNormal);
                }
                
                resultado[i] = ALFABETO[posLetraCifrada];
                
            } else {                
                resultado[i] = chars[i];                        
            }        
        }
        return  resultado;

    }
    
    public static int calcularPosicion(int saltos, int inicio) {
        if((inicio+saltos)< ALFABETO.length){
            return inicio+saltos;
        } else{
            return 0 + calcularPosicion((saltos-(ALFABETO.length - inicio)), 0);
        }
    }
    
     public static char[] descifrar(String frase, int base) {

        char[] chars = frase.toUpperCase().toCharArray();
        char[] resultado = new char[frase.length()];

        for (int i = 0; i < chars.length; i++) {
            if ((new String(ALFABETO).contains(Character.toString(chars[i]))) ){
                
                int posLetraNormal = new String(ALFABETO).indexOf(Character.toString(chars[i]));
                
                int posLetraCifrada;
                if (base >= 0){
                    posLetraCifrada = calcularPosicionInvertida(base, posLetraNormal);
                   
                }else{
                     posLetraCifrada = calcularPosicion(-(base), posLetraNormal);
                }
                
                
                resultado[i] = ALFABETO[posLetraCifrada];
                
            } else {                
                resultado[i] = chars[i];                        
            }        
        }
        return  resultado;

    }
    
    public static int calcularPosicionInvertida(int saltos, int inicio) {
        if((inicio-saltos)>= 0){
            return inicio-saltos;
        } else{
            return 0 + calcularPosicionInvertida((saltos-(ALFABETO.length - (ALFABETO.length - inicio))), ALFABETO.length );
        }
    }
    

}
