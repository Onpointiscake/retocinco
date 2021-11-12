package com.company;

public class Main {

    public static void main(String[] args) throws StringNotHavingBracket, StringContainingDecimals {
        System.out.println(Util.stringToArray("[1,49,9,108,12012,33,10]"));
    }
}

// Ejemplos
// Util.stringToArray("[1,49,9,108,12012,33,10]") // Retorna correctamente los datos
// Util.stringToArray("[1.2,49.9,33.9,10]") // Tira error StringContainingDecimals
// Util.stringToArray("1,9,10,99]") // Tira error StringNotHavingBracket
