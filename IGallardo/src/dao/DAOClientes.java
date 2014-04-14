package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.DefaultComboBoxModel;

import entidades.Cliente;
import entidades.Filtro;
import interfaces.IDAOClientes;

public class DAOClientes implements IDAOClientes {
	private Connection cn;
	
	public DAOClientes(){
		conectarse();
	}

	@Override
	public void conectarse() {
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/IGallardo?user=root&password=10984raul");
		} catch (Exception e){
			System.out.println(e.toString());
		}
		
	}

	@Override
	public void desconectase() {
		try{
			this.cn.close();
		} catch(Exception e){
			
		}
		
	}

	@Override
	public void insertarCliente(Cliente cliente) {
		PreparedStatement st;
		
		int x = 0;
		try{
			st = this.cn.prepareStatement
					("Insert into Cliente(nombres, apellidos, direccion, empresa, dui, nit, municipio, departamento, telefono, celular, correo, notas) values (?,?,?,?,?,?,?,?,?,?,?,?)");
			
			st.setString(1, cliente.getNombres());
			st.setString(2, cliente.getApellidos());
			st.setString(3, cliente.getEmpresa());
			st.setString(4, cliente.getDui());
			st.setString(5, cliente.getNit());
			st.setString(6, cliente.getDireccion());
			st.setString(7, cliente.getMunicipio());
			st.setString(8, cliente.getDireccion());
			st.setString(9, cliente.getTelefono());
			st.setString(10, cliente.getCelular());
			st.setString(11, cliente.getCorreo());
			st.setString(12, cliente.getNotas());
			//st.setBoolean(10, cliente.getActivo());
			
			x = st.executeUpdate();
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public void modificarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarCliente(Cliente cliente) {
	    PreparedStatement st;
        int x=0;
        try{
            st = this.cn.prepareStatement("Delete from Cliente where idCliente=?");
            st.setString(1, Integer.toString(cliente.getIdCliente()));
            x = st.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
		
	}

	@Override
	public ArrayList listarClientes(Filtro filtro) {
		ArrayList listaClientes = new ArrayList();
		Cliente cl;
		try{
			Statement st;
			ResultSet rs;
			st = this.cn.createStatement();
			String sSql="Select idCliente, nombres, apellidos, empresa, dui, nit, direccion, municipio, departamento, telefono, celular, correo, notas from Cliente";
			String sSqlFiltro="";
			if (filtro.isBfiltro1()==true & filtro.isBfiltro2()==false){
				sSqlFiltro= " where nombres = '" + filtro.getValor1() + "'";
				/*
			}else if (filtro.isBfiltro1()==false & filtro.isBfiltro2()==true){
				sSqlFiltro= " where apellidos = '" + filtro.getValor2() + "'";
			}else if (filtro.isBfiltro1()==true & filtro.isBfiltro2()==true){
				sSqlFiltro= " where nombres = '" + filtro.getValor1() + "' and apellidos '" + filtro.getValor2() + "'";		
			*/
			}
			sSql += sSqlFiltro;
			rs = st.executeQuery(sSql);
			while(rs.next()){
				cl = new Cliente(rs.getInt("idCliente"), rs.getString("nombres"), rs.getString("apellidos"), rs.getString("empresa"), rs.getString("dui"), rs.getString("nit"), rs.getString("direccion"), rs.getString("municipio"), rs.getString("departamento"), rs.getString("telefono"), rs.getString("celular"), rs.getString("correo"), rs.getString("notas"), rs.getInt("idMunicipiosXDepartamento"));
				listaClientes.add(cl);
			}
			rs.close();
			rs = null;
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		return listaClientes;
	}

	@Override
	public int conteoClientes() {
        int x=0;
        try{
            Statement st;
            ResultSet rs;
            st = this.cn.createStatement();
            rs = st.executeQuery("Select count(*) num from cliente");
            while(rs.next()){
            x = rs.getInt("num");
            }
            rs.close();
            rs = null;
        } catch (Exception e) {
        }
        return x;
	}

	@Override
	public Cliente buscarCliente(Filtro filtro) {
		// TODO Auto-generated method stub
		Cliente cl = null;
		try{
			Statement st;
			ResultSet rs;
			st = this.cn.createStatement();
			String sSql="Select idCliente, nombres, apellidos, empresa, dui, nit, direccion, municipio, departamento, telefono, celular, correo, notas from Cliente";
			String sSqlFiltro="";
			if (filtro.isBfiltro1()==true & filtro.isBfiltro2()==false){
				sSqlFiltro= " where idCliente = '" + filtro.getValor1() + "'";
			}
			sSql += sSqlFiltro;
			rs = st.executeQuery(sSql);

			if (!rs.next()){
				  System.out.println("Cliente no encontrado");   
			}else {
				cl = new Cliente(rs.getInt("idCliente"), rs.getString("nombres"), rs.getString("apellidos"), rs.getString("empresa"), 
						rs.getString("dui"), rs.getString("nit"), rs.getString("direccion"), rs.getString("municipio"), 
						rs.getString("departamento"), rs.getString("telefono"), rs.getString("celular"), rs.getString("correo"), 
						rs.getString("notas"), rs.getInt("idMunicipiosXDepartamento"));
			}
			
			
			rs.close();
			rs = null;
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		return cl;
	}

	@Override
	public DefaultComboBoxModel listarDepartamentos() {
		// TODO Auto-generated method stub
		DefaultComboBoxModel comboBoxItemList = new DefaultComboBoxModel(); 
		//javax.swing.AbstractListModel comboBoxItemList = new javax.swing.AbstractListModel();

		try{
			Statement st;
			ResultSet rs;
			st = this.cn.createStatement();
			String sSql="SELECT dep.departamento FROM IGallardo.Departamento dep";

			rs = st.executeQuery(sSql);
			while(rs.next()){
				String Item = rs.getString("departamento");
				comboBoxItemList.addElement(Item);
			}
			rs.close();
			rs = null;
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		return comboBoxItemList;
	}

	@Override
	public DefaultComboBoxModel listarMunicipios(Filtro filtro) {
		// TODO Auto-generated method stub
		DefaultComboBoxModel comboBoxItemList = new DefaultComboBoxModel();
		//Map<String,DefaultComboBoxModel> map = new HashMap<String,DefaultComboBoxModel>();
		
		try{
			
			Statement st;
			ResultSet rs;
			st = this.cn.createStatement();
			String sSql="SELECT munxdep.idMunicipioXDepartamento as id, dep.departamento as departamento, mun.municipio as municipio"
					+ " FROM IGallardo.Departamento dep"
					+ " RIGHT JOIN IGallardo.MunicipioXDepartamento munxdep "
					+ " ON dep.idDepartamento = munxdep.Departamento_idDepartamento"
					+ " RIGHT JOIN IGallardo.Municipio mun"
					+ " ON mun.idMunicipio = munxdep.Municipio_idMunicipio";
			
			String sSqlFiltro="";
			if (filtro.isBfiltro1()==true & filtro.isBfiltro2()==false){
				sSqlFiltro= " WHERE munxdep.Departamento_idDepartamento = '" + filtro.getValor1() + "'";
				
			}
			sSql += sSqlFiltro;
			rs = st.executeQuery(sSql);
			while(rs.next()){
				String Key = rs.getString("id");
				String Item = rs.getString("municipio");
				comboBoxItemList.addElement(Item);
				//map.put(Key, comboBoxItemList);
				
			}
				//}
			
			rs.close();
			rs = null;
			
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		//return map;
		return comboBoxItemList;
	}
	
	
	

}
