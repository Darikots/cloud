package com.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modelo.entidad.Videojuego;

public interface DaoVideojuego extends JpaRepository<Videojuego, Integer>{

}
