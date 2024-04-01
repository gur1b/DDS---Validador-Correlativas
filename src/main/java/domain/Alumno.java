package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Alumno {
    private String nombre;
    private List<Materia> aprobadas;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.aprobadas = new ArrayList<>();
    }
    public void agregarMaterias(Materia ... materias) {
        Collections.addAll(this.aprobadas, materias);}

    public List<Materia> getAprobadas() {
        return aprobadas;
    }
}
