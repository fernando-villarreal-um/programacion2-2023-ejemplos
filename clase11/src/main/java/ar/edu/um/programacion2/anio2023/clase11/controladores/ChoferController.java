package ar.edu.um.programacion2.anio2023.clase11.controladores;

import ar.edu.um.programacion2.anio2023.clase11.dto.InternoDTO;
import ar.edu.um.programacion2.anio2023.clase11.entidades.Automovil;
import ar.edu.um.programacion2.anio2023.clase11.entidades.Chofer;
import ar.edu.um.programacion2.anio2023.clase11.repositorios.AutomovilRepository;
import ar.edu.um.programacion2.anio2023.clase11.repositorios.ChoferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/chofer/")
public class ChoferController {
    @Autowired
    ChoferRepository choferRepository;

    @Autowired
    AutomovilRepository automovilRepository;

    @GetMapping
    public List<Chofer> getAll() {
        List<Chofer> choferes = this.choferRepository.findAll();
        return choferes;
    }

    @GetMapping("/{id}")
    public Chofer getPorId(@PathVariable Long id) {
        Optional<Chofer> chofer = this.choferRepository.findById(id);
        return chofer.get();
    }

    @PostMapping
    public Chofer post(@RequestBody Chofer chofer) {
        this.automovilRepository.saveAll(chofer.getAutomoviles());
        this.choferRepository.save(chofer);
        return chofer;
    }

    @GetMapping("/automovil/{id}")
    public List<Chofer> getChoferPorAutomovil(@PathVariable Long id) {
        Optional<Automovil> auto = this.automovilRepository.findById(id);
        Automovil auto2 = this.automovilRepository.findById(id).get();
        List<Chofer> choferes = this.choferRepository.findByAutomoviles(auto2);
        List<Chofer> choferes2 = this.choferRepository.findByAutomovilesMarca(auto2.getMarca());
        return choferes;
    }

    @PostMapping("/agregar")
    public Chofer agregarAutoAChofer(@RequestBody InternoDTO internoDTO) {
        Optional<Chofer> chofer = this.choferRepository.findById(internoDTO.getChofer());
        Chofer ch = chofer.get();
        Automovil nuevo = internoDTO.getAutomovil();
        this.automovilRepository.save(nuevo);
        ch.getAutomoviles().add(nuevo);
        this.choferRepository.save(ch);

        return null;
    }
}
