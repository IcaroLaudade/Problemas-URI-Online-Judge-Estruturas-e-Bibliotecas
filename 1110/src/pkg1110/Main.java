/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int numero = 0;
        while (true) {
            numero = Integer.parseInt(br.readLine());
            if (numero == 0) {
                break;
            }
            ArrayList<Integer> numeros = new ArrayList<>();
            //           int[] numeros = new int[numero];
            for (int cont = 0; cont < numero; cont++) {
                numeros.add(cont + 1);
            }
            int[] desc = new int[numero - 1];
            for (int contador = 0; contador < desc.length; contador++) {
                desc[contador] = numeros.get(0);
                numeros.remove(0);
                int aux = numeros.get(0);
                numeros.remove(0);
                numeros.add(aux);
            }
            String saida = "";
            for (int contador = 0; contador < desc.length; contador++) {
                if (contador == desc.length - 1) {
                    saida += " " + (desc[contador]);
                } else {
                    saida += " " + (desc[contador]) + ",";
                }
            }
            System.out.println("Discarded cards:" + saida);
            System.out.println("Remaining card: " + numeros.get(0));
        }
    }
}
