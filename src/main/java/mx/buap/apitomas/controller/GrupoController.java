package mx.buap.apitomas.controller;

import mx.buap.apitomas.grupos.Grupo;
import mx.buap.apitomas.grupos.GrupoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/grupo")
public class GrupoController {

    private GrupoRepository grupoRepository;

    public GrupoController(GrupoRepository grupoRepository) {
        this.grupoRepository = grupoRepository;
    }

    @GetMapping
    public List<Grupo> getListGrupos(){
        return grupoRepository.findAll();
    }
}
