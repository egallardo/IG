package interfaces;

import java.util.ArrayList;

import entidades.Cliente;
import entidades.Filtro;

public interface IDAOClientes {
	
	public void conectarse();
	
	public void desconectase();
	
	public void insertarCliente(Cliente cliente);
	
	public void modificarCliente(Cliente cliente);
	
	public void eliminarCliente(Cliente cliente);
	
	public ArrayList listarClientes(Filtro filtro);
	
	public int conteoClientes();
}


