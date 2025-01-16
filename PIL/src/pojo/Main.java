//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package pojo;

import primer_cuestionario.EvaluacionTecnicaPIL;
import segundo_cuestionario.EvaluacionTecnicaPIL2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // METODO MAIN1
        // Crear una instancia de EvaluacionTecnica2
        EvaluacionTecnicaPIL2 evaluacion = new EvaluacionTecnicaPIL2();

        // inicializar los candidatos
        List<Candidato> candidatos = evaluacion.inicializarCandidatos();

        // Llamar al metodo resolverPunto1 para imprimir los candidatos
        evaluacion.resolverPunto1(candidatos);

        // METODO MAIN2
        Tecnologia t3 = new Tecnologia(103L,"Mongo");
        Tecnologia t4 = new Tecnologia(104L,"Javascript");

        // crear candidatos con IDs diferentes
        Candidato c1 = new Candidato(103L,"Fabiana","Wendel",5,7500.00,Arrays.asList(t3));
        Candidato c2 = new Candidato(104L,"Walter","Wendel",8,15000.00,Arrays.asList(t4));

        // crear una lista de candidatos
        //List<Candidato>  candidatos = Arrays.asList(t3,t4);

        // ordenar la lista de candidatos por su ID
        candidatos.sort(null);   // usamos el metodo conpareTo para ordenar

        // Imprimir los candidatos ordenados
        candidatos.forEach(System.out::println);

        //MAIN3
        Tecnologia t5 = new Tecnologia(103L,"Mongo");
        Tecnologia t6 = new Tecnologia(104L,"Javascript");

        // crear candidatos con IDs diferentes
        Candidato c3 = new Candidato(103L,"Fabiana","Wendel",5,7500.00,Arrays.asList(t3));
        Candidato c4 = new Candidato(104L,"Walter","Wendel",8,15000.00,Arrays.asList(t4));

        // crear una lista de candidatos
        //List<Candidato>  candidatos = Arrays.asList(t5,t6);

        // Crear la instancia de EvaluacionTecnica2 y resolver el punto 2
        EvaluacionTecnicaPIL2 evaluacion2 = new EvaluacionTecnicaPIL2();
        evaluacion2.resolverPunto2(candidatos);



        // Resolucion PUNTO5
        Tecnologia t1 = new Tecnologia(101L,"Java");
        Tecnologia t2 = new Tecnologia(102L,"Python");

        System.out.println("¿El ID de Java es par?" + t1.esIdPar());
        System.out.println("El ID de Python es par?" + t2.esIdPar());

        // RESOLUCION PUNTO5 INSTANCIAS DE OBJETO
        // Crear algunas tecnologías
        // Implementacion de compareTo para ordenar una lista de candidatos por su ID
        Tecnologia java = new Tecnologia(1L, "Java");
        Tecnologia python = new Tecnologia(2L, "Python");
        Tecnologia javascript = new Tecnologia(4L, "JavaScript");
        Tecnologia cSharp = new Tecnologia(3L, "C#");

        // Crear algunos candidatos con sus tecnologías
        Candidato juan = new Candidato(3L,"Juan", "Pérez", 5,5000.00, List.of(java, python));
        Candidato ana = new Candidato(7L,"Ana", "Gómez", 8,7000.00, List.of(python, java, javascript));
        Candidato carlos = new Candidato(1L,"Carlos", "Martínez", 3,8000.00, List.of(javascript, java, cSharp));

        //Imprimir las tecnologias antes de ordenarlas
        System.out.println("Tecnologias antes de ordenar");
        carlos.getTecnologias().forEach(System.out::println);
        ana.getTecnologias().forEach(System.out::println);
        juan.getTecnologias().forEach(System.out::println);

        // ordenar las tecnologias alfabeticamente y mostrar el resultado
        List<Tecnologia> tecnologiasOrdenadas = carlos.ordenarTecnologias();
        List<Tecnologia> tecnologiasOrdenadas2 = ana.ordenarTecnologias();
        System.out.println("\nTecnologias despues de ordenar");
        tecnologiasOrdenadas.forEach(System.out::println);

        // Crear una lista de candidatos
        List<Candidato> candidatos = new ArrayList<>();
        candidatos.add(juan);
        candidatos.add(ana);
        candidatos.add(carlos);



        // Llamar al metodo resolverpunto2 para imprimir los candidatos ordenados por Id
        evaluacion.resolverPunto2(candidatos);

        // Llamar al metodo resolverPunto3 para imprimir los candidatos ordenados por pretension salarial
        evaluacion.resolverPunto3(candidatos);

        // Llamar al metodo resolverPunto4
        evaluacion.resolverPunto4(candidatos);

        // Llamar al metodo resolverPunto5
        evaluacion.resolverPunto5(candidatos);

        // ordenar los candidatos por ID utilizando compareTo
        Collections.sort(candidatos);

        // imprimir los candidatos ordenados
        candidatos.forEach(System.out::println);



        // Crear lista de candidatos
        //List<Candidato> candidatos = List.of(juan, ana, carlos);

        // Crear instancia de EvaluacionTecnica2
        //EvaluacionTecnicaPIL2 evaluacion = new EvaluacionTecnicaPIL2();
        //evaluacion.resolverPunto5(candidatos);

        // Crear algunas tecnologías con diferentes IDs
        //Tecnologia java = new Tecnologia(1L, "Java");
        //Tecnologia python = new Tecnologia(2L, "Python");
        //Tecnologia javascript = new Tecnologia(3L, "JavaScript");

        // PUNTO5
        // Verificar si los IDs son pares
        System.out.println("¿El ID de Java es par? " + java.esIdPar());
        System.out.println("¿El ID de Python es par? " + python.esIdPar());
        System.out.println("¿El ID de JavaScript es par? " + javascript.esIdPar());

        // Mostrar las tecnologías
        System.out.println("\nTecnologías:");
        System.out.println(java);
        System.out.println(python);
        System.out.println(javascript);
    }

        Tecnologia java = new Tecnologia(1L, "Java");
        Tecnologia python = new Tecnologia(2L, "Python");
        Tecnologia javascript = new Tecnologia(3L,"Javascript");

        //List<Candidato> candidatos = Arrays.asList(
          //      new Candidato(1,"Juan","Wendel",5,3000.00,Arrays.asList("Java","Spring","Docker")),
          //      new Candidato(2,"Maria","Juarez",2,8000.00,Arrays.asList("Java","Python")),

        //);



        // Crear algunos candidatos
        List<Candidato> candidatos = List.of(
                new Candidato(1L,"Juan","Perez",5,3000.00,List.of(java,python)),
                new Candidato(2L,"Carlos","Martinez",3,8000.00,List.of(javascript,java)),
                new Candidato(3L,"Ana","Gomez",8,7000.00,List.of(python,java,javascript))
        );

        // Crear instancia de evaluacion tecnica2
        //EvaluacionTecnicaPIL2 evaluacion = new EvaluacionTecnicaPIL2();
        //evaluacion.resolverPunto4(candidatos);

        //System.out.println(java.toString()); // Output: ID: 1, Nombre: Java
        //System.out.println(python.toString()); // Output: ID: 2, Nombre: Python

        //EvaluacionTecnicaPIL2 evaluacion2 = new EvaluacionTecnicaPIL2();

        // Obtenemos la lista de candidatos
        //List<Candidato> candidatos = evaluacion.inicializarCandidatos();

        // Llamamos al metodo resolverPunto1 para imprimir los candidatos
        //evaluacion.resolverPunto1(candidatos);


        // Mostrar los candidatos
        //for (Candidato candidato : candidatos){
          //  System.out.println(candidato.toString());
          //  System.out.println("--------------------------------------");
        //}

        // Llamamos al metodo resolverPinto2 para imprimir los candidatos ordenados por ID
        //EvaluacionTecnicaPIL2 evaluacion2 = new EvaluacionTecnicaPIL2();


        // Crear instancia de EvaluacionTecnica2
        //EvaluacionTecnicaPIL2 evaluacion3 = new EvaluacionTecnicaPIL2();
        //evaluacion.resolverPunto3(candidatos);



    }
}