import static org.junit.Assert.assertEquals;


import org.junit.Test;

import com.parcial.Arbitro;
import com.parcial.Equipo;
import com.parcial.Estadio;
import com.parcial.Partido;


public class PartidoTest {
   @Test
    public void testCrearPartidoConArbitros() {
        Equipo local = new Equipo("Boca Juniors", "BOC");
        Equipo visitante = new Equipo("Palmeiras", "PAL");
        Estadio estadio = new Estadio("Monumental", "Corrientes", "Argentina");
        Arbitro arbitro = new Arbitro();
         Arbitro arbitroAsistente = new Arbitro();
    

        Partido partido = new Partido( estadio, local, visitante, "Partido de Prueba", arbitro, arbitroAsistente);

        assertEquals(local, partido.getLocal());
        assertEquals(visitante, partido.getVisitante());
        assertEquals(estadio, partido.getEstadio());
        assertEquals(arbitro, partido.getArbitro());
        assertEquals(arbitroAsistente, partido.getArbitroAsistente());
    }
    @Test
    public void testCrearPartidoConArbitros1() {
        Equipo local = new Equipo("Boca Juniors", "BOC");
        Equipo visitante = new Equipo("Palmeiras", "PAL");
        Estadio estadio = new Estadio("Monumental", "Corrientes", "Argentina");
        Arbitro arbitro = new Arbitro();
         Arbitro arbitroAsistente = new Arbitro();
         Arbitro linea1 = new Arbitro();
         Arbitro linea2 = new Arbitro();
    

        Partido partido = new Partido(estadio, local, visitante, "Partido de Prueba", arbitro, arbitroAsistente);

       
        partido.agregarArbitro(arbitro);
        partido.agregarArbitro(linea1);
        partido.agregarArbitro(linea2);
        partido.agregarArbitro(arbitroAsistente);
        
        
        assertEquals(local, partido.getLocal());
        assertEquals(visitante, partido.getVisitante());
        assertEquals(estadio, partido.getEstadio());
        assertEquals(arbitro, partido.getArbitro());
        assertEquals(arbitroAsistente, partido.getArbitroAsistente());
        assertEquals(4, partido.arbitroCantidad());

}
    }
   
