package ar.edu.um.programacion2.anio2023.clase10.clase10.controladores;

import ar.edu.um.programacion2.anio2023.clase10.clase10.configuracion.ListaConfiguration;
import ar.edu.um.programacion2.anio2023.clase10.clase10.configuracion.PruebaConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/prueba/")
public class PruebaController {

    @Autowired
    protected PruebaConfiguration pruebaConfiguration;

    @Autowired
    protected ListaConfiguration listaConfiguration;

    @GetMapping("funcion1")
    @ResponseBody
    public String funcion1() {

        return "llamado funcion 1";
    }
}
