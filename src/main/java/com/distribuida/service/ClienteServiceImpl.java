package com.distribuida.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.distribuida.dao.ClienteDAO;
import com.distribuida.entities.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteDAO clienteDAO;
	
	
	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return clienteDAO.findAll();
	}

	@Override
	public Cliente findOne(int id) {
		// TODO Auto-generated method stub
		return clienteDAO.findOne(id);
	}

	@Override
	public void add(Cliente cliente) {
		// TODO Auto-generated method stub
		clienteDAO.add(cliente);

	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		clienteDAO.del(id);
	}

	@Override
	public List<Cliente> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return clienteDAO.findAll(busqueda);
	}

	@Override
	public void add(String cedula, String nombre, String apellido, String correo, String clave) {
		// TODO Auto-generated method stub
		
		Cliente cliente = new Cliente(cedula, nombre, apellido, correo, clave);

		clienteDAO.add(cliente);
		
	}

	@Override
	public void up(int idCliente, String cedula, String nombre, String apellido, String correo, String clave) {
		// TODO Auto-generated method stub
		
		Cliente cliente = new Cliente(idCliente, cedula, nombre, apellido, correo, clave);
		
		clienteDAO.add(cliente);

		
	}

	@Override
	public Cliente validar(String usuario, String clave) {
		// TODO Auto-generated method stub
		
		Cliente cliente = clienteDAO.validar(usuario, clave);
		
		
		return cliente;
	}

}
