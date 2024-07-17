package mx.buap.apitomas.tomas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import mx.buap.apitomas.abundancia.Abundancia;

import java.time.LocalDate;

@Entity
@Table(name = "table_tomas")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode( of = "id")
public class Toma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreCientifico, familia, nombreLocal;
    private String estado, municipio, localidad;
    private Integer altitud;
    private Integer gradosLatitud, minutosLatitud, segundosLatitud, hemisferioLatitud;
    private Integer gradosAltitud, minutosAltitud, segundosAltitud, hemisferioAltitud;
    private Double x,y;
    private String tipoVegetacion, informacionAmbiental, suelo, asociada;
    @Enumerated(EnumType.STRING)
    private Abundancia abundancia;
    private String formaBiologica;
    private Double tamano;
    private String flor, fruto, usos;
    private String colectores;
    private int numeroColecta;
    private LocalDate fecha;
    private String determino;
    private String otrosDatos;
    private Long idGrupo;

    public Toma(DatosRegistroToma datosRegistroToma){
        this.id = datosRegistroToma.id();
        this.nombreCientifico = datosRegistroToma.nombreCientifico();
        this.familia = datosRegistroToma.familia();
        this.nombreLocal = datosRegistroToma.nombreLocal();
        this.estado = datosRegistroToma.estado();
        this.municipio = datosRegistroToma.municipio();
        this.localidad = datosRegistroToma.localidad();
        this.altitud = datosRegistroToma.altitud();
        this.gradosLatitud = datosRegistroToma.gradosLatitud();
        this.minutosLatitud = datosRegistroToma.minutosLatitud();
        this.segundosLatitud = datosRegistroToma.segundosLatitud();
        this.hemisferioLatitud = datosRegistroToma.hemisferioLatitud();
        this.gradosAltitud = datosRegistroToma.gradosAltitud();
        this.minutosAltitud = datosRegistroToma.minutosAltitud();
        this.segundosAltitud = datosRegistroToma.segundosAltitud();
        this.hemisferioAltitud = datosRegistroToma.hemisferioAltitud();
        this.x = datosRegistroToma.x();
        this.y = datosRegistroToma.y();
        this.tipoVegetacion = datosRegistroToma.tipoVegetacion();
        this.informacionAmbiental = datosRegistroToma.informacionAmbiental();
        this.suelo = datosRegistroToma.suelo();
        this.asociada = datosRegistroToma.asociada();
        this.abundancia = datosRegistroToma.abundancia();
        this.formaBiologica = datosRegistroToma.formaBiologica();
        this.tamano = datosRegistroToma.tamano();
        this.flor = datosRegistroToma.flor();
        this.fruto = datosRegistroToma.fruto();
        this.usos = datosRegistroToma.usos();
        this.colectores = datosRegistroToma.colectores();
        this.numeroColecta = datosRegistroToma.numeroColecta();
        this.fecha = datosRegistroToma.fecha();
        this.determino = datosRegistroToma.determino();
        this.otrosDatos = datosRegistroToma.otrosDatos();
        this.idGrupo = datosRegistroToma.idGrupo();
    }
}
