package entidades;

public class Personal {
	private int idPersonal;
	private String nombres;
	private String apellidos;
	private String codigo;
	private String direccion;
	private String municipio;
	private String departamento;
	private String telefono;
	private String celular;
	private String correo;
	private String notas;
	
	public Personal(){
	}
	
	public Personal(int idPersonal, String nombres, String apellidos,
			String codigo, String direccion, String municipio,
			String departamento, String telefono, String celular,
			String correo, String notas) {
		
		this.idPersonal = idPersonal;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.codigo = codigo;
		this.direccion = direccion;
		this.municipio = municipio;
		this.departamento = departamento;
		this.telefono = telefono;
		this.celular = celular;
		this.correo = correo;
		this.notas = notas;
	}

	public int getIdPersonal() {
		return idPersonal;
	}

	public void setIdPersonal(int idPersonal) {
		this.idPersonal = idPersonal;
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

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
	
	
}