package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materiasInscribir;

    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.materiasInscribir = new ArrayList<>();}

    public void agregarMaterias(Materia ... materias) {
        Collections.addAll(this.materiasInscribir, materias);
    }
    public boolean aprobada()
    {  List<Materia> materiasAprobadasAlumno = alumno.getAprobadas();
        List<Materia> correlativas = this.correlativasNecesarias();
        return materiasAprobadasAlumno.containsAll(correlativas);}

    public List<Materia> correlativasNecesarias()
    {return materiasInscribir.stream()
            .flatMap(materia -> materia.getCorrelativas().stream())
            .collect(Collectors.toList());}

}
