package controladores;

import java.util.ArrayList;

import interfaces.IDAOClientes;

import javax.swing.table.DefaultTableModel;

import dao.DAOClientes;
import entidades.Cliente;
import entidades.Filtro;

public class ControladorCliente extends DefaultTableModel {
	private int numreg = 0;
	private String data[][];
	private IDAOClientes daoclientes = new DAOClientes();
	private ArrayList listaClientes;
	private Filtro filtro = new Filtro(false, false, "", "");
	
	public ControladorCliente(){
		super();
		data=getRows();
		setDataVector(data,getCols());
	}

	private String[][] getRows() {
		ArrayList lista;
		numreg = daoclientes.conteoClientes();
		data=new String[numreg][10];
		Cliente cl;
		try{
			lista = daoclientes.listarClientes(this.filtro);
			this.listaClientes = lista;
			for(int fila = 0; fila < numreg; fila++){
				cl = (Cliente)lista.get(fila);
				data[fila][0] = Integer.toString(cl.getIdCliente());
				data[fila][1] = cl.getNombres();
				data[fila][2] = cl.getApellidos();
				data[fila][3] = cl.getDireccion();
				data[fila][4] = cl.getMunicipio();
				data[fila][5] = cl.getDepartamento();
				data[fila][6] = cl.getTelefono();
				data[fila][7] = cl.getCelular();
				data[fila][8] = cl.getCorreo();
				data[fila][9] = cl.getNotas();
				data[fila][10] = Boolean.toString(cl.getActivo());
			} 
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		return data;
		}
	
	public String[] getCols(){
		String[] Encabezados={new String("Codigo"), new String("Nombres"), new String("Apellidos"), new String("Direccion"), new String("Municipio"), new String("Departamento"), new String("Telofono"), new String("Celular"), new String("Correo"), new String("Notas"), new String("Estado")};
		return Encabezados;
	}
	public boolean isCellEditable(int row, int column){
        return false;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex){
        return data[rowIndex][columnIndex];
    }
    
    public void agregarCliente(Cliente cliente){
        daoclientes.insertarCliente(cliente);
    }
    
    public void modificarCliente(Cliente cliente){
        daoclientes.modificarCliente(cliente);
    }
    
    public void eliminarCliente(Cliente cliente){
        daoclientes.eliminarCliente(cliente);
    }
    
    /**
     * @retorna la listaClientes
     * /
     */
    
    public ArrayList getListaClientes() {
        return listaClientes;
    }
    
    /**
     * @retorna el filtro
     */
    public Filtro getFiltro(){
        return filtro;
    }
    
    public void setFiltro(Filtro filtro) {
        this.filtro = filtro;
    }
	
	
	}


