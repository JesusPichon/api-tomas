package mx.buap.apitomas.grupos;

import java.time.LocalDate;

public record DatosRegistroGrupo(
        String autor,
        String nombre,
        String imagen,
        LocalDate fechaPublicacion,
        int numeroTomas
) {
}
