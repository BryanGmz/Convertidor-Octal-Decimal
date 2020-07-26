/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.octal.decimal;

import java.io.StringReader;
import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class PracticaOctalDecimal {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
//        GeneradorArchivos archivos = GeneradorArchivos.getGeneradorArchivos();
//        archivos.genearar(GeneradorArchivos.PATH_FLEX, GeneradorArchivos.PATH_CUP, GeneradorArchivos.PATH_SYM, 
//                GeneradorArchivos.PATH_SINTAX, GeneradorArchivos.NOMBRE_SINTAX, GeneradorArchivos.NOMBRE_CLASE_SINTAX);
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Bienvenido al convertidor de Octal a Decimal---");
        while (true) {
            try {
                String entrada;
                System.out.println("\nIngresa el Número Octal (0-7): ");
                entrada = scanner.nextLine();
                System.out.println("Octal: " + entrada);
                Lexico lexico = new Lexico(new StringReader(entrada));
                Sintax sintax = new Sintax(lexico);
                sintax.parse();
            } catch (Exception e) {
                System.out.println("\nError en la entrada vuelve a intentarlo.");
            }
            
        }
    }
    
}
