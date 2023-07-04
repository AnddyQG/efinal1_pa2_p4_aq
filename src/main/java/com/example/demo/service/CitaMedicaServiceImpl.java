package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ICitaMedicaRepository;
import com.example.demo.repository.IDoctorRepository;
import com.example.demo.repository.IPacienteRepository;
import com.example.demo.repository.modelo.CitaMedica;
import com.example.demo.repository.modelo.Doctor;
import com.example.demo.repository.modelo.Paciente;
@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService{

	@Autowired
	private ICitaMedicaRepository citaMedicaRepository;
	@Autowired
	private IDoctorRepository doctorRepository;
	@Autowired
	private IPacienteRepository iPacienteRepository;
	
	@Override
	public void insertar(String numeroC, LocalDate fechaC, BigDecimal valorC, String lugarC, String cedulaDoctor,
			String cedulaPaciente) {
		// TODO Auto-generated method stub
		
		CitaMedica citaMedica= new CitaMedica();
		citaMedica.setNumeroCita(numeroC);
		citaMedica.setFechaCita(fechaC);
		citaMedica.setValorCita(valorC);
		citaMedica.setLugarCita(lugarC);
		Doctor doctor=this.doctorRepository.encontrar(cedulaDoctor);
		Paciente paciente=this.iPacienteRepository.encontrar(cedulaPaciente);
		citaMedica.setDoctor(doctor);
		citaMedica.setPaciente(paciente);
		this.citaMedicaRepository.agregar(citaMedica);
		
	}

	
	

	@Override
	public CitaMedica buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.citaMedicaRepository.encontrar(numero);
	}




	@Override
	public void actualizar(String numeroC, String diagnosticoC, String recetaC, LocalDate fechaProximaC) {
		// TODO Auto-generated method stub
		CitaMedica citaMedica= this.citaMedicaRepository.encontrar(numeroC);
		citaMedica.setDiagnostico(diagnosticoC);
		citaMedica.setReceta(recetaC);
		citaMedica.setFechaProximaCita(fechaProximaC);
		this.citaMedicaRepository.actualizar(citaMedica);
		
		
	}

}
