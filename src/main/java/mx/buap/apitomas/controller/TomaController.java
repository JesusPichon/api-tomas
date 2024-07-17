package mx.buap.apitomas.controller;

import mx.buap.apitomas.tomas.DatosRegistroToma;
import mx.buap.apitomas.tomas.Toma;
import mx.buap.apitomas.tomas.TomaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tomas")
public class TomaController {

    private TomaRepository tomaRepository;

    public TomaController(TomaRepository tomaRepository) {
        this.tomaRepository = tomaRepository;
    }

    @PostMapping
    public void registerToma(@RequestBody DatosRegistroToma datosRegistroToma) {
        System.out.println(datosRegistroToma);
        tomaRepository.save(new Toma(datosRegistroToma));
    }

    @GetMapping
    public List<Toma> getListTomas(){
        return tomaRepository.findAll();
    }
}
