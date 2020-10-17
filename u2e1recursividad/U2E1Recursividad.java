package u2e1recursividad;

import java.util.Scanner;

public class U2E1Recursividad {

    public static void main(String[] args) {
        U2E1Recursividad Metodo = new U2E1Recursividad();
        Scanner V = new Scanner(System.in);
        String palabra;
        int opc, dato;
        do {
            System.out.println("Menu"
                    + "\n[1]Normal"
                    + "\n[2]Recursividad"
                    + "\n[3]Factorial7"
                    + "\n[4]Fibonacci"
                    + "\n[5]Des"
                    + "\n[6]Palindromos"
                    + "\n[7]Salir");
            opc = V.nextInt();
            switch (opc) {
                case 1:
                    Metodo.RestaNormal();
                    System.out.println("");
                    break;
                case 2:
                    Metodo.RestaRecursiva(10, 0);

                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Ingrese un numero");
                    dato = V.nextInt();
                    System.out.println("El factorial de: " + dato + " es: " + Metodo.Factorial(dato));

                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Ingrese tamaño de serie");
                    dato = V.nextInt();
                    System.out.println("Fibonacci" + " de tamaño " + dato + ":");
                    for (int i = 0; i < dato; i++) {
                        System.out.print("[" + Metodo.Fibonacci(i) + "]");
                    }
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Ingrese Limite");
                    dato = V.nextInt();
                    Metodo.Des(dato);
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("Ingresa una palabra");
                    palabra = V.next();
                    Metodo.PalindromoR(palabra, opc, opc);
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("Salir");
                    break;
                default:
            }
        } while (opc != 7);
    }

    public void RestaNormal() {
        for (int i = 10; i >= 0; i--) {
            System.out.println("[" + i + "]");
        }
    }

    public void RestaRecursiva(int i, int j) {
        if (j <= i) {
            System.out.println("[" + j + "]");
            RestaRecursiva(i, j + 1);
        }

    }

    public int Factorial(int i) {
        if (i == 0 || i == 1) {
            return 1;
        } else {
            return i * Factorial(i - 1);
        }
    }

    public int Fibonacci(int i) {
        if (i > 1) {

            return Fibonacci(i - 1) + Fibonacci(i - 2);
        } else if (i == 1) {  // caso base
            return 1;
        } else if (i == 0) {  // caso base
            return 0;
        } else { //error
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            return -1;
        }
    }

    public void Des(int n) {
        if (n > -1) {
            for (int i = 0; i <= n; i++) {
                System.out.print("[" + i + "]");
            }
            System.out.println("");
            Des(n - 1);
        }
    }

    public void PalindromoR(String palabra, int i, int j) {
        if (i < palabra.length()) {
            if (palabra.charAt(i) != palabra.charAt(j)) {
                System.out.println("\nNo es palindromo\n");
                return;
            }
            PalindromoR(palabra, i + 1, j - 1);
        } else {
            System.out.println("\nEs palindromo\n");
        }
    }
}
