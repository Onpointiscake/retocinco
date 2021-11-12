package com.company;

import java.util.Arrays;

public class Util {

    public static String stringToArray(String cadenaDeNumeros) throws StringNotHavingBracket, StringContainingDecimals {

        // Handle Exceptions
        if(!cadenaDeNumeros.contains("[") || !cadenaDeNumeros.contains("]")){
            throw new StringNotHavingBracket("Debe ingresar la cadena entre corchetes");
        } else if (cadenaDeNumeros.contains(".")) {
            throw new StringContainingDecimals("Debe ingresar números enteros");
        }
        else {
            String[] cadena = cadenaDeNumeros.replaceAll("\\[", "")
                    .replaceAll("]", "")
                    .split(",");

            int[] arrayOfIntegers = new int[cadena.length];

            for (int i = 0; i < cadena.length; i++) {
                arrayOfIntegers[i] = Integer.valueOf(cadena[i]);
            }

            System.out.println("Dado: " + cadenaDeNumeros);
            System.out.println("Convertido: " + Arrays.toString(arrayOfIntegers));
        }

        return "Programa finalizado";
    }

}
