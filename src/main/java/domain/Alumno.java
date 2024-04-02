package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno {
    private String nombre;
    private String legajo;
    public List<Materia> materiasAprobadas;

    public Alumno(String nombre, String legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.materiasAprobadas = new ArrayList<>();
    }

    public void agregarMaterias(Materia ... materias) {
        Collections.addAll(this.materiasAprobadas, materias);}

    public List<Materia> getAprobadas() {
        return materiasAprobadas;
    }
}
