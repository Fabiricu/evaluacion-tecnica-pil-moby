package primer_cuestionario;

import org.w3c.dom.ls.LSOutput;

public class EvaluacionTecnicaPIL {

    public static void main(String[] args){
        /* creacion e inicializacion de variables
        // double numeroDecimal = 0.4;
         boolean esCasado = true; */

        // verificar que el numero es par o no
        int numeroEsPar = 7;
        if(numeroEsPar % 2 == 0){
            System.out.println("El numero es par: " + (numeroEsPar/2));
        }else{
            System.out.println("Error: el numero ingresado no es par");
        }

        // b. Incrementar el valor hasta el doble

        int valorInicial = 2;
        System.out.println("Valor inicial a modificar por medio de una variable");
        while(valorInicial < valorInicial * 2){
            valorInicial++;
            System.out.println("El valor final es: " + valorInicial);
        }

        // c. Iteracion --> Realiza n cantidad de impresiones , siendo N un tercio del valor de la variable
        // del punto b
        int valorInicial2 = 13;
        int nImpresiones = valorInicial2 / 3;
        System.out.println("El valor inicial es: " + valorInicial2);

        for(int n = 0;n < nImpresiones; n++){
            System.out.println("N impresiones");
        }


        // Creacion e inicializacion de variables
        int numero = 5;
        int otroNumero = 9;
        int resultado =  numero + otroNumero;

        // Comprobar si un numero es positivo(Primera condicion logica)

        if (resultado > 0){
            System.out.println("La suma de ambos numeros es : " + resultado + "el resultado es positivo");
        }else{
            System.out.println("El resultado no es positivo");
        }

        // b. Incrementar el valor hasta el doble

        valorInicial = 2;
        System.out.println("Valor inicial a modificar por medio de una variable: " + valorInicial);
        while (valorInicial < valorInicial*2) {
            valorInicial++;

        }
        System.out.println("El valor final es: " + valorInicial);

        // c. Iteracion --> Realiza n cantidad de impresiones, siendo N un tercio del valor de la variable
        // del punto b
        int valorInicial3 = 13;
        int nImpresionesValor = valorInicial3 / 3;
        //System.out.println("El valor inicial  es: " + valorInicial);

        for (int n = 0; n < nImpresiones; n++){
            System.out.println("N impresionesValor");
        }


        // Creacion e inicializacion de variables
        double nota = 60.5;

        // Comprobar mediante una nota, en que rango(regular, promocional,se encuentra el alumno)
        if (nota >= 40 && nota<= 60 ){
            System.out.println("El alumno regularizo la materia");
        }else{
            if (nota >= 65 && nota<= 70){
                System.out.println("El alumno tiene notas satisfactorias");
            }else {
                if (nota >= 75 && nota <= 100){
                    System.out.println("El alumno esta promocionado");
                }
            }
        }
        System.out.println("El alumno no cumple con los estanderes y esta desaprobado");

        // b. Incrementar el valor hasta el doble

        int valorInicial4 = 2;
        System.out.println("Valor inicial a modificar por medio de una variable: " + valorInicial);
        while (valorInicial4 < valorInicial*2) {
            valorInicial++;

        }
        System.out.println("El valor final es: " + valorInicial);

        // c. Iteracion --> Realiza n cantidad de impresiones, siendo N un tercio del valor de la variable
        // del punto b
        int valorInicial5 = 13;
        int nImpresiones2 = valorInicial5 / 3;
        //System.out.println("El valor inicial  es: " + valorInicial);

        for (int n = 0; n < nImpresiones; n++){
            System.out.println("N impresiones");
        }

    }



}
