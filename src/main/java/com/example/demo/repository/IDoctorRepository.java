package com.example.demo.repository;

import com.example.demo.repository.modelo.Doctor;

public interface IDoctorRepository {

	public void agregar(Doctor doctor);
	public void actualizar(Doctor doctor);
	public Doctor encontrar(String cedula);
	public void eliminar(String cedula);
	
}
