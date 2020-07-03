package com.ejemplo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Escribe un número");
        int numero = readIntFromKeyboard();
        System.out.print("Has escrito el número " + numero);
    }

    private static int readIntFromKeyboard(){
        Integer result;
        Scanner keyboardReader = new Scanner(System.in);
        do {
            String selectedOption = keyboardReader.nextLine();
            try {
                result = Integer.parseInt(selectedOption);
            } catch (NumberFormatException e){
                System.out.println("El String introducido no es un número. Introduce un \"int\"");
                result = null;
            }
        } while (result == null);
        keyboardReader.close();
        return result.intValue();
    }

}
