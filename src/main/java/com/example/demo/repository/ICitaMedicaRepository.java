package com.example.demo.repository;

import com.example.demo.repository.modelo.CitaMedica;

public interface ICitaMedicaRepository {

	public void agregar(CitaMedica citaMedica);
	public void actualizar(CitaMedica citaMedica);
	public CitaMedica encontrar(String numero);
	
}
