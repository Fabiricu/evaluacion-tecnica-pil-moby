package segundo_cuestionario;
import pojo.Candidato;
import pojo.Tecnologia;
//import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class EvaluacionTecnicaPIL2{

    // Metodo para inicializar los Candidatos-resolverPunto1
    public List<Candidato> inicializarCandidatos() {
        List<Candidato> candidatos = new ArrayList<>();

        // Candidato John Doe
        List<Tecnologia> tecnologiasJhon = List.of(
                new Tecnologia(1L,"Java"),
                new Tecnologia(2L,"Angular"),
                new Tecnologia(3L,"SQL")
        );
        candidatos.add(new Candidato(   1L,"Jhon", "Doe", 5, 2000.00, tecnologiasJhon));

        // Candidato Matias Otamendi
        List<Tecnologia> tecnologiasMatias = List.of(
                new Tecnologia(8L, "NodeJs"),
                new Tecnologia(1L,"Java")
        );
        candidatos.add(new Candidato(   2L,"Matias","Otamendi",3,9000.00,tecnologiasMatias));

        // Candidato Joaquín Tagliaco
        List<Tecnologia> tecnologiasJoaquin = List.of(
                new Tecnologia(7L, "MongoDB"),
                new Tecnologia(4L,"NoSql")
        );
        candidatos.add(new Candidato(   3L,"Joaquin","Tagliaco",2,6000.00,tecnologiasJoaquin));

        // Candidato Gastón Mac Allister
        List<Tecnologia> tecnologiasGaston = List.of(
                new Tecnologia(5L, "Vue"),
                new Tecnologia(3L,"SQL"),
                new Tecnologia(1L,"Java")
        );
        candidatos.add(new Candidato(4L,"Gaston","MacAllister",5,1000.00,tecnologiasGaston));

        // Candidato Pablo De Paul
        List<Tecnologia> tecnologiasPablo = List.of(
                new Tecnologia(1L,"Java")
        );
        candidatos.add(new Candidato(5L,"Pablo","De Paul",9,4500.00,tecnologiasPablo));

        // Candidato Lucas Di María
        List<Tecnologia> tecnologiasLucas = List.of(
                new Tecnologia(1L,"Java"),
                new Tecnologia(2L, "Angular"),
                new Tecnologia(3L, "SQL")
        );
        candidatos.add(new Candidato(6L,"Lucas","Di Maria",6,7000.00,tecnologiasLucas));

        // Candidato Lionel Messi
        List<Tecnologia> tecnologiasLionel = List.of(
                new Tecnologia(3L, "Sql"),
                new Tecnologia(5L,"Vue"),
                new Tecnologia(1L,"Java")
        );
        candidatos.add(new Candidato(7L,"Leonel","Messi",10,10000.00,tecnologiasLionel));

        // Candidato Julián Álvarez
        List<Tecnologia> tecnologiasJulian = List.of(
                new Tecnologia(4L, "NoSql"),
                new Tecnologia(7L,"MongoDB"),
                new Tecnologia(1L,"Java")
        );
        candidatos.add(new Candidato(8L,"Julian","Alvarez",5,3000.00,tecnologiasJulian));

        // Candidato Lula Martínez
        List<Tecnologia> tecnologiasLula = List.of(
                new Tecnologia(6L,".Net"),
                new Tecnologia(1L,"Java"),
                new Tecnologia(2L,"Angular")

        );
        candidatos.add(new Candidato(9L,"Lula","Martinez",11,2500.00,tecnologiasLula));

        // Candidato Agustín Dybala
        List<Tecnologia> tecnologiasAgustin = List.of(
                new Tecnologia(1L, "Java"),
                new Tecnologia(6L, ".NET"),
                new Tecnologia(2L, "Angular")
        );
        candidatos.add(new Candidato(10L,"Agustín", "Dybala", 12, 7500.00, tecnologiasAgustin));

        // Retornar la lista de candidatos // Fin resolverPunto1
        return candidatos;


        // Crear tecnologias
        //Tecnologia sql = new Tecnologia(3L, "SQL");
        Tecnologia mongoDB = new Tecnologia(7L, "MongoDB");
        Tecnologia noSQL = new Tecnologia(4L, "NoSQL");
        Tecnologia vue = new Tecnologia(5L, "Vue");
        Tecnologia java = new Tecnologia(1L, "Java");
        Tecnologia angular = new Tecnologia(2L, "Angular");
        Tecnologia net = new Tecnologia(6L, "Net");

        // Crear candidatos
        Candidato candidato1 = new Candidato(1L, "Joaquin", "Tagliaco", 6, 2000.00, Arrays.asList(mongoDB, noSQL));
        Candidato candidato2 = new Candidato(4L, "Gaston", "Mac Allister", 1, 5000.50, Arrays.asList(vue, java));
        Candidato candidato3 = new Candidato(5L, "Pablo", "De Paul", 4, 9000.50, Arrays.asList(java));
        Candidato candidato4 = new Candidato(2L, "lucas", "Di Maria", 7, 6000.00, Arrays.asList(java, angular));
        Candidato candidato5 = new Candidato(10L, "Lionel", "Messi", 10, 10000.10, Arrays.asList(vue, java));
        Candidato candidato6 = new Candidato(9L, "Julian", "Alvarez", 3, 5000.00, Arrays.asList(noSQL, mongoDB, java));
        Candidato candidato7 = new Candidato(8L, "Lula", "Martinez", 2, 1000.00, Arrays.asList(net, java, angular));
        Candidato candidato8 = new Candidato(6L, "Agustin", "Dybala", 2, 1000.00, Arrays.asList(java, net, angular));

        //Agregar todos los candidatos a la lista
        return List.of(candidato1, candidato2, candidato3, candidato4, candidato5, candidato6, candidato7, candidato8);

        //Mostrar los candidatos
        //List<Candidato> candidatos = Arrays.asList(candidato1, candidato2, candidato3, candidato4, candidato5, candidato6, candidato7, candidato8);


        //for (Candidato candidato : candidatos) {
        //  System.out.println(candidato.toString());
        //}

        // Agregar todos los candidatos a la lista
        return Arrays.asList(candidato1,candidato2,candidato3,candidato4,candidato5,candidato6,candidato7,candidato8);


    }

    // Metodo resolverPunto1 para imprimir la Lista de candidatos
    public void resolverPunto1(List<Candidato> candidatos) {
        // Recorrer la lista de candidatos e imprimir cada uno
        //for (Candidato candidato : candidatos) {
          //  System.out.println(candidato.toString());
           // System.out.println("--------------------------------");
        //}
        candidatos.forEach(candidato -> System.out.println(candidato));
        candidatos.forEach(System.out::println);
    }
    // Fin resolver Punto1

    // Metodo resolverPunto2 para imprimir la Lista Ordenada por ID
    public void resolverPunto2(List<Candidato> candidatos) {
        // ordenar los candidatos por ID de menor a mayor usando Stream y luego imprimir
        List<Candidato> candidatosOrdenados = candidatos.stream().sorted().collect(Collectors.toList());

        // imprimir los Caandidatos Ordenados
        for (Candidato candidato : candidatosOrdenados) {
            System.out.println("ID:" + candidato.getId() + "Nombre:" + candidato.getNombre() + " " + candidato.getApellido());


        }
    }

    public void resolverPunto3(List<Candidato> candidatos) {
        // Usamos stream para ordenar y luego imprimir la lista de candidatos
        candidatos.stream()
                .sorted((c1, c2) -> Double.compare(c2.getPretensionSalarial(), c1.getPretensionSalarial()))  // Ordenamos de mayor a menor
                .forEach(candidato ->
                        System.out.println(candidato.getPretensionSalarial() + " - " + candidato.getNombre() + " " + candidato.getApellido())
                );
    }

    // Metodo resolverPunto4
    public void resolverPunto4(List<Candidato> candidatos) {
        // Encontrar el candidato con mas años de experiencia utilizando stream
        Candidato candidatoConMasExperiencia = candidatos.stream().max((c1, c2) -> Integer.compare(c1.getAniosExperiencia(),
                c2.getAniosExperiencia())).orElseThrow(() -> new RuntimeException("No hay candidatos disponibles"));

        // Imprimir el candidato con mas experiencia
        System.out.println("Candidato con mas experiencia");
        System.out.println(candidatoConMasExperiencia);

        // Ordenar e imprimir las tecnologias que conoce el candidato
        System.out.println("\nTecnologias que conoce");
        candidatoConMasExperiencia.ordenarTecnologias().forEach(tecnologia ->
                System.out.println(tecnologia)
        );

        // Opcion 2 del Punto 4
        // Usamos stream para encontrar el candidato con mas experiencia
        Optional<Candidato> candidatoConMayorExperiencia = candidatos.stream()
                .max(Comparator.comparingInt(Candidato::getAniosExperiencia));

        // si encontramos un candidato, imprimimos sus datos
        candidatoConMayorExperiencia.ifPresent(candidato -> {
            // imprimir los datos del candidato
            System.out.println("Candidato con mayor experiencia");
            System.out.println(candidato);
        });

        // imprimir las tecnologias ordenadas que conoce el candidato
        //List<String> tecnologiasOrdenadas = candidato.ordenarTecnologias();
        //System.out.println("Tecnologias que conoce");
        //tecnologiasOrdenadas.forEach(System.out::println);
    }

    // Metodo resolverPunto5
    public void resolverPunto5(List<Candidato> candidatos){
        // encontrar el candidato con mas tecnologias utilizando stream
        Candidato candidatoConMasTecnologias = candidatos.stream()
                .max((c1,c2) -> Integer.compare(c1.getTecnologias().size(),c2.getTecnologias().size()))
                .orElseThrow(() -> new RuntimeException("No hay candidatos disponibles"));

        // imprimir el candidato con mas tecnologias
        System.out.println("Candidato con mas tecnologias");
        System.out.println(candidatoConMasTecnologias);

        // obtener las tecnologias del candidato
        List<Tecnologia> tecnologias = candidatoConMasTecnologias.getTecnologias();

        // buscar y mostrar la primera tecnologia con ID Par
        tecnologias.stream()
                .filter(Tecnologia::esIdPar)    // Filtramos las tecnologias con ID Par
                .findFirst()    // recuperamos la primera tecnologia que tenga el ID par
                .ifPresent(tecnologia -> {
                    System.out.println("\nPrimera tecnologia con ID par:");
                    System.out.println(tecnologia);
                });
    }

}









}
















    /*

    // OPCION CODIGO

        /*Crear y agregar candidatos a la lista
        Candidato candidato1 = new Candidato();
        candidato1.setId(31L);
        candidato1.setNombre("Jhon");
        candidato1.setApellido("Doe");
        candidato1.setPretensionSalarial(5000.0);
        candidato1.setAniosExperiencia(2);
        candidatos.add("Java");

        Candidato candidato2 = new Candidato();
        candidato2.setId(32L);
        candidato2.setNombre("Jhon");
        candidato2.setApellido("Doe");
        candidato2.setPretensionSalarial(5000.0);
        candidato2.setAniosExperiencia(2);
        candidatos.add("Angular");

        Candidato candidato3 = new Candidato();
        candidato3.setId(33L);
        candidato3.setNombre("Jhon");
        candidato3.setApellido("Doe");
        candidato3.setPretensionSalarial(5000.0);
        candidato3.setAniosExperiencia(2);
        candidatos.add("SQL");

        Candidato candidato4 = new Candidato();
        candidato4.setId(78L);
        candidato4.setNombre("Matias");
        candidato4.setApellido("Otamendi");
        candidato4.setPretensionSalarial(3000.0);
        candidato4.setAniosExperiencia(9);
        candidatos.add("Node.JS");

        Candidato candidato1 = new Candidato();
        candidato1.setId(71L);
        candidato1.setNombre("Matias");
        candidato1.setApellido("Otamendi");
        candidato1.setPretensionSalarial(3000.0);
        candidato1.setAniosExperiencia(9);
        candidatos.add("Java"); */

        /*Tecnologia tecnologia1 = new Tecnologia(3L, "Java");// crear las tecnologias y luego agregar a la lista
        Tecnologia tecnologia2 = new Tecnologia(4L, "Angular");
        Tecnologia tecnologia3 = new Tecnologia(5L, "SQL");

        /*List<Tecnologia> tecnologiasCandidato1 = new ArrayList<>();
        tecnologiasCandidato1.add(tecnologia1);
        tecnologiasCandidato1.add(tecnologia2);
        tecnologiasCandidato1.add(tecnologia3);

        Candidato candidato1 = new Candidato();
        candidato1.setId(71L);
        candidato1.setNombre("Matias");
        candidato1.setApellido("Otamendi");
        candidato1.setPretensionSalarial(3000.0);
        candidato1.setAniosExperiencia(9);
        candidato1.setTecnologias(tecnologiasCandidato1);

        //candidatos.add(new Candidato(3, "Jhon", "Doe", 2, 5000));


    }




