/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmocifrado;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CrizUP
 */
public class CifradoTest {
    
    @Test
    public void testCifrar() {
        System.out.println("cifrar");
        String frase = "Hola";
        int base = 3;
        char[] expResult = {'K','R','Ñ','D'};
        char[] result = Cifrado.cifrar(frase, base);
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of calcularPosicion method, of class Cifrado.
     */
    @Test
    public void testCalcularPosicion() {
        System.out.println("calcularPosicion");
        int saltos = 41;
        int inicio = 8;
        int expResult = 11;
        int result = Cifrado.calcularPosicion(saltos, inicio);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of descifrar method, of class Cifrado.
     */
    @Test
    public void testDescifrar() {
        System.out.println("descifrar");
        String frase = "KRÑD";
        int base = 3;
        char[] expResult = {'H','O','L','A'};
        char[] result = Cifrado.descifrar(frase, base);
        assertArrayEquals(expResult, result);
       
    }

    /**
     * Test of calcularPosicionInvertida method, of class Cifrado.
     */
    @Test
    public void testCalcularPosicionInvertida() {
        System.out.println("calcularPosicionInvertida");
        int saltos = 41;
        int inicio = 8;
        int expResult = 5;
        int result = Cifrado.calcularPosicionInvertida(saltos, inicio);
        assertEquals(expResult, result);
        
    }
    
}
