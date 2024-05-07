package com.corhuila.BackendNoSQL.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.corhuila.BackendNoSQL.collections.Proveedor;

@Repository
public interface ProveedorRepository extends MongoRepository <Proveedor, String> {}
