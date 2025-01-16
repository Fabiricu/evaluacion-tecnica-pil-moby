package pojo;
import java.util.Objects;

public class Tecnologia {

    private Long id;
    private String Nombre;

    // Constructor con parametros
    public Tecnologia(Long id,String Nombre) {
        this.id = id;
        this.Nombre = Nombre;
    }

    // Constructor sin parametros
    public Tecnologia(){
        id = 1234567L;
        Nombre = "";
    }

    public static void add(String java, String angular, String sql) {


    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre(){
        return Nombre;
    }


    public void setNombre(String nombre){

        Nombre = nombre;
    }

    // Metodo esIdPar: verifica si el ID es Par
    public boolean esIdPar(){
        return id % 2 == 0; // retorna true si el ID es par, false si es impar

    }



    //Sobreescribir equals() y hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        //Tecnologia that = (Tecnologia) o;
        //return Objects.equals(id, that.id) && Objects.equals(Nombre, that.Nombre);
        Tecnologia tecnologia = (Tecnologia) o;
        return Objects.equals(id, tecnologia.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Nombre);
    }


    //@Override
    //public String toString() {
      //  return "Tecnologia{" +
        //        "id=" + id +
        //        ", Nombre='" + Nombre + '\'' +
        //        '}';
    //}

    // Sobreescribir toString() para mostrar el ID y el nombre
    @Override
    public String toString() {
        return String.format("ID: %d, Nombre: %s", id, Nombre);
    }


}

