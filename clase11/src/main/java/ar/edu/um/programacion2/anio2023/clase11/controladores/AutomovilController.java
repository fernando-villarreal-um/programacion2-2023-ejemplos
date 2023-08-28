package ar.edu.um.programacion2.anio2023.clase11.controladores;

import ar.edu.um.programacion2.anio2023.clase11.entidades.Automovil;
import ar.edu.um.programacion2.anio2023.clase11.repositorios.AutomovilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/automovil/")
public class AutomovilController {
    @Autowired
    AutomovilRepository automovilRepository;

    @GetMapping
    public List<Automovil> getAll() {
        List<Automovil> automoviles = this.automovilRepository.findAll();
        return automoviles;
    }

    @GetMapping("/{id}")
    public Automovil getPorId(@PathVariable Long id) {
        Optional<Automovil> automovil = this.automovilRepository.findById(id);
        return automovil.get();
    }

    @PostMapping
    public Automovil post(@RequestBody Automovil automovil) {
        this.automovilRepository.save(automovil);
        return automovil;
    }
}
