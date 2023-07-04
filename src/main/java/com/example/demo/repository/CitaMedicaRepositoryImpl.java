package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.CitaMedica;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class CitaMedicaRepositoryImpl implements ICitaMedicaRepository{

	
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void agregar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.persist(citaMedica);
	}

	@Override
	public void actualizar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.merge(citaMedica);
	}

	@Override
	public CitaMedica encontrar(String numero) {
		// TODO Auto-generated method stub
		TypedQuery<CitaMedica>query=this.entityManager.createQuery("SELECT e FROM CitaMedica e WHERE e.numeroCita = :datoNumeroCita",CitaMedica.class);
		query.setParameter("datoNumeroCita", numero);
		
		return query.getSingleResult();
	}

}
