package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Doctor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class DoctorRepositoryImpl implements IDoctorRepository{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void agregar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.entityManager.persist(doctor);
	}

	@Override
	public void actualizar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.entityManager.merge(doctor);
	}

	@Override
	public Doctor encontrar(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Doctor>query=this.entityManager.createQuery("SELECT e FROM Doctor e WHERE e.cedula = :datoCedula",Doctor.class);
		query.setParameter("datoCedula", cedula);
		return query.getSingleResult();
	}

	@Override
	public void eliminar(String cedula) {
		Doctor doctor=this.encontrar(cedula);
		// TODO Auto-generated method stub
		this.entityManager.remove(doctor);
	}

}
