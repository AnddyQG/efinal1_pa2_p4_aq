package com.example.demo.repository;

import com.example.demo.repository.modelo.Paciente;

public interface IPacienteRepository {

	public void agregar(Paciente paciente);
	public void actualizar(Paciente paciente);
	public Paciente encontrar(String cedula);
	public void eliminar(String cedula);
	
}
