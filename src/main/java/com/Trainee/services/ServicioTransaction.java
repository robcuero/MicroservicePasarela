package com.Trainee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Trainee.model.Transacction;
import com.Trainee.repository.ServicioTransaccion;


@Service 
public class ServicioTransaction {
	@Autowired
	private ServicioTransaccion transacctionResporitory;
	
	public Transacction create (Transacction persona) {
		return transacctionResporitory.save(persona);
	}
	
	public List<Transacction> getAllPersonas (){
		return transacctionResporitory.findAll();
	}
}
