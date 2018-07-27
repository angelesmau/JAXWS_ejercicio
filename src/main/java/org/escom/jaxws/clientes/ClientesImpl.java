package org.escom.jaxws.clientes;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService(endpointInterface = "org.escom.jaxws.clientes.Clientes")
public class ClientesImpl implements Clientes{

	static List<Cliente> clientes = new ArrayList<>();
	
	@Override
	public Cliente agregarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		clientes.add(cliente);
		return cliente;
	}

	@Override
	public List<Cliente> obtenerClientes() {
		// TODO Auto-generated method stub
		return clientes;
	}

	@Override
	public Cliente eliminarCliente(int id) {
		// TODO Auto-generated method stub
		return clientes.remove(id);
	}

	@Override
	public Cliente actualizarCliente(int idCliente, Cliente cliente) {
		// TODO Auto-generated method stub
		return clientes.set(idCliente, cliente);
	}

	@Override
	public Cliente obtenerCliente(int id) {
		// TODO Auto-generated method stub
		return clientes.get(id);
	}
	

}
