package pojo;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Objects;

public class Candidato implements Comparable<Candidato> {
    private Long id;
    private String Nombre;
    private String Apellido;
    private Integer aniosExperiencia;
    private Double pretensionSalarial;
    private List<Tecnologia> tecnologias;

    // Constructor sin parametros
    public Candidato(int i, String jhon, String doe, int i1, int i2){
        id = 1234567L;
        Nombre = "";
        Apellido = "";
        aniosExperiencia = 0;
        pretensionSalarial = 0.0;
    }

    // Constructor con parametros
    public Candidato(Long id, String Nombre, String Apellido, Integer aniosExperiencia, Double pretensionSalarial, List<Tecnologia> tecnologias){
        this.id = id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.aniosExperiencia = aniosExperiencia;
        this.pretensionSalarial = pretensionSalarial;
        this.tecnologias = tecnologias;
    }

    public Candidato() {

    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getNombre(){
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido(){
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public Integer getAniosExperiencia() {
        return aniosExperiencia;
    }

    public List<Tecnologia> getTecnologias() {
        return tecnologias;
    }

    //  Metodo para Ordenar las tecnologias alfabeticamente por su nombre
    public List<Tecnologia> ordenarTecnologias(){
        return tecnologias.stream()
                .sorted((t1, t2) -> t1.getNombre().compareTo(t2.getNombre()))
                .collect(Collectors.toList());
    }

    public void setAniosExperiencia(Integer aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public Double getPretensionSalarial() {
        return pretensionSalarial;
    }

    public void setPretensionSalarial(Double pretensionSalarial) {
        this.pretensionSalarial = pretensionSalarial;
    }

    public void setTecnologias(List<Tecnologia> tecnologias){
        this.tecnologias = tecnologias;
    }

    // Sobreescribir el metodo compareTo() para comparar por id
    @Override
    public int compareTo(Candidato otroCandidato){
        return this.id.compareTo(otroCandidato.getId());
    }



    // Sobrescribir equals() y hashCode() (para asegurar consistencia con compareTo()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Candidato candidato = (Candidato) obj;
        return Objects.equals(id, candidato.id);
    }

    //@Override
    //public int hashCode() {
        //return Objects.hash(id, Nombre, Apellido, aniosExperiencia, pretensionSalarial, tecnologias);
    //}

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    //@Override
    //public String toString() {
      //  return "Candidatos{" +
        //        "id=" + id +
          //      ", Nombre='" + Nombre + '\'' +
          //      ", Apellido='" + Apellido + '\'' +
          //      ", aniosExperiencia=" + aniosExperiencia +
          //      ", pretensionSalarial=" + pretensionSalarial +
          //      ", tecnologias=" + tecnologias +
          //      '}';
    //}

    // Sobrescribir toString() para mostrar el nombre completo y demás datos
    @Override
    public String toString() {
        return String.format("%s %s\nAños de Experiencia: %d\nPretensión Salarial: %.2f\nTecnologías: %s",
                Nombre, Apellido, aniosExperiencia, pretensionSalarial, tecnologias.toString());
    }













}

