package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.example.demo.repository.modelo.CitaMedica;

public interface ICitaMedicaService {

	public void insertar(String numeroC, LocalDate fechaC,BigDecimal valorC,String lugarC,String cedulaDoctor,String cedulaPaciente);
	public void actualizar(String numeroC,String diagnosticoC,String recetaC,LocalDate fechaProximaC);
	public CitaMedica buscarPorNumero(String numero);
	
}
