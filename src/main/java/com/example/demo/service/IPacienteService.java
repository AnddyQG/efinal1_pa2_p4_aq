package com.example.demo.service;

import com.example.demo.repository.modelo.Paciente;

public interface IPacienteService {

	public void insertar(Paciente paciente);
	public void actualizar(Paciente paciente);
	public Paciente buscarPorCedula(String cedula);
	public void borrar(String cedula);
	
	
}
