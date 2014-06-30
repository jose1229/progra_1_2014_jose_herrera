/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabras;

/**
 *
 * @author Jose Miguel
 */
public class operacion {

    public void String palabra(palabr){

        int largo = palabr.length();// obtengo el largo de la palabra enviada

        for (int i = largo - 2; i >= 0; i--) {//revisara cada letracada vez q se le resta dos

            palabr = palabr + palabr.charAt(i);//ira agreando la ultima letra
        }

        return palabr;  // retorno el palabra
    }

    public static String crearpalabra(String palabra) {
        String crearpalabra;// guarda la palabra creada

        String sep = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {

            sep = sep + palabra.charAt(i);
        }

        return sep;//envio la palabra seprada
    }

    public static int cont(String palabra, String textoAUsar) {

        int veces = 0;
        int pos = 0;
        while (pos != -1) {//leera palabra por palabra

            pos = textoAUsar.indexOf(palabra, pos + 1);

            if (pos != -1) {//si la ubicacioon es diferente al -1, aumentams veces
                veces++;

            }
        }
        return veces;
    }

    public static boolean extraer(String palaba, String textoAUsar) {

        int pos = textoAUsar.indexOf(palaba);
        if (pos != -1) {

            String textoAMostrar = textoAUsar.substring(0, pos) + "_" //agregamos"_"
                    + textoAUsar.substring(pos);

            return true;
            System.out.println(.mensajeConsola(textoAMostrar);
        } else {
            System.out.println("la palabra ingresada " + palabra
            " no fue encontrada"
                    );
            return false;
        }
        return false;
    }
}
