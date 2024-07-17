package mx.buap.apitomas.tomas;

import jakarta.persistence.*;
import mx.buap.apitomas.abundancia.Abundancia;

import java.time.LocalDate;

public record DatosRegistroToma(
        Long id,
        String nombreCientifico,
        String familia,
        String nombreLocal,
        String estado,
        String municipio,
        String localidad,
        Integer altitud,
        Integer gradosLatitud,
        Integer minutosLatitud,
        Integer segundosLatitud,
        Integer hemisferioLatitud,
        Integer gradosAltitud,
        Integer minutosAltitud,
        Integer segundosAltitud,
        Integer hemisferioAltitud,
        Double x,
        Double y,
        String tipoVegetacion,
        String informacionAmbiental,
        String suelo,
        String asociada,
        Abundancia abundancia,
        String formaBiologica,
        Double tamano,
        String flor,
        String fruto,
        String usos,
        String colectores,
        int numeroColecta,
        LocalDate fecha,
        String determino,
        String otrosDatos,
        Long idGrupo
        ) {
}
