package com.corhuila.BackendNoSQL.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corhuila.BackendNoSQL.collections.Proveedor;
import com.corhuila.BackendNoSQL.service.ProveedorService;

@RestController
@RequestMapping("/proveedor")
@CrossOrigin
public class ProveedorController {
    @Autowired
    private ProveedorService estudianteService;

    @GetMapping
    public List<Proveedor> getAll() {
        return estudianteService.getAll();
    }

    @GetMapping("/{id}")
    public Proveedor getEstudianteById(@PathVariable String id) {
        return estudianteService.getEstudianteById(id);
    }

    @PostMapping
    public Proveedor createEstudiante(@RequestBody Proveedor Estudiante) {
        return estudianteService.createEstudiante(Estudiante);
    }

    @PutMapping("/{id}")
    public Proveedor updateEstudiante(@PathVariable String id, @RequestBody Proveedor Estudiante) {
        Estudiante.setIdentificacion(id);
        return estudianteService.updateEstudiante(Estudiante);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        estudianteService.delete(id);
    }
}
