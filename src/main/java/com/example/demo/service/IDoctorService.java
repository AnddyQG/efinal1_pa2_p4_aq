package com.example.demo.service;

import com.example.demo.repository.modelo.Doctor;

public interface IDoctorService {

	public void insertar(Doctor doctor);
	public void actualizar(Doctor doctor);
	public Doctor buscarPorCedula(String cedula);
	public void borrar(String cedula);
	
}
