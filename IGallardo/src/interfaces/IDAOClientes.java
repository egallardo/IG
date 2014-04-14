package interfaces;

import java.util.ArrayList;
import java.util.Map;

import javax.swing.DefaultComboBoxModel;

import entidades.Cliente;
import entidades.Filtro;

public interface IDAOClientes {
	
	public void conectarse();
	
	public void desconectase();
	
	public void insertarCliente(Cliente cliente);
	
	public void modificarCliente(Cliente cliente);
	
	public void eliminarCliente(Cliente cliente);
	
	public Cliente buscarCliente(Filtro filtro);
	
	public ArrayList listarClientes(Filtro filtro);
	
	public DefaultComboBoxModel listarDepartamentos();
	
	public DefaultComboBoxModel listarMunicipios(Filtro filtro);
	
	public int conteoClientes();
}


