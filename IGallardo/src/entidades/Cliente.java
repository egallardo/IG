package entidades;

import java.io.Serializable;

/**
 * 
 * @author elmer
 *
 */



public class Cliente implements Serializable {
	private int idCliente;
	private String nombres;
	private String apellidos;
	private String empresa;
	private String dui;
	private String nit;
	private String direccion;
	private String municipio;
	private String departamento;
	private String telefono;
	private String celular;
	private String correo;
	private String notas;
	private int idMunicipioXDepartamento;
	
	public Cliente(){
	
	}

	public Cliente(int idCliente, String nombres, String apellidos,
			String empresa, String dui, String nit,
			String direccion, String municipio, String departamento,
			String telefono, String celular, String correo, String notas,
			int idMunicipioXDepartamento
			) {
		this.idCliente = idCliente;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.empresa = empresa;
		this.dui = dui;
		this.nit = nit;
		this.direccion = direccion;
		this.municipio = municipio;
		this.departamento = departamento;
		this.telefono = telefono;
		this.celular = celular;
		this.correo = correo;
		this.notas = notas;
		this.idMunicipioXDepartamento = idMunicipioXDepartamento;

	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getDui() {
		return dui;
	}

	public void setDui(String dui) {
		this.dui = dui;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNotas() {
		return notas;
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}

	public int getIdMunicipioXDepartamento() {
		return idMunicipioXDepartamento;
	}

	public void setIdMunicipioXDepartamento(int idMunicipioXDepartamento) {
		this.idMunicipioXDepartamento = idMunicipioXDepartamento;
	}

	
}