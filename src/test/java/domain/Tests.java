package domain;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Tests {

    @Test
    public void inscripcionExitosa()
    {
        Materia ayed = new Materia("AyED");

        Materia pdp = new Materia("PdP");
        pdp.agregarMaterias(ayed);

        Materia dds = new Materia("DdS");
        dds.agregarMaterias(ayed, pdp);

        Materia am1 = new Materia("AM1");

        Materia aga = new Materia("AGA");

        Materia am2 = new Materia("AM2");
        dds.agregarMaterias(am1, aga);

        Alumno alumno = new Alumno("Nachin");
        alumno.agregarMaterias(ayed, am1, aga);

        Inscripcion inscripcion = new Inscripcion(alumno);
        inscripcion.agregarMaterias(pdp, am2);

        Assert.assertTrue(inscripcion.aprobada());
    }

    @Test
    public void inscripcionNoExitosa()
    {
        Materia ayed = new Materia("AyED");

        Materia pdp = new Materia("PdP");
        pdp.agregarMaterias(ayed);

        Materia dds = new Materia("DdS");
        dds.agregarMaterias(ayed, pdp);

        Alumno alumno = new Alumno("Nachin");
        alumno.agregarMaterias();

        Inscripcion inscripcion = new Inscripcion(alumno);
        inscripcion.agregarMaterias(pdp);

        Assert.assertFalse(inscripcion.aprobada());
    }
}
