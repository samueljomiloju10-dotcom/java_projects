package com.mycompany.simplemultiplicationtableusingforloop;

/**
 *
 * @author USER
 */
public class SimpleMultiplicationTableUsingForLoop {

    public static void main(String[] args) {
        try {
            System.out.println("Simple Multiplication 2");
            int count, number;
            number = 2;

            for (count = 1; count <= 12; count++) {
                System.out.println(number + " X " + count + " = " + number * count);

            }
        } catch (Exception e) {
        }
    }
}
