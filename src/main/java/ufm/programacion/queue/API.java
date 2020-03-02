package ufm.programacion.queue;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class API {
    Manager manager = new Manager();
    @PostMapping("/agregarRepartidor")
    public void add(int numeroSS, String nombre){
        manager.agregar(numeroSS, nombre);
    }
    @PostMapping("/actualizarLista")
    public void update(){
        manager.actualizar();
    }
    @PostMapping("/getLista")
    public String getall(){
        return manager.lista.getAll();
    }
    @GetMapping("/colaAleatoria")
    public String getList(){
        return manager.colaAleatoria();
    }
}
