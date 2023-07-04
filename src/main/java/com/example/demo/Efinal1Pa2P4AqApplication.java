package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.CitaMedica;
import com.example.demo.repository.modelo.Doctor;
import com.example.demo.repository.modelo.Paciente;
import com.example.demo.service.ICitaMedicaService;
import com.example.demo.service.IDoctorService;
import com.example.demo.service.IPacienteService;

@SpringBootApplication
public class Efinal1Pa2P4AqApplication implements CommandLineRunner{

	@Autowired
	private IDoctorService doctorService;
	
	@Autowired
	private IPacienteService iPacienteService;
	
	@Autowired
	private ICitaMedicaService citaMedicaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Efinal1Pa2P4AqApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//1 ingresar un doctor
		Doctor doctor = new Doctor();
		doctor.setCedula("3050");
		doctor.setNombre("Juliana");
		doctor.setApellido("Palacios");
		doctor.setFechaNacimiento(LocalDate.of(2003, 07, 07));
		doctor.setNumeroConsultorio("3");
		doctor.setCodigoSenescyt("1202");
		doctor.setGenero("F");
		//this.doctorService.insertar(doctor);
		
		
		//2. insertar un paciente
		Paciente paciente= new Paciente();
		paciente.setCedula("1721");
		paciente.setNombre("Anddy");
		paciente.setApellido("Quisilema");
		paciente.setFechaNacimiento(LocalDate.of(2000, 07, 19));
		paciente.setCodigoSeguro("123124");
		paciente.setEstatura("1.76");
		paciente.setPeso("75 libre");
		paciente.setGenero("M");
		
		//this.iPacienteService.insertar(paciente);
		
		
		//3.AGREGAR UNA CITA MEDICA
		//this.citaMedicaService.insertar("12", LocalDate.of(2024, 06, 10), new BigDecimal(120), "Centro Historico", "3050", "1721");
		
		//4 Actualizar Cita medica
		
		//this.citaMedicaService.actualizar("12", "EL PACIENTE A MEJORADO", "PARACETAMOL 1.5", LocalDate.of(2024, 07, 15));
		
		
		//verificacion de lo insertado
		Doctor doctorE= this.doctorService.buscarPorCedula("3050");
		System.out.println("El doctor insertado es : "+ doctorE);
		
		Paciente pacienteE=this.iPacienteService.buscarPorCedula("1721");
		System.out.println("El paciente insertado es : " + pacienteE);
		System.out.println();
		CitaMedica citaMedicaE= this.citaMedicaService.buscarPorNumero("12");
		System.out.println(citaMedicaE);
	}

}
