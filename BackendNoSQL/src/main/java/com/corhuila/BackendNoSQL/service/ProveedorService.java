package com.corhuila.BackendNoSQL.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.BackendNoSQL.collections.Proveedor;
import com.corhuila.BackendNoSQL.repository.ProveedorRepository;

@Service
public class ProveedorService {
    @Autowired
    private ProveedorRepository estudianteRepository;

    public List<Proveedor> getAll(){
        return estudianteRepository.findAll();
    }

    public Proveedor getEstudianteById(String id) {
        return estudianteRepository.findById(id).orElse(null);
    }

    public Proveedor createEstudiante(Proveedor estudiante) {
        return estudianteRepository.save(estudiante);
    }

    public Proveedor updateEstudiante(Proveedor estudiante) {
        return estudianteRepository.save(estudiante);
    }

    public void delete(String id){
        estudianteRepository.deleteById(id);
    }
}
